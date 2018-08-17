<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="Style.css">
<title>Job Search</title>
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
<html:form action="CaptureZipSitter.do" method="post">
<html:hidden property="member" value="sitter"/>
<p>Enter Zipcode</p>
<html:text property="zip"/>
<html:errors property="zip" />
<br/>
<br/>
<html:submit value="Submit"/>
<html:reset value="Reset"/>
<br/>
<br/>
</html:form>
</div>
 <div class="middle1">
<table border="1">
<tr>
<th>Job title</th>
<th>Description</th>
<th>Zip Code</th>
<th>Status</th>
</tr>
<tr>
<td>bla</td>
<td>bla</td>
<td>bla</td>
<td>
<form action="" method="post">
<input type="submit" value="Apply"/>
</form>
</td>
</tr>
</table>
</div>
</body>
</html>