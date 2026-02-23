<%@page import="java.net.PasswordAuthentication"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String validUser = "root";
String validPass = "pass";
String validUser2 = "root2";
String validPass2 = "pass2";
String username = request.getParameter("username");
String password = request.getParameter("password");

if(username.equals(validUser) && password.equals(validPass)){
	session.setAttribute("name", username);
	response.sendRedirect("index.jsp");
	
}else if(username.equals(validUser2) && password.equals(validPass2)){
	session.setAttribute("name", username);
	response.sendRedirect("index.jsp");
	
}else{
	response.sendRedirect("error.jsp");
}

%>
</body>
</html>