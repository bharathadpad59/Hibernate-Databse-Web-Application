<%@page import="oracle.net.aso.e"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*,com.bharat.hibernateproject.*,org.hibernate.*,org.hibernate.cfg.*" %>  
<%! int id;String name;Session session1 = null; %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table width="220" border="1">  
<tr><th>ID</th><th>NAME</tr>                       
<%  
Configuration cnf= new Configuration().configure().addAnnotatedClass(UserClass.class); 
SessionFactory sf=cnf.buildSessionFactory(); 
session1=sf.openSession(); 				  
Query q1=session1.createQuery("select id,name from UserClass ");			  
Iterator itr = q1.iterate();
while(itr.hasNext())
{
	UserClass u1 = (UserClass)itr.next();
	id=u1.getId();
	name=u1.getName();
%>                    
<tr>  
<td><%=id%></td>  
<td><%=name%></td>  
</tr>  
<% }
session1.close();  
%>


</body>
</html>