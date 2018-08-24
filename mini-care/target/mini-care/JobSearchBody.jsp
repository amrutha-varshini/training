<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.minicare.dao.SitterDao,com.minicare.dao.UsersDao,java.util.List,com.minicare.dao.SeekerJobDao,com.minicare.model.SeekerJob,java.util.Set"%>
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
<br/>
</html:form>
</div>
<%String zip=(String)session.getAttribute("zip");
session.setAttribute("zip",null);
int id=(Integer)session.getAttribute("id");%>
<div class="middle1">
<table border="1">
<tr>
<th>Job title</th>
<th>Description</th>
<th>Zip Code</th>
<th>Status</th>
</tr>
<tr>
<%
String title=null;
String desc=null;
List<SeekerJob> res;
if(zip!=null)
{
res=SeekerJobDao.getJob(Integer.parseInt(zip));
}
else
{
res=SeekerJobDao.getJob();
}
if(res!=null)
{
	System.out.println(res.size());
	for(SeekerJob s:res)	
	{
		System.out.println("I am being executed1");
		int flag=0;
		title=SeekerJobDao.getTitle(s);
		desc=SeekerJobDao.getDesc(s);
		int uid=SeekerJobDao.getUserid(s);
		zip=UsersDao.getZip(uid);
%>
<td><%=title%></td>
<td><%=desc%></td>
<td><%=zip%></td>
<%
		Set<SeekerJob> s1=SitterDao.getJob(id);
		System.out.println("I am being executed2");
		if(false)
		{
			System.out.println("s1 not null with"+s1.size());
			for(SeekerJob j:s1)
			{
				if(SeekerJobDao.getSjid(j)==SeekerJobDao.getSjid(s))
				{
					flag=1;
					break;
				}
			}
		}
		System.out.println("I am being executed3");
		if(flag==1)
		{System.out.println("I am being executed4");
%>
<td>applied</td>
<%
		}
		else
		{System.out.println("I am being executed5");
			Integer jobid=SeekerJobDao.getSjid(s);
			String sjid=jobid.toString();
%>
<td>
<html:form action="Sitter/CaptureApply.do">

</html:form>
</td>
<%
		}
%>
</tr>
<%
}}
%>
</table>
</div>
</body>
</html>