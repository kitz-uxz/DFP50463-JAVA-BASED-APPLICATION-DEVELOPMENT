<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Drink Promo</title>
</head>
<body>
<%
String[] drinks = {"Latte", "Matcha","Mocha"};
Random rand = new Random();
String drink  = drinks[rand.nextInt(drinks.length)];
%>

<h3>Today's Special: <%= drink %></h3>

<%for(int i=1; i<=5; i++){ %>
	<p>Promo#<%= i %> - Enjoy your drink!</p>
<% } %>

</body>
</html>
