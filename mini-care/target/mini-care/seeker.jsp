<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%
String message=(String)request.getAttribute("message");
%>
<meta charset="UTF-8">
<link rel="stylesheet" href="Style.css">
<title>Seeker Login</title>
</head>
<body>
<h1>Welcome to Mini Care</h1>
<div class="middle">
<% if(message!=null) {%> <p><%=message %></p><%} %>
<form action="Seeker.do" method="post">
<p>Username</p>
<input type="email" name="ID" required/>
<br/>
<p>Password</p>
<input type="password" name="pwd" required/>
<br/>
<br/>
<input type="submit" value="Login"/>
<input type="reset" value="Reset"/>
<br/>
<a style="color:black" href="Register.jsp?member=seeker">New user? Register here</a>
</form>
</div>
</body>
</html>