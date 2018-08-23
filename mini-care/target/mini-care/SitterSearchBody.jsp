<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.minicare.dao.SitterDao,java.util.*" %>
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
<%
String zip=session.getAttribute("zip");
session.setAttribute("zip","");
%>
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
<%List<Sitter> res=SitterDao.getSitters(zip);
for(Sitter s:res)
{
	String fname=s.getFname();
	String lname=s.getLname();
	String email=s.getEmail();
	String phno=s.getPhno();
	String zip=s.getZip();
%>
<td><%=fname%></td>
<td><%=lname%></td>
<td><%=email%></td>
<td><%=phno%></td>
<td><%=zip%></td>
<%
}
%>
</tr>
</table>
</div>
</body>
</html>