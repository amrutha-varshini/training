<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%
String message=(String)request.getAttribute("message");
String member=request.getParameter("member");
%>
<meta charset="UTF-8">
<link rel="stylesheet" href="Style.css">
<title>Seeker Login</title>
</head>
<body>
<h1>Welcome to Mini Care</h1>
<div class="middle">
<% if(message!=null) {%> <p><%=message %></p><%} %>
<html:form action="CaptureLogin.do" method="post">
<html:hidden property="member"  value="<%=member %>"/>
<p>Username</p>
<html:text property="userID" />
<html:errors property="userID" />
<br/>
<p>Password</p>
<html:password property="pwd" />
<html:errors property="pwd" />
<br/>
<br/>
<html:submit value="Login"/>
<html:reset value="Reset"/>
<br/>
<a style="color:black" href="Register.do?member=<%=member %>">New user? Register here</a>
</html:form>
</div>
</body>
</html>