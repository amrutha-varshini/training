<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<div class="middle">
<html:form action="Sitter/CaptureZip.do" method="post">
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