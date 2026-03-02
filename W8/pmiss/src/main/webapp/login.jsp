<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<%
String error =request.getParameter("error");
%>
<h2>User Login</h2>

<% if(error != null && error.equals("1")) { %>
    <p style="color:red;">Invalid Username or Password</p>
<% } %>
<form action="login_process.jsp" method="post">
        <p>Username: <input type="text" name="username" style="text-transform: uppercase;" />
</p>
        <p>Password: <input type="password" name="password" required/></p>
        <p><input type="submit" value="Login"/></p>
    </form>
</body>
</html>