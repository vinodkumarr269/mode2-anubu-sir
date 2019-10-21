<%@page import="com.hcl.hib.Employ"%>
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
	int empno=Integer.parseInt(request.getParameter("empno"));
EmployCrude crud=new EmployCrude();
Employ e=crud.searchEmploy(empno);
if(e!=null){
	out.println("Name is :  "+e.getName());
	out.println("Dept is : "+e.getDept());
	out.println("Desig is : "+e.getDesig());
	out.println("Basic is : "+e.getBasic());
	
}
else{
	out.println("not found");
}
%>
</body>
</html>