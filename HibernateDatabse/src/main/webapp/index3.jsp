<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="Detailsofretrivealall">


<select name="DATARETRIEVAL">
  <option value="Nameall">ALLNAME</option>
  <option value="Allidwithname">ALLIDWITHNAME</option>
</select>

<input type="submit" value="Submit" name="button">
</form>

<br> <br>
<h4>DATA RETRIEVE ALL BY THIS LINK:</h4>
<p><a href="tableoutput.jsp">ALL TABLE DATA</a></p>
<br> <br>
<br> <br>

<form action="DetailsofRetrievalonlybyname">
<h4 style="color:'purple';">RETRIEVE DATA BY NAME</h4>
<br>
<div>
    <label for="Name">Name:</label><br>
    <input type="text"  name="NAME">
 <br>
  <input type="submit" value="submit">
</div>
 <br>
 </form>

<p style="color:'red';">
OuTpUt : ${Resultofretrieve}
</p>
<br>

<p  style="color:'red';">
Percentage is : ${Percentage}
</p>
<%-- 
<table border="1" width="300">
<tr>
	<td width="100">id</td>
	<td width="150">name</td>
</tr>

<%List data = (List) request.getAttribute("x");%>
<%Iterator itr=itr=data.iterator();%>
<% %>for(;itr.hasNext(); )
{
%>
<tr>
	<td width="100"><%=itr.next() %></td>
	<td width="150"><%=itr.next() %></td>
</tr>
<%}%>
</table> --%>
</body>
</html>