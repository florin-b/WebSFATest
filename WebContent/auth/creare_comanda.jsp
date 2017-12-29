<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Afisare comanda</title>



<meta name="viewport" content="width=device-width, initial-scale=1">




<link rel="stylesheet"
	href="https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css">
<script src="https://code.jquery.com/jquery-1.11.3.min.js"></script>



<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/smoothness/jquery-ui.css">

<script src="//code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

<script
	src="https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>

<style>
.greybackcolor {
	background: yellow;
}

#pretTable, #stocTable {
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#pretTable td, #pretTable th {
	padding: 8px;
}

#stocTable td, #stocTable th {
	padding: 8px;
}

#pretTable th, #stocTable th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #4CAF50;
	color: white;
}

#art_com_table, #datelivrare_table, #clientTable {
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}


#clientTable td, #clientTable th {
	padding: 8px;
}

#art_com_table td, #art_com_table th {
	padding: 8px;
}

#datelivrare_table td, #datelivrare_table th {
	padding: 8px;
}



#art_com_table tr:nth-child(even) {
	background-color: #f2f2f2;
}

#datelivrare_table tr:nth-child(even) {
	background-color: #f2f2f2;
}



#art_com_table th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #4CAF50;
	color: white;
}

#datelivrare_table th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #4CAF50;
	color: white;
}


</style>

</head>


<body>

	<div data-role="page" id="crearecomanda" data-theme="a" data-url="">


		<div data-role="panel" data-display="overlay" data-position="left"
			id="left-panel" data-theme="a">
			<ul data-role="listview">
				<jsp:include page="navbar.jsp">
					<jsp:param name="tipuser" value="${user.tipAngajat}" />
					<jsp:param name="numeuser" value="${user.nume}" />
				</jsp:include>
			</ul>
		</div>
		<div data-role="header" data-theme="a">
			<h1>Creare comanda</h1>
			<a href="#left-panel" data-theme="d" data-icon="arrow-r"
				data-iconpos="notext" data-shadow="false" data-iconshadow="false"
				class="ui-icon-nodisc">Meniu</a>
		</div>


		<div data-role="content" class="ui-content">



			<div data-role="collapsible-set" data-content-theme="d"
				id="select_client_div">
				<div data-role="collapsible" id="inner_optiuni_div"
					data-content-theme="c">
					<h4>Client</h4>

					<div>

						<div class="ui-grid-a ui-responsive">
							<div class="ui-block-a"></div>

							<div class="ui-block-b" id="alegeClntDiv">
								<input type="button" name="alegeClnt" id="alegeClnt"
									value="Cauta client" />
							</div>
						</div>




						<div class="ui-grid-a ui-responsive" id='divCautaClient'>
							<div class="ui-block-a" style='padding-right: 50px;'>
								<input id="numeClient" data-type="search">
							</div>

							<div class="ui-block-b" style='padding-left: 50px;'>
								<input type="button" name=cautaClient id="cautaClient"
									value="Cauta" />
							</div>
						</div>


						<div data-role="collapsible-set" data-iconpos="right"
							id="clientiset"></div>





					</div>
				</div>
			</div>

			<br>

			<div id='clientComanda'></div>

			<br>

			<div data-role="collapsible-set" data-content-theme="d"
				id="select_articole_div">
				<div data-role="collapsible" id="inner_optiuni_articole_div"
					data-content-theme="c">
					<h4>Articole</h4>

					<div>

						<div class="ui-grid-a ui-responsive">
							<div class="ui-block-a">
								<form>
									<fieldset data-role="controlgroup" data-type="horizontal">

										<input type="radio" name="radio-articol" id="radio-cod"
											value="cod" checked="checked"> <label for="radio-cod">Cod
											articol</label> <input type="radio" name="radio-articol"
											id="radio-nume" value="nume"> <label for="radio-nume">Nume
											articol</label>
									</fieldset>
								</form>
							</div>

							<div class="ui-block-b" style='padding-left: 50px;'>
								<select name="select-depoz" id="select-depoz">
									<option value="V1">Vanzare 1</option>
									<option value="V2">Vanzare 2</option>
									<option value="V3">Vanzare 3</option>
									<option value="D1">Deteriorate 1</option>
									<option value="D2">Deteriorate 2</option>
									<option value="D3">Deteriorate 3</option>
								</select>
							</div>
						</div>

						<div class="ui-grid-a">
							<div class="ui-block-a" style='padding-right: 50px;'>
								<input id="codArticol" data-type="search">
							</div>
							<div class="ui-block-b" style='padding-left: 50px;'>

								<input type="button" name="cautaArticol" id="cautaArticol"
									value="Cauta" />

							</div>
						</div>

						<br>

						<div data-role="collapsible-set" data-iconpos="right"
							id="articoleset"></div>

						<br> <br>

					</div>
				</div>
			</div>

			<br>

			<table data-role="table" data-mode="reflow" class="ui-responsive"
				id="art_com_table">
				<thead>
					<tr>
						<th>Articol</th>
						<th style='text-align: right;'>Cantitate</th>
						<th>Um</th>
						<th style='text-align: right;'>Pret</th>
						<th style='text-align: right;'>Reducere (%)</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
				</tbody>
			</table>

			<br> <br>

			<div data-role="collapsible-set" data-content-theme="d"
				id="livrare_div">
				<div data-role="collapsible" id="inner_livrare_div"
					data-content-theme="c">
					<h4>Date livrare</h4>

					<div>
						<table data-role="table" data-mode="reflow" class="ui-responsive"
							id="datelivrare_table" >
							<thead>
								<tr>
									<td></td>
								</tr>
							</thead>

							<tbody>
								<tr>
									<td style="width: 25%">Judet</td>
									<td><input id="numeJudet" data-type="text"></td>
								</tr>


								<tr>
									<td>Localitate</td>
									<td><input id="localitate" data-type="text"></td>
								</tr>

								<tr>
									<td>Strada</td>
									<td><input id="strada" data-type="text"></td>
								</tr>

								<tr>
									<td>Persoana de contact</td>
									<td><input id="persContact" data-type="text"></td>
								</tr>

								<tr>
									<td>Telefon</td>
									<td><input id="telPersContact" data-type="text"></td>
								</tr>

								<tr>
									<td>Tip reducere</td>
									<td><select id="selectTipReducere">
											<option value="1">1 factura (reducere in pret)</option>
											<option value="2">2 facturi</option>
											<option value="3">1 factura (reducere separat)</option>
									</select></td>
								</tr>

								<tr>
									<td>Document insotitor</td>
									<td><select id="selectDocInsotitor">
											<option value="1">Factura</option>
											<option value="2">Aviz de expeditie</option>
									</select></td>
								</tr>


								<tr>
									<td>Plata</td>
									<td><select id="selectPlata">
											<option value="B">Bilet la ordin</option>
											<option value="C">Cec</option>
											<option value="E">Plata in numerar</option>
											<option value="O">Ordin de plata</option>
									</select></td>
								</tr>

								<tr>
									<td>Responsabil incasare</td>
									<td><select id="selectResponsabil">
											<option value="AV">Agent vanzari</option>
											<option value="SO">Sofer</option>
											<option value="OF">Operator facturare</option>
									</select></td>
								</tr>

								<tr>
									<td>Transport</td>
									<td><select id="selectTransport">
											<option value="TRAP">Arabesque</option>
											<option value="TCLI">Client</option>
											<option value="TFRN">Furnizor</option>
									</select></td>
								</tr>


								<tr>
									<td>Data livrare</td>
									<td><input id="dataLivrare" type="text"
										readonly="readonly"
										style="position: relative; z-index: 100000;" /></td>
								</tr>

								<tr>
									<td>Observatii livrare</td>
									<td><input id="obsLivrare" data-type="text"></td>
								</tr>

							</tbody>

						</table>


					</div>
				</div>
			</div>


			<br> <input type="button" name="salveazaComanda"
				id="salveazaComanda" value="Salveaza comanda" />






		</div>
	</div>

	<div id="userbean" style="visibility: hidden">${userjson}</div>

	<script src="<c:url value="/resources/scripts/creeaza_comanda.js" />"></script>

	<script
		src="<c:url value="/resources/scripts/creeaza_comanda_articole.js" />"></script>

	<script
		src="<c:url value="/resources/scripts/creeaza_comanda_livrare.js" />"></script>



</body>
</html>