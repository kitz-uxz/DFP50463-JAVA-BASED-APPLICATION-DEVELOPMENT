<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<form action="process.jsp" method="post">
        <p>Name: <input type="text" name="name" required/></p>
        <p>Password: <input type="password" name="password" required/></p>
        <p><input type="submit" value="Login"/></p>
    </form>
</body>
</html>