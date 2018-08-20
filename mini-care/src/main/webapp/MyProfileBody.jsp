<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<div class="middle">
<html:form action="Sitter/CaptureMyProfile.do" method="post">
<p>Profile Title</p>
<html:text property="ptitle"/>
<html:errors property="ptitle" />
<br/>
<p>Description</p>
<html:textarea property="pdesc"></html:textarea>
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