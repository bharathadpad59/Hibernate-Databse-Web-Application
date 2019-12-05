<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<html>
<body style="background-color:'pink';">

<h2 style="color:'red';"> ${LoginStatus}  </h2>
<form action="Authentication">
<br>
<br>

<h4 style="color:'orange';">ADMIN LOGIN:</h4>
<div>
    <label for="username">Username:</label><br>
    <input type="text"  name="username">
</div>

<div>
    <label for="pass">Password (8 characters minimum):</label><br>
    <input type="password" name="password"
           minlength="8" required>
</div>

<input type="submit" value="Sign in">
<br>
<br>
<br>





</form>

</body>
</html>
