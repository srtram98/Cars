<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Car Info Program</title>
</head>
<body>
	<h1>Select what you would like to do:</h1>
	<a href="addCar.jsp">Add a Car</a>
	<a href="deleteCar.jsp">Delete a Car</a>
	<a href="updateCar.jsp">Update a Car</a>
	<form action="viewCars" method="get">
		<input type="submit" value="View All Cars">
	</form>
</body>
</html>