<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%request.setAttribute("member","seeker" );
request.setAttribute("member","sitter" );%>
<body>
<div class="button">
<a href="Visitor/SeekerLogin.do">Seeker</a>
</div> 
<br/>
<div class="button">
<a href="Visitor/SitterLogin.do">Sitter</a>
</div> 
</body>
</html>