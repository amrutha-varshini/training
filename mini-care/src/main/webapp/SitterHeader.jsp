<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="../Style.css"/>
<body>
<div class="middle2">
<%
 String fname=(String)session.getAttribute("fname");
String lname=(String)session.getAttribute("lname");%>
<p>Hi <%=fname %> <%=lname %></p>
<br/>
<span class="button1"><a href="../Sitter/JobSearch.do">Job Search</a></span> 
<span class="button1"><a href="../Sitter/MyProfile.do">My Profile</a></span> 
<span class="button1"><a href="../Sitter/Logout.do?invalidate=true">Delete Account</a></span>
<span class="button1"><a href="../Sitter/Logout.do">Logout</a></span>
<br/>
<br/>
</div>
</body>
</html>