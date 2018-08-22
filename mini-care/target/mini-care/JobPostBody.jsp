<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="../Style.css"/>
<body>
<div class="middle2">
<html:form action="Seeker/CaptureJobPost.do" method="post">
<p>Title</p>
<html:text property="title"/>
<html:errors property="title" />
<br/>
<p>Description</p>
<html:textarea property="desc" cols="40" rows="5"></html:textarea>
<br/>
<html:errors property="desc" />
<br/>
<br/>
<html:submit value="Submit"/>
<html:reset value="Reset"/>
</html:form>
</div>
</body>
</html>