var userObj;
var numeArtSel;
var comandaId;

var tipAngajat = {
	AV : 'AV',
	SD : 'SD'
};

$(document).on('pagebeforeshow', '#afiscomanda', function() {

	$('#optiuni_div').parent().css('margin-left', '10px');
	$('#optiuni_div').parent().css('margin-right', '10px');

	$('#comenziset').parent().css('margin-left', '10px');
	$('#comenziset').parent().css('margin-right', '10px');

});

$(document).on('pageshow', '#afiscomanda', function() {

	userObj = JSON.parse($('#userbean').text());

	$('#inner_optiuni_div').collapsible("expand");

	initScreen();

});

$(document).on('pagecreate', '#afiscomanda', function() {

	setColapsibleListener();

})

function initScreen() {

	if (userObj.tipAngajat == tipAngajat.SD) {
		$('#rowAgent').show();
		getAgentiListComanda();
	}
}



function setColapsibleListener() {
	$('#comenziset').bind('collapsibleexpand', function(data) {

		var contentId = '#' + data.target.id;

		var position = $(contentId).offset().top;
		$.mobile.silentScroll(position);

		setContentComanda(data.target.id);

	});
}

function setContentComanda(idComanda) {

	comandaId = idComanda;

	getDetaliiComanda(idComanda);

}

function afisListComenzi(listComenzi) {

	if (listComenzi.length == 0) {
		showAlertDialogAfisare('Info', 'Няма поръчки.');
		return;
	}

	$("#comenziset").empty();

	for (var u = 0; u < listComenzi.length; u++) {
		var content = "<div data-role='collapsible' data-content-theme='a' id='"
				+ listComenzi[u].id
				+ "'><h2>"
				+ afisComandaHeader(listComenzi[u])
				+ "</h2><div id='content"
				+ listComenzi[u].id + "'></div></div>";

		$("#comenziset").append(content).collapsibleset("refresh");
	}

}

function getDetaliiComanda(idComanda) {

	$.ajax({
		type : 'GET',
		url : 'getdetcom',
		data : ({
			idCmd : idComanda
		}),
		beforeSend : function() {
			loading('show');
		},
		complete : function() {
			loading('hide');
		},
		success : function(data) {
			afisDetaliiComanda(data);

		},
		error : function(exception) {
			alert('Exeption:' + JSON.stringify(exception));
		}

	});

}

function afisComandaHeader(comanda) {

	var content = '<table data-role="table" id="comenziTable" class="ui-responsive" data-mode="reflow" >';

	content += '<tr>';
	content += '<td style="width:80%"><b>' + comanda.id + '</b></td>';
	content += '</tr>';

	content += '<tr>';
	content += '<td>' + comanda.numeClient + '</td>';
	content += '<td>' + comanda.valoare + '</td>';
	content += '</tr>';

	content += '<tr>';
	content += '<td>' + comanda.dataCreare + '</td>';
	content += '<td></td>';
	content += '</tr>';

	content += '<tr>';
	content += '<td>' + getStareComanda(comanda.stare) + '</td>';
	content += '<td></td>';
	content += '</tr>';

	content += '</table>';

	return content;
}

function cautaComenzi() {

	$('#inner_optiuni_div').collapsible("collapse");

	var cautareComanda = new Object();

	cautareComanda.interval = $("#intervalCautare").val();
	cautareComanda.tipComanda = $("#tipComanda").val();
	cautareComanda.codAngajat = userObj.codPers;

	cautaComandaService(cautareComanda);

}

function cautaComandaService(cautareComanda) {

	$.ajax({
		type : 'GET',
		url : 'getComAfis',
		data : cautareComanda,
		beforeSend : function() {
			loading('show');
		},
		complete : function() {
			loading('hide');
		},
		success : function(data) {
			afisListComenzi(data);
		},

	});

}

function afisDetaliiComanda(detaliiComanda) {

	var swatch = [ '#f2f2f2', '#FFF0F5' ];

	var listArticole = $('<ul></ul>', {

	}).attr('data-role', 'listview').attr('data-inset', 'true');

	for (var u = 0; u < detaliiComanda.listArticole.length; u++) {

		var articol = $('<li></li>', {
			html : afisArticolComanda(detaliiComanda.listArticole[u], u)
		}).css("background-color", swatch[u / 2]);

		$(listArticole).append(articol);

	}

	var dateLivrare = $('<div></div>').append('<br>');

	$(dateLivrare).append(afisdateGeneraleComanda(detaliiComanda.dateGenerale));

	$(dateLivrare).append(afisdateLivrareComanda(detaliiComanda.dateLivrare));

	$(dateLivrare).append(listArticole);

	var contentId = '#content' + comandaId;

	$(contentId).html(dateLivrare).enhanceWithin();

}

function afisArticolComanda(articol, poz) {

	var articoleTable = $('<table></table>').attr({
		id : "articoleAfisTable",
		width : "100%",
		border : "0"

	}).addClass('articoleAfis');

	var row = $('<tr></tr>').appendTo(articoleTable);

	$('<td></td>').attr('style', 'width:2%').attr({
		style : 'align:left'
	}).text((poz + 1) + '').appendTo(row);

	$('<td></td>').attr('style', 'width:80%').attr('style', 'font-weight:bold')
			.text(articol.nume).appendTo(row);
	$('<td></td>').attr({
		style : 'width:10%;text-align:right;'
	}).text(articol.cantitate.valoare).appendTo(row);
	$('<td></td>').text(articol.cantitate.um).appendTo(row);

	row = $('<tr></tr>').appendTo(articoleTable);
	$('<td></td>').attr('style', 'width:2%').appendTo(row);
	$('<td></td>').attr('style', 'width:80%').text(articol.cod).appendTo(row);
	$('<td></td>').attr({
		style : 'width:10%;text-align:right;'
	}).text(articol.pretUnitar).appendTo(row);
	$('<td></td>').text('BGN').appendTo(row);

	row = $('<tr></tr>').appendTo(articoleTable);
	$('<td></td>').attr('style', 'width:2%').appendTo(row);
	$('<td></td>').text(articol.depozit).appendTo(row);
	$('<td></td>').attr({
		style : 'width:10%;text-align:right;'
	}).text(articol.procReducere).appendTo(row);
	$('<td></td>').text('%').appendTo(row);

	return articoleTable;
}

function afisdateGeneraleComanda(dateGenerale) {

	var dateGeneraleTable = $('<table></table>').attr({
		id : "dateLivrareTable",
		width : "100%",
		border : "0"

	}).addClass('dateLivrareAfis');

	var row = $('<tr></tr>').appendTo(dateGeneraleTable);
	$('<td></td>').attr('colspan', '2').attr('style', 'font-weight:bold').text(
			'Date generale').appendTo(row);

	row = $('<tr></tr>').appendTo(dateGeneraleTable);
	$('<td></td>').attr('style', 'width:25%').text('Comanda SAP').appendTo(row);
	$('<td></td>').text(dateGenerale.nrComandaSap).appendTo(row);

	row = $('<tr></tr>').appendTo(dateGeneraleTable);
	$('<td></td>').html('<br>').appendTo(row);

	return dateGeneraleTable;

}

function afisdateLivrareComanda(dateLivrare) {

	var dateLivrTable = $('<table></table>').attr({
		id : "dateLivrareTable",
		width : "100%",
		border : "0"

	}).addClass('dateLivrareAfis');

	var row = $('<tr></tr>').appendTo(dateLivrTable);
	$('<td></td>').attr('colspan', '2').attr('style', 'font-weight:bold').text(
			'Дата доставка').appendTo(row);

	row = $('<tr></tr>').appendTo(dateLivrTable);
	$('<td></td>').attr('style', 'width:5%').text('Област').appendTo(row);
	$('<td></td>').text(getNumeJudet(dateLivrare.adresaLivrare.numeJudet))
			.appendTo(row);

	row = $('<tr></tr>').appendTo(dateLivrTable);
	$('<td></td>').attr('style', 'width:5%').text('Населено място').appendTo(row);
	$('<td></td>').text(dateLivrare.adresaLivrare.localitate).appendTo(row);

	row = $('<tr></tr>').appendTo(dateLivrTable);
	$('<td></td>').attr('style', 'width:25%').text('Улица').appendTo(row);
	$('<td></td>').text(dateLivrare.adresaLivrare.strada).appendTo(row);

	row = $('<tr></tr>').appendTo(dateLivrTable);
	$('<td></td>').attr('style', 'width:25%').text('Лице за контакт').appendTo(
			row);
	$('<td></td>').text(dateLivrare.persoanaContact).appendTo(row);

	row = $('<tr></tr>').appendTo(dateLivrTable);
	$('<td></td>').attr('style', 'width:25%').text('Tелефон').appendTo(row);
	$('<td></td>').text(dateLivrare.telPersContact).appendTo(row);

	return dateLivrTable;

}

function getStareComanda(intStare) {

	var retVal = "";

	switch (Number(intStare)) {
	case -1:
		retVal = "Поръчката не е запазена.";	//Comanda nu a fost salvata
		break;

	case 0:
		retVal = "Издаена поръчка.";	//Comanda emisa
		break;

	case 1:
		retVal = "Поръчка в процес на одобрение.";
		break;

	case 2:
		retVal = "Одобрена поръчка.";	//Comanda aprobata
		break;

	case 3:
		retVal = "Неодобрена поръчка.";	//Comanda respinsa
		break;

	case 4:
		retVal = "Поръчка с условия.";	//Comanda supusa unor conditii
		break;

	case 6:
		retVal = "Изтрита поръчка.";	//Comanda stearsa
		break;

	case 7:
		retVal = "Cmd. angaj. aprobata.";
		break;

	case 8:
		retVal = "Cmd. angaj. respinsa.";
		break;

	case 9:
		retVal = "Comanda invalida. Stoc insuficient.";
		break;

	case 10:
		retVal = "Comanda invalida datorita limitei de credit.";
		break;

	case 15:
		retVal = "Comanda facturata.";
		break;

	case 20:
		retVal = "Comanda simulata cu rezervare stoc.";
		break;

	case 21:
		retVal = "Comanda simulata fara rezervare stoc.";
		break;

	case 30:
		retVal = "Comanda nealocata pe borderou";
		break;

	case 31:
		retVal = "Comanda alocata pe borderou";
		break;

	}
	return retVal;
}

$(document).ready(function() {
	$('#afisMainLink').click(function() {

		// return false;
	});
});

function showAlertDialogAfisare(tipAlert, mesajAlert) {

	$('#tipAlertA').text(tipAlert);
	$('#textAlertA').text(mesajAlert);
	$.mobile.changePage('#dialogAfisare', {
		transition : "none"
	});
}

function loading(showOrHide) {
	setTimeout(function() {
		$.mobile.loading(showOrHide);
	}, 1);
}
