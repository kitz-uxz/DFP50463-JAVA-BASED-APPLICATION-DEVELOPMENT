<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pmis", "root", "");
%>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Username</th>
			<th>Role</th>
			<th>Action</th>
		</tr>
		<%
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT users.ID,username, role_id,rolename FROM users join roles on users.role_id = roles.id");
		while (rs.next()) {
		%>
		<tr>
		<td><%= rs.getInt("id") %></td>
		<td><%= rs.getString("username") %></td>
		<td><%= rs.getString("rolename") %></td>
		<td><a href="editUser.jsp?id=<%= rs.getInt("id") %>">Update</a></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>