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
%>
<form method="get" action="EmployUpdate.jsp">
Empno:
<input type="text" name="empno"
readonly="readonly" value=<%=e.getEmpno()%> 
/><br/><br/>
Empname:
<input type="text" name="name"
value=<%=e.getName() %> /><br/><br/>
Dept:
<input type="text" name="dept"
value=<%=e.getDept() %> /><br/><br/>
Desig:
<input type="text" name="desig"
value=<%=e.getDesig() %> /><br/><br/>
Basic:
<input type="text" name="basic"
value=<%=e.getBasic() %> /><br/><br/>
<input type="submit" value="update"/>
</form>
<%
if(request.getParameter("empno")!=null&&
request.getParameter("name")!=null&&
request.getParameter("dept")!=null&&
request.getParameter("desig")!=null&&
request.getParameter("basic")!=null){
	 e=new Employ();
	e.setEmpno(Integer.parseInt(request.getParameter("empno")));
	e.setName(request.getParameter("name"));
	e.setDept(request.getParameter("dept"));
	e.setDesig(request.getParameter("desig"));
	e.setBasic(Integer.parseInt(request.getParameter("basic")));
	crud=new EmployCrude();
	out.println(crud.updateEmploy(e));
	%>
	<jsp:forward page="EmployShow.jsp"></jsp:forward>
	<%
	}%>


</body>
</html>