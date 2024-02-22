<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Adding a Car</title>
</head>
<body>
	<form action="addCar" method="post">
	
		Garage Name: <input type="text" name="garageName" size="25">
		Owner: <input type="text" name="ownerName" size="25"> <br>
		Year: <input type="text" name="year" size="25"> <br>
		Make: <input type="text" name="make" size="25"> <br>
		Model: <input type="text" name="model" size="25"> <br>
		Color: <input type="text" name="color" size="25"> <br>
		
		<input type="submit" value="Submit">
	</form>

</body>
</html>