<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="Style.css">
<title>Job Post</title>
</head>
<body>
<h1>Welcome to Mini Care</h1>
<div class="middle1">
<span class="button1"><a href="SitterSearch.jsp">Sitter Search</a></span> 
<span class="button1"><a href="JobPost.jsp">Job Post</a></span> 
<span class="button1"><a href="JobApplication.jsp">Job Application</a></span> 
<form action="" method="post">
<p>Title</p>
<input type="text" name="title"/>
<br/>
<p>Description</p>
<textarea name="desc" cols="40" rows="5"></textarea>
<br/>
<br/>
<input type="submit" value="Submit"/>
<input type="reset" value="Reset"/>
</form>
</div>
</body>
</html>