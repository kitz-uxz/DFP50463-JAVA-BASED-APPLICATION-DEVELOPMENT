<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>

<%
    
    String idParam = request.getParameter("userid");
    String userString = request.getParameter("username");
    String emailParam = request.getParameter("email");    
    String passParam = request.getParameter("password"); 
    String roleId = request.getParameter("role_id");

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pmis","root","");

       
        String sql = "UPDATE users SET username=?, email=?, password=?, role_id=? WHERE id=?";
        PreparedStatement ps = conn.prepareStatement(sql);

      
        ps.setString(1, userString);
        ps.setString(2, emailParam);
        ps.setString(3, passParam);
        ps.setInt(4, Integer.parseInt(roleId));
        ps.setInt(5, Integer.parseInt(idParam));

        ps.executeUpdate();
        conn.close();
        
        response.sendRedirect("manageUsers.jsp");
    } catch (Exception e) {
        out.print("Error: " + e.getMessage());
    }
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Updating...</title>
</head>
<body>
</body>
</html>
