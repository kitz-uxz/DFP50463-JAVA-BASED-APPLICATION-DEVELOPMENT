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
String userString = request.getParameter("username");
String passString = request.getParameter("password");
String roleString = request.getParameter("role");
%>

String DB_URL ="jdbc:mysql://localhost:3306/lib";
Class.forName("com.sql.cj.jdbc.Driver");

<form action="POST">
  Name:<input type="text" name="username" required ><br>
  Email:<input type="email" name="password" required ><br>
  Password: <input type="password" required><br>
  Role:<select name= "role">
  <option value="admin">Admin</option>
  <option value="admin">Librarian</option>
  <option value="admin">Student</option>
  </select>
  

  
  
  <input type="submit">
</form> 

</body>
</html>