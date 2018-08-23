<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="../Style.css"/>
<body>
<div class="middle">
<html:form action="Sitter/CaptureZip.do" method="post">
<p>Enter Zipcode</p>
<html:text property="zip"/>
<html:errors property="zip" />
<br/>
<br/>
<html:submit value="Submit"/>
<html:reset value="Reset"/>
<br/>
<%
String zip=session.getAttribute("zip");
session.setAttribute("zip","");
%>
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
<%List<SeekerJob> res=com.minicare.dao.SeekerJobDao.getJob(zip);
for(SeekerJob s:res)
{
	int flag=0;
	String title=s.getTitle();
	String desc=s.getDesc();
	com.minicare.model.Users user=com.minicare.dao.UsersDao.getUser(id);
	String zip=user.getZip();
%>
<td><%=title%></td>
<td><%=desc%></td>
<td><%=zip%></td>
<td>
<%
	Set<SeekerJob> s1=s.getJob();
	for(SeekerJob j:s1)
	{
		if(j.getSjid().equals(s.getSjid()))
		{
			flag=1;
			break;
		}
	}
	if(flag==1)
	{
%>
applied</td>
<%
	}
	else
	{
%>
<html:form action="Sitter/CaptureApply.do" method="post">
<html:hidden property="id" value="<%=s.getSjid()%>"/>
<html:submit value="Apply"/>
</html:form>
</td>
<%
}
%>
</tr>
</table>
</div>
</body>
</html>