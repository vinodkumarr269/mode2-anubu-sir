<%@page import="com.hcl.hib.EmployCrude"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
if(request.getParameter("empno") !=null){
	int empno=Integer.parseInt(request.getParameter("empno"));
	EmployCrude crud=new EmployCrude();
	out.println(crud.deleteEmploy(empno));
	
%>	
<jsp:forward page="EmployShow.jsp"></jsp:forward>
<%
}
%>

</body>
</html>