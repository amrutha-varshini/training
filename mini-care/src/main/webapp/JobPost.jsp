<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
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
<div class="middle2">
<span class="button1"><a href="SitterSearch.do">Sitter Search</a></span> 
<span class="button1"><a href="JobPost.do">Job Post</a></span> 
<span class="button1"><a href="JobApplication.do">Job Application</a></span> 
<span class="button1"><a href="Logout.do">Logout</a></span>
<html:form action="CaptureJobPost.do" method="post">
<p>Title</p>
<html:text property="title"/>
<html:errors property="title" />
<br/>
<p>Description</p>
<html:textarea property="desc" cols="40" rows="5"></html:textarea>
<html:errors property="desc" />
<br/>
<br/>
<html:submit value="Submit"/>
<html:reset value="Reset"/>
</html:form>
</div>
</body>
</html>