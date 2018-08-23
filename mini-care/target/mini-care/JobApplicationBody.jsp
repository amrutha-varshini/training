<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
Integer id=session.getAttribute("id");
Map<String,Set<Sitter>> res=com.minicare.dao.UsersDao.getJobApplication(id);
for(String s:res.keyset())
{
	Set<Sitter> set=res.get(s);
	for(Sitter s1:set)
	{
		String fname=s1.getFname();
		String lname=s1.getLname();
		String email=s1.getEmail();
		String phno=s1.getPhno();
		String zip=s1.getZip();
%>
<tr>
<td><%=s%></td>
<td><%=fname%></td>
<td><%=lname%></td>
<td><%=email%></td>
<td><%=phno%></td>
<td><%=zip%></td>
<%
	}
}
%>
</tr>
</table>
</div>
</body>
</html>