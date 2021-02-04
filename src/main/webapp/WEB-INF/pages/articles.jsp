<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Système de facturation - Articles</title>
<%@include file="commons/header.jsp"%>

</head>
<body>

	<%@include file="commons/menu.jsp"%>

	<div class="container">
		<div class="row">
			<h3 class="blue-text">Liste des produits</h3>
		</div>
		<div class="row">
			<table>
				<thead>
					<tr>
						<th>N°</th>
						<th>Nom du produit</th>
						<th>prix</th>
					</tr>
				</thead>

				<tbody>
					<c:if test="${listArticles.isEmpty()}">
						<td>Pas d'articles</td>
					</c:if>
					<c:if test="${!listArticles.isEmpty()}">
						<c:forEach var="article" items="${listArticles}">
							<tr>
								<td><c:out value="${article.codeBarre}"></c:out></td>
								<td><c:out value="${article.nom}"></c:out></td>
								<td><c:out value="${article.prix}"></c:out></td>
							</tr>
						</c:forEach>
					</c:if>
				</tbody>
			</table>
		</div>
		<div class="row">
			<div class="col right">
				<a href="articles?action=create" class="btn blue">Ajouter un
					produit</a>
			</div>
		</div>
	</div>

	<%@include file="commons/footer.jsp"%>
</body>
</html>