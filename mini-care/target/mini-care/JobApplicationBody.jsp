<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Map,java.util.Set,com.minicare.model.Sitter,com.minicare.dao.SitterDao,com.minicare.dao.UsersDao,java.util.Iterator"%> 
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="../Style.css"/>
<body>
<div class="middle2">
<table border="1">
<tr>
<th>Job Title</th>
<th>First Name</th>
<th>Last Name</th>
<th>Email ID</th>
<th>Phone no</th>
<th>Zip Code</th>
</tr>
<%
Integer id=(Integer)session.getAttribute("id");
String fname=null;
String lname=null;
String email=null;
String phno=null;
String zip=null;
Map<String,Set<Sitter>> res=UsersDao.getJobApplication(id);
if(res!=null)
{
	for(String s:res.keySet())
	{
		Set<Sitter> sets=res.get(s);
		for(Sitter s1:sets)
		{
			fname=SitterDao.getFname(s1);
			lname=SitterDao.getLname(s1);
			email=SitterDao.getEmail(s1);
			phno=SitterDao.getPhno(s1);
			zip=SitterDao.getZip(s1);
%>
<tr>
<td><%=s %></td>
<td><%=fname %></td>
<td><%=lname %></td>
<td><%=email %></td>
<td><%=phno %></td>
<td><%=zip %></td>
</tr>
<%}}}%>
</table>
</div>
</body>
</html>