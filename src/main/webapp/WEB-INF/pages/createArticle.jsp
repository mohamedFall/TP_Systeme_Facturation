<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Système de facturation - Ajouter un article</title>
<%@include file="commons/header.jsp"%>

</head>
<body>

	<%@include file="commons/menu.jsp"%>

	<div class="container">
		<div class="row">
			<h3 class="blue-text">Ajouter un article</h3>
		</div>
		<div class="row">
			<form action="articles" method="post" class="col s12">
				<div class="row">
					<div class="input-field col s6">
						<input placeholder="Nom de l'article" id="nom" name="nom" type="text" class="validate">
						<label for="nom">Nom</label>
					</div>
					<div class="input-field col s6">
						<input id="code_barre" placeholder="Code barre de l'article" name="code_barre" type="text" class="validate"> 
						<label for="code_barre">Code barre</label>
					</div>
					<div class="input-field col s6">
						<input id="prix" placeholder="Prix de l'article" name="prix" type="text" class="validate"> 
						<label for="prix">Prix</label>
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