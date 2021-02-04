<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Système de facturation - Ajouter un client</title>
<%@include file="commons/header.jsp"%>

</head>
<body>

	<%@include file="commons/menu.jsp"%>

	<div class="container">
		<div class="row">
			<h3 class="blue-text">Ajouter un client</h3>
		</div>
		<div class="row">
			<form action="clients" method="post" class="col s12">
				<div class="row">
					<div class="input-field col s6">
						<input placeholder="Nom du client" name="nom" id="nom" type="text" class="validate">
						<label for="nom">Nom</label>
					</div>
					<div class="input-field col s6">
						<input id="adresse" placeholder="Adresse du client" name="adresse" type="text" class="validate"> 
						<label for="adresse">Adresse</label>
					</div>
				</div>
				<div class="row">
					<div class="col right">
						<input type="submit" class="btn blue" value="Ajouter">
					</div>
				</div>
			</form>
		</div>
	</div>

<%@include file="commons/footer.jsp"%>
</body>
</html>