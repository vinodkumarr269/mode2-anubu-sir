<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Management Screen</title>
</head>
<body bgcolor="yellow">
	<div align="center">
		<form:form action="searchEmployee" modelAttribute="searchEmployee" method="POST" >
	Emp Name:
  <form:input path="empName"/> 
         AND
	Band:
  <form:select path="band">
  <form:option value="0">None</form:option>
 
  <form:option value="E">E</form:option>
  <form:option value="C">C</form:option>
  <form:option value="M">M</form:option>
   </form:select>
  <br/><br/>
  Salary:
   <form:input path="salary" />
  <br/><br/>
  <input type="submit" value="search">
  </form:form>
		<h1>Employ List</h1>
		
		<table border="1" bgcolor="green">
		
			<th>EmpName</th>
			<th>Salary</th>
			<th>band</th>
			<th>dateOfJoin</th>
			<c:forEach var="employee" items="${listemployee}">
				<tr >
					
					<td>${employee.empName}</td>
					<td>${employee.salary}</td>
					<td>${employee.band}</td>
					<td>${employee.dateOfJoin}</td>
					<td><a href="editStudent?id=${student.id}">Edit</a>&nbsp;&nbsp;&nbsp;&nbsp; 
					    <a href="deleteStudent?id=${student.id}">Delete</a>&nbsp;&nbsp;&nbsp;&nbsp;
						<a href="exam/showExam?sid=${student.id}">Marks</a></td> 
				</tr>
			</c:forEach>
		</table>
		
		
	</div>
</body>
</html>