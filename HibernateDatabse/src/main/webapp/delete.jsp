<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:'maroon';">
<h3 style="color:'red';">   ${Result} </h3>
<br><br>


<form action="delete">
<h4 style="color:'purple';">TYPE ID TO DELETE DATA FROM DATABASE:</h4>
<br> <br>
<div class="col-4">
    <label for="Id">Id:</label><br>
    <input type="text"  name="ID">
</div>
<br>
<input type="submit" value="Submit" name="button">
</form>
</body>
</html>