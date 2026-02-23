<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cafe Board</title>
</head>
<body>
<%
String user = request.getParameter("user");
if(user == "" ){
	user = "Admin";
}
else{
	user = "Administrator";
}
%>
<%= user %>
</body>
</html>