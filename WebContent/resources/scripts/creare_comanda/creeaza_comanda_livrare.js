$(document).on('pagecreate', '#crearecomanda', function() {

	initDateField();

});

function initDateField() {

	$("#dataLivrare").datepicker({

		dateFormat : "dd-mm-yy"

	});

}

$('#salveazaDateLivrare').click(
		function() {

			if ($('#divDateLivrare').css('display') == 'none') {
				$('#divDateLivrare').show();
				afisSalveazaCmdButton();
			}

			var dateLivrare = getDateLivrare();

			if (!valideazaDateLivare(dateLivrare))
				return;

			if (dateLivrare.codJudet != null) {
				$('#numeJudetAfis').text(getNumeRegiune(dateLivrare.codJudet));
				$("#rowJudetAfis").show();
			}

			if (dateLivrare.localitate != null) {
				$('#localitateAfis').text(dateLivrare.localitate);
				$('#rowLocalitateAfis').show();
			}

			if (dateLivrare.strada != null) {
				$('#stradaAfis').text(dateLivrare.strada);
				$('#rowStradaAfis').show();
			}

			if (dateLivrare.persContact != null) {
				$('#persContactAfis').text(dateLivrare.persContact);
				$('#rowPersContactAfis').show();
			}

			if (dateLivrare.telPersContact != null) {
				$('#telPersContactAfis').text(dateLivrare.telPersContact);
				$('#rowTelefonAfis').show();
			}

			if (dateLivrare.tipReducere != null) {
				$('#tipReducereAfis').text(
						getTipReducereText(dateLivrare.tipReducere));
				$('#rowTipReducereAfis').show();
			}

			$('#docInsotitorAfis').text(
					getDocInsotitorText(dateLivrare.documentInsotitor));
			$('#rowDocInsotitorAfis').show();

			$('#plataAfis').text(getTipPlataText(dateLivrare.tipPlata));
			$('#rowPlataAfis').show();

			$('#responsabilAfis').text(
					getRespIncasareText(dateLivrare.respIncasare));
			$('#rowRespIncasareAfis').show();

			$('#transportAfis').text(getTipTranspText(dateLivrare.tipTransp));
			$('#rowTransportAfis').show();

			if (dateLivrare.dataLivrare != null) {
				$('#dataLivrareAfis').text(dateLivrare.dataLivrare);
				$('#rowDataLivrareAfis').show();
			}

			if (dateLivrare.obsLivrare != null) {
				$('#obsLivrareAfis').text(dateLivrare.obsLivrare);
				$('#rowObsLivrareAfis').show();
			}

			resetSelectOptions();

		});

function getTipReducereText(tipReducere) {

	var strTipReducere;

	if (tipReducere == 1)
		strTipReducere = 'ФАКТУРА (ОТСТЪПКА В ЦЕНАТА)';
	else if (tipReducere == 2)
		strTipReducere = 'ДВЕ ФАКТУРИ';
	else if (tipReducere == 3)
		strTipReducere = 'ЕДНА ФАКТУРА';

	return strTipReducere;

}

function getDocInsotitorText(tipDocument) {

	var strTipDocument;

	if (tipDocument == 1)
		strTipDocument = 'Фактура';
	else if (tipDocument == 2)
		strTipDocument = 'Протокол';

	return strTipDocument;

}

function getTipPlataText(tipPlata) {

	var strTipPlata;

	if (tipPlata == 'B')
		strTipPlata = 'Bilet la ordin';
	else if (tipPlata == 'C')
		strTipPlata = 'Cec';
	else if (tipPlata == 'E')
		strTipPlata = 'Плащане в брой';
	else if (tipPlata == 'O')
		strTipPlata = 'Платежно нареждане';

	return strTipPlata;

}

function getRespIncasareText(tipResp) {

	var strTipResp;

	if (tipResp == 'AV')
		strTipResp = 'Търговски агент';
	else if (tipResp == 'SO')
		strTipResp = 'Шофьор';
	else if (tipResp == 'OF')
		strTipResp = 'Оператор фактуриране';

	return strTipResp;

}

function getTipTranspText(tipTransp) {

	var strTipTransp;

	if (tipTransp == 'TRAP')
		strTipTransp = 'Будмакс';
	else if (tipTransp == 'TCLI')
		strTipTransp = 'Клиент';
	else if (tipTransp == 'TFRN')
		strTipTransp = 'Furnizor';

	return strTipTransp;

}
