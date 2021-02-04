<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Système de facturation - Clients</title>
<%@include file="commons/header.jsp"%>

</head>
<body>

	<%@include file="commons/menu.jsp"%>

	<div class="container">
		<div class="row">
			<h3 class="blue-text">Liste des clients</h3>
		</div>
		<div class="row">
			<table>
				<thead>
					<tr>
						<th>Nom</th>
						<th>Adresse</th>
					</tr>
				</thead>

				<tbody>
					<c:if test="${listClients.isEmpty()}">
						<td>Pas de clients</td>
					</c:if>
					<c:if test="${!listClients.isEmpty()})">
						<c:forEach var="client" items="${listClients}">
							<tr>
								<td><c:out value="${client.nom}"></c:out></td>
								<td><c:out value="${client.adresse}"></c:out></td>
							</tr>
						</c:forEach>
					</c:if>
				</tbody>
			</table>
		</div>
		<div class="row">
			<div class="col right">
				<a href="clients?action=create" class="btn blue">Ajouter un
					client</a>
			</div>
		</div>
	</div>

	<%@include file="commons/footer.jsp"%>
</body>
</html>