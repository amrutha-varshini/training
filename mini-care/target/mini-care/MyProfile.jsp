<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="Style.css">
<title>My Profile</title>
</head>
<body>
<h1>Welcome to Mini Care</h1>
<div class="middle3">
<span class="button1"><a href="JobSearch.do">Job Search</a></span> 
<span class="button1"><a href="MyProfile.do">My Profile</a></span> 
<span class="button1"><a href="Logout.do">Logout</a></span>
<br/>
<br/>
</div>
<div class="middle">
<html:form action="CaptureMyProfile.do" method="post">
<p>Profile Title</p>
<html:text property="ptitle"/>
<html:errors property="ptitle" />
<br/>
<p>Description</p>
<html:textarea property="pdesc"></html:textarea>
<html:errors property="pdesc" />
<br/>
<br/>
<html:submit value="Register"/>
<html:reset value="Reset"/>
</html:form>
</div>
</body>
</html>