<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body  style="background-color:'yellow';">

<h2  style="color:'red';"> ${LoginStatus} </h2>
<br>

<form action="Datahandling">
<select name="DATA">
  <option value="Insertingdata">INSERT</option>
  <option value="Retrivingdata">RETRIEVE</option>
   <option value="Updatedata">UPDATE</option>
  <option value="Deletedata">DELETE</option>
</select>
<input type="submit" value="Submit" name="button">
</form>



</body>
</html>