<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.minicare.model.Sitter,com.minicare.dao.SitterDao"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="../Style.css"/>
<%
int id=(Integer)session.getAttribute("id");
String title=SitterDao.getTitle(id);
String desc=SitterDao.getDesc(id);
%>
<body>
<div class="middle">
<html:form action="Sitter/CaptureMyProfile.do" method="post">
<p>Profile Title</p>
<html:text property="ptitle" value="<%=title%>"/>
<html:errors property="ptitle" />
<br/>
<p>Description</p>
<html:textarea property="pdesc" value="<%=desc%>"></html:textarea>
<br/>
<html:errors property="pdesc" />
<br/>
<br/>
<html:submit value="Register"/>
<html:reset value="Reset"/>
</html:form>
</div>
</body>
</html>