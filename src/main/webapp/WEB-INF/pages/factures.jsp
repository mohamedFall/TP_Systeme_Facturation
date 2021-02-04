<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Système de facturation - Factures</title>
<%@include file="commons/header.jsp"%>

</head>
<body>

	<%@include file="commons/menu.jsp"%>

	<div class="container">
		<div class="row">
			<h3 class="blue-text">Liste des factures</h3>
		</div>
		<div class="row">
			<table>
				<thead>
					<tr>
						<th>N°</th>
						<th>Date</th>
						<th>Client</th>
						<th>Prix</th>
					</tr>
				</thead>

				<tbody>
					<c:if test="${listFactures.isEmpty()}">
						<td>Pas de factures</td>
					</c:if>
					<c:if test="${!listFactures.isEmpty()}">
						<c:forEach var="facture" items="${listFactures}">
							<tr>
								<td>FC-1000</td>
								<td><c:out value="${facture.date}"></c:out></td>
								<td><c:out value="${facture.client.nom}"></c:out></td>
								<td><c:out value="${facture.prix}"></c:out></td>
							</tr>
						</c:forEach>
					</c:if>
				</tbody>
			</table>
		</div>
	</div>

<%@include file="commons/footer.jsp"%>
</body>
</html>