<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="AddCourse.jsp" >
Subject:
<select>
<option value="C" >C Programming</option>
<option value="C++" >C++</option>
<option value="java" >Java</option>
<option value="html" >HTML</option>
<option value="springs" >Springs</option>


</select>
Theory:
<input type="text"  name="theory"/><br/><br/>
Practical:
<input type="text"  name="practical"/><br/><br/>
Year:
<input type="text"  name="year"/><br/><br/>
Instructor:
<input type="text"  name="instructor"/><br/><br/>
<input type="submit"  value="add"/>

</form>

</body>
</html>