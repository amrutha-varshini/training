<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List,com.minicare.dao.SitterDao,com.minicare.model.Sitter"%>
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
<%String zip=(String)session.getAttribute("zip");
session.setAttribute("zip",null);%>
<div class="middle2">
<table border="1">
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email ID</th>
<th>Phone no</th>
<th>Zip Code</th>
</tr>
<%
String fname=null;
String lname=null;
String email=null;
String phno=null;
List<Sitter> res;
if(zip!=null)
{
	res=SitterDao.getSitters(Integer.parseInt(zip));
	System.out.println("I am in zip not null");
}
else
{
	res=SitterDao.getSitters();
	System.out.println("I am in zip null");
}
if(res!=null)	
{
	System.out.println("I am in res"+res.size());
	for(Sitter s:res)
	{
		System.out.println("I am in for loop");
		fname=SitterDao.getFname(s);
		lname=SitterDao.getLname(s);
		email=SitterDao.getEmail(s);
		phno=SitterDao.getPhno(s);
		zip=SitterDao.getZip(s);
%>
<tr>
<td> <%=fname%></td>
<td> <%=lname%></td>
<td> <%=email%></td>
<td> <%=phno%></td>
<td> <%=zip%></td>
</tr>
<%
	}
}
%>
</table>
</div>
</body>
</html>