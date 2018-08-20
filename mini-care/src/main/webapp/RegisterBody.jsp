<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="../Style.css"/>
<%
String member=request.getParameter("member");
System.out.println(member);
%>
<body>
<div class="middle">
<html:form action="Visitor/CaptureRegister.do" method="post">
<html:hidden property="member" value="<%=member %>"/>
<p>First Name</p>
<html:text property="fname"/>
<html:errors property="fname" />
<br/>
<p>Last Name</p>
<html:text property="lname"/>
<html:errors property="lname" />
<br/>
<p>Email</p>
<html:text property="userID"/>
<html:errors property="userID" />
<br/>
<p>Password</p>
<html:password property="pwd"/>
<html:errors property="pwd" />
<br/>
<p>Phone Number in the format (ddd)ddd-dddd</p>
<html:text property="phno"/>
<html:errors property="phno" />
<br/>
<p>Zip Code</p>
<html:text property="zip"/>
<html:errors property="zip" />
<br/>
<br/>
<html:submit value="Register"/>
<html:reset value="Reset"/>
</html:form>
</div>
</body>
</html>