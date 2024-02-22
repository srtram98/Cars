<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View a Garage</title>
</head>
<body>
	<h1>List of Garages and Cars</h1>
	<table>
		<c:forEach items="${requestScope.allGarages}" var="currentGarage">
			<tr>
				<td>Garage: ${currentGarage.name} | </td>
			</tr>
			<c:forEach items="${currentGarage.cars}" var="currentCar">
				<tr>
					<td>     Owner: ${currentCar.ownerName} | </td>
					<td>Year: ${currentCar.year} | </td>
					<td>Make: ${currentCar.make} | </td>
					<td>Model: ${currentCar.model} | </td>
					<td>Color: ${currentCar.color}</td>
				</tr>
			</c:forEach> 
		</c:forEach> 
	</table>
	<br>
	<a href="index.jsp">Home</a>
	
</body>
</html>