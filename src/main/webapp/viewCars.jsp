<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Cars</title>
</head>
<body>
	<h1>List of Cars</h1>
	<table>
		<c:forEach items="${requestScope.carList}" var="currentCar">
			<tr>
				<td>Owner: ${currentCar.ownerName} | </td>
				<td>Year: ${currentCar.year} | </td>
				<td>Make: ${currentCar.make} | </td>
				<td>Model: ${currentCar.model} | </td>
				<td>Color: ${currentCar.color}</td>
			</tr>
		</c:forEach> 
	</table>
	<br>
	<a href="index.jsp">Home</a>
</body>
</html>