<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div align="center">
        <h1>Mark</h1>
        <form:form action="addMarks1" method="Post" modelAttribute="exam">
        <table>
           <tr>
                <td>ID:</td>
                <td><form:input path="id"  /></td>
            </tr>
             <tr>
                <td>SubjectName:</td>
                <td><form:input path="subjectname" /></td>
            </tr>
            <tr>
                <td>mark:</td>
                <td><form:input path="mark" /></td>
            </tr>
            <tr>
                <td>StudentId:</td>
                <td><form:input path="studentid" /></td>
            </tr>
               </table><br/><br/>
               <input type="submit" value="addMarks">
        </form:form>
        </div>
</body>
</html>