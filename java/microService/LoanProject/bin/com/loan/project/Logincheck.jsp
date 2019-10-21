<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@page import ="java.sql.*" %>
<%@page import ="java.io.IOException" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<%@page import="java.io.*"%>
    <html> 
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Login Check</title> 
        </head> 
        <body> 
            <%
            String username = request.getParameter("username");
            String password = request.getParameter("password");
           
            String dbURL = "jdbc:mysql://localhost:3306/LoanProject";
            String dbuser = "root";
            String dbpassword = "root";
            Connection theConnection = null;
            PreparedStatement theStatement = theConnection.prepareStatement("select * from USER where username=? and password=?");
            try{
            Class.forName("com.mysql.jdbc.Driver");
            }catch(Exception ex){
            System.out.println("Class Not Found");
            }
            try{
            theConnection = DriverManager.getConnection(dbURL, dbuser, dbpassword);
            }catch(Exception ex){
            System.out.println("Connection Error");
            }
            try{
                theStatement.setString(1,request.getParameter("username"));
                theStatement.setString(2,request.getParameter("password"));
                ResultSet theResult = theStatement.executeQuery();
                if(theResult.next()){
            response.sendRedirect("menu.jsp");
        }

            }catch(Exception ex){
            System.out.println("Statement Error");
            }


            %>
    </body> 
    </html>
</body>
</html>