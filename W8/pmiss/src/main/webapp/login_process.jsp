<%@page import="java.sql.*"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
String username = request.getParameter("username");
String password = request.getParameter("password");

Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pmis","root", "" );

String sql="SELECT *, concat(firstname, ' ', lastname) as fullName FROM pmis.role join users on role.role_id= users.role_id " + " WHERE username=? AND password=?";

PreparedStatement ps = conn.prepareStatement(sql);
ps.setString(1, username);
ps.setString(2, password);

ResultSet rs = ps.executeQuery();

if(rs.next()){
	session.setAttribute("namapengguna", rs.getString("fullName"));
	session.setAttribute("peranan", rs.getString("rolename"));
	response.sendRedirect("dashboard.jsp");
}else{
	response.sendRedirect("login.jsp?error=1");
}
rs.close();
ps.close();
conn.close();
%>
<body>

</body>
</html>