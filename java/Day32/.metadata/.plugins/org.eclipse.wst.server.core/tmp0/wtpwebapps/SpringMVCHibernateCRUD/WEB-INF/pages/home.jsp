<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Management Screen</title>
</head>
<body>
	<div align="center">
		<h1>Employee List</h1>
		
		<table border="1">

			<th>rollno</th>
			<th>name</th>
			<th>Age</th>
			<th>gender</th>
		

			<c:forEach var="student" items="${listStudent}">
				<tr>

					<td>${student.Rollno}</td>
					<td>${student.Name}</td>
					<td>${student.Age}</td>
					<td>${student.Gender}</td>
					<td><a href="editStudent?id=${student.id}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp;
						 <a href="deleteStudent?id=${student.id}">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
		<h4>
			New Employee Register <a href="newStudent">here</a>
		</h4>
	</div>
</body>
</html>