<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="http://localhost:8080/mini-care/Style.css"/>
<body>
<div class="button">
<form action="http://localhost:8080/mini-care/Visitor/Login.do" method="post">
<input type="hidden" name="member" value="seeker"/>
<input type="submit" value="Seeker"/>
</form>
</div>
<div class="button">
<form action="http://localhost:8080/mini-care/Visitor/Login.do" method="post">
<input type="hidden" name="member" value="sitter"/>
<input type="submit" value="Sitter"/>
</form> 
</div>
</body>
</html>