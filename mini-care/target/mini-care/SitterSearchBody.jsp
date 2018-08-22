<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="../Style.css"/>
<body>
<div class="middle">
<html:form action="Seeker/CaptureZip.do" method="post">
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