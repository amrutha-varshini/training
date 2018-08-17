<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="Style.css">
<title>Sitter Search</title>
</head>
<body>
<h1>Welcome to Mini Care</h1>
<div class="middle2">
<span class="button1"><a href="SitterSearch.do">Sitter Search</a></span> 
<span class="button1"><a href="JobPost.do">Job Post</a></span> 
<span class="button1"><a href="JobApplication.do">Job Application</a></span> 
<span class="button1"><a href="Logout.do">Logout</a></span>
<br/>
<br/>
</div>
<div class="middle">
<html:form action="CaptureZipSeeker.do" method="post">
<html:hidden property="member" value="seeker"/>
<p>Enter Zipcode</p>
<html:text property="zip" />
<html:errors property="zip" />
<br/>
<br/>
<html:submit value="Submit"/>
<html:reset value="Reset"/>
<br/>
<br/>
</html:form>
</div>
<div class="middle2">
<table border="1">
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email ID</th>
<th>Phone no</th>
<th>Zip Code</th>
</tr>
<tr>
<td>bla</td>
<td>bla</td>
<td>bla</td>
<td>bla</td>
<td>bla</td>
</tr>
</table>
</div>
</body>
</html>