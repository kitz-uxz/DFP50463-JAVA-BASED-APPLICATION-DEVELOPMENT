<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pmis", "root", "");
%>
<html>
<head>
<meta charset="UTF-8">
<title>PMIS | Delete</title>
</head>
<body>
<%
String messageString = request.getParameter("msg");
if(messageString!=null){
%>
<p style="color: blue;"><%=messageString %></p>
<%}
%>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Username</th>
			<th>Role</th>
			<th colspan="2">Action</th>
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
		<td><a href="deleteUser.jsp?id=<%= rs.getInt("id") %>">Delete</a></td>
		<td><a href="editUser.jsp?id=<%= rs.getInt("id") %>">Update</a></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>