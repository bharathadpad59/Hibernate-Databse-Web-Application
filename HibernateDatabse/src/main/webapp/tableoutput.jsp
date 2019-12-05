<%@page import="oracle.net.aso.e"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*,com.bharat.hibernateproject.*,org.hibernate.*,org.hibernate.cfg.*" %>  
<%! int id,MathsMarks,ScienceMarks,EnglishMarks,HistoryMarks,GeographyMarks,KannadaMarks,year_of_passout;double Percentage;String name,favsubject,nativeplace,skills; Session session1 = null; %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table width="220" border="1">  
<tr><th>ID</th><th>NAME</th><th>FAVSUB</th><th>SKILLS</th><th>NATIVE</th><th>PERCENTAGE</th><th>YOP</th><th>MATHS</th>
<th>ENGLISH</th><th>SCIENCE</th><th>HISTORY</th><th>GEOGRAPHY</th><th>KANNADA</th></tr>                       
<%  
Configuration cnf= new Configuration().configure().addAnnotatedClass(UserClass.class); 
SessionFactory sf=cnf.buildSessionFactory(); 
session1=sf.openSession(); 				  
Query q1=session1.createQuery("from UserClass");		  
Iterator itr = q1.iterate();
while(itr.hasNext())
{
	UserClass u1 = (UserClass)itr.next();
	id=u1.getId();
	MathsMarks=u1.getMathsMarks();
	ScienceMarks=u1.getScienceMarks();
	EnglishMarks=u1.getEnglishMarks();
	HistoryMarks=u1.getHistoryMarks();
	GeographyMarks=u1.getGeographyMarks();
	KannadaMarks=u1.getKannadaMarks();
	name=u1.getName();
	favsubject=u1.getFavsubject();
	skills=u1.getSkills();
	nativeplace=u1.getNativeplace();
	Percentage=u1.getPercentage();
	year_of_passout=u1.getYear_of_passout();

%>                    
<tr>  
<td><%=id%></td>  
<td><%=name%></td>  
<td><%=favsubject%></td>  
<td><%=skills%></td>
<td><%=nativeplace%></td>  
<td><%=Percentage%></td>  
<td><%=year_of_passout%></td>
<td><%=MathsMarks%></td>  
<td><%=EnglishMarks%></td>  
<td><%=ScienceMarks%></td>  
<td><%=HistoryMarks%></td>
<td><%=GeographyMarks%></td>
<td><%=KannadaMarks%></td>
</tr>  
<% }
session1.close();  
%>


</body>
</html>