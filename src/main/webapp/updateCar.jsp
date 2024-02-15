<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update a Car</title>
</head>
<body>
	
	<form action="updateCar" method="post">
		Owner: <input type="text" name="ownerName" size="25">
		Year: <input type="text" name="year" size="25"> <br>
		Make: <input type="text" name="make" size="25"> <br>
		Model: <input type="text" name="model" size="25"> <br>
		Color: <input type="text" name="color" size="25"> <br>
		
		Enter the current car's owner name: <input type="text" name="oldName" size="25">
		<input type="submit" value="Update"> 
	</form>
</body>
</html>