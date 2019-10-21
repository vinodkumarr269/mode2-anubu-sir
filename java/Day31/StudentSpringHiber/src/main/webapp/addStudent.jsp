<%@page import="java.util.Date"%>
<%@page import="com.hcl.studentsphn.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" 
    prefix="sf"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sf:form action="/addStudent" method="get" modelAttribute="student">
<center>
<table>
RollNo:
<sf:input type="text" path="Rollno"/><br/><br/>
Spath:
<sf:input type="text" path="SName"/><br/><br/>
Age:
<sf:input type="text" path="Age"/><br/><br/>
gender:
<sf:input type="radio" path="Gender" value="male"/>male<br/><br/>
<sf:input type="radio" path="Gender" value="female"/>female<br/><br/>
Country:
<sf:select path="Country">
<sf:option value="India">india</sf:option><br/><br/>
<sf:option value="us">us</sf:option><br/><br/>
<sf:option value="uk">uk</sf:option><br/><br/>
</sf:select><br/><br/>
DOJ:
<sf:input type="Date" path="DateOfJoin"/><br/><br/>
Final Score:
<sf:input type="text"  path="FinalScore"/><br/>

<input type="submit" value="add"/>
</table>
</center>
</sf:form>

</body>
</html>