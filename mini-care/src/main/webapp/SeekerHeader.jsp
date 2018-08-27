<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="http://localhost:8080/mini-care/Style.css"/>
<body>
<div class="middle4">
<%
String fname=(String)session.getAttribute("fname");
String lname=(String)session.getAttribute("lname");%>
<p>Hi <%=fname %> <%=lname %> </p>
<br/>
<span class="button1"><a href="../Seeker/SitterSearch.do">Sitter Search</a></span> 
<span class="button1"><a href="../Seeker/JobPost.do">Job Post</a></span> 
<span class="button1"><a href="../Seeker/JobApplication.do">Job Application</a></span> 
<span class="button1"><a href="../Seeker/Logout.do?invalidate=true">Delete Account</a></span>
<span class="button1"><a href="../Seeker/Logout.do">Logout</a></span>
<br/>
<br/>
</div>
</body>
</html>