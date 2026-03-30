<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit User</title>
</head>
<body>
<%
    
    String uName = "", uEmail = "", uPassword = "";
    int uId = 0, uRoleID = 0; 
    String idParam = request.getParameter("id");

    if (idParam != null) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pmis","root","");

          
            String sql = "SELECT * FROM users WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(idParam));
            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                uId = rs.getInt("id");
                uName = rs.getString("username");
                uRoleID = rs.getInt("role_id");
                uEmail = rs.getString("email");
                uPassword = rs.getString("password"); 
            }

          
            String roleSQL = "SELECT * FROM roles";
            PreparedStatement rolesPS = conn.prepareStatement(roleSQL);
            ResultSet rolesRS = rolesPS.executeQuery();
%>

    <h2>Edit User</h2>
    <form action="update.jsp" method="post">
        
        <input type="hidden" name="userid" value="<%=uId %>">

        <label>Username</label> 
        <input name="username" type="text" value="<%=uName%>"><br>

        <label>Email</label>
        <input name="email" type="text" value="<%=uEmail %>"><br>

        <label>Password</label>
        <input name="password" type="password" value="<%=uPassword %>"><br>

        <label>Role</label>
        <select name="role_id">
            <% while(rolesRS.next()){ 
                int roleId = rolesRS.getInt("id");
                String roleName = rolesRS.getString("rolename");
                String isSelected = (roleId == uRoleID) ? "selected" : "";
            %>
                <option value="<%=roleId%>" <%=isSelected %>>
                    <%= roleName %>
                </option>
            <% } %>
        </select>
        <br><br>
        <button type="submit">Update User</button>
    </form>

<% 
            conn.close();
        } catch (Exception e) {
            out.print("Error: " + e.getMessage());
        }
    } else {
        out.print("No user ID provided.");
    }
%>
</body>
</html>
