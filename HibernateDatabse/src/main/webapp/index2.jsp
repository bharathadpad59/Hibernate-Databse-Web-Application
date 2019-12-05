<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>

<body style="background-color:'yellow';">
<div style="margin-left:2rem !important;">
<h1  style="color:'red';"> ${Result} </h1>
<br><br>
<h2  style="color:'blue';"> Percentage:${Percentage} </h2>
<br><br>


<form  action="Detailsofinsertion" id="detailsinsertion">
<div class="row">
<div class="col-4">
    <label for="Name">Name:</label><br>
    <input type="text"  name="NAME">
</div>

 <div class="col-4">
    <label for="Id">Id:</label><br>
    <input type="text"  name="ID">
</div>

 <div class="col-4">
    <label for="Skills">Skills:</label><br>
    <input type="text"  name="SKILLS">
</div>
</div>

<div class="row">
<div  class="col-4">
    <label for="YEAR_OF_PASSOUT">YEAR_OF_PASSOUT:</label><br>
    <input type="text"  name="YEAR_OF_PASSOUT">
</div>

 <div  class="col-4">
    <label for="NATIVE_PLACE">NATIVE_PLACE:</label><br>
    <input type="text"  name="NATIVE_PLACE">
</div>

 <div  class="col-4">
    <label for="FAVSUBJECT">FAVSUBJECT:</label><br>
    <input type="text"  name="FAVSUBJECT">
</div>
</div>
<div class="row">
<div  class="col-4">
    <label for="MathsMarks">MathsMarks:</label><br>
    <input type="number"  name="MathsMarks">
</div>  
<br>
<div  class="col-4">
    <label for="ScienceMarks">ScienceMarks:</label><br>
    <input type="number"  name="ScienceMarks">
</div>
<br>
<div  class="col-4">
    <label for="EnglishMarks">EnglishMarks:</label><br>
    <input type="number"  name="EnglishMarks">
</div>
</div>
<br>
<div class="row">
<div  class="col-4">
    <label for="HistoryMarks">HistoryMarks:</label><br>
    <input type="number"  name="HistoryMarks">
</div>
<br>
<div  class="col-4">
    <label for="GeographyMarks">GeographyMarks:</label><br>
    <input type="number"  name="GeographyMarks">
</div>
<br>
<div  class="col-4">
    <label for="KannadaMarks">KannadaMarks:</label><br>
    <input type="number"  name="KannadaMarks">
</div>
</div>

<div class="row" style="margin-left:1rem !important;">

 
 
 <br>
 <br>

  <input type="submit" value="submit" onclick="con()">

</div>

</form>
</div>
</body>
<!-- <script type="text/javascript">
function con(){
	var conf = confirm("Are you sure?");
	if(conf == true){
		document.getElementById("detailsinsertion").submit();
		}
	else{
			windows.reload();
		}
}
</script> -->
</html>