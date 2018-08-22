<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <tiles:insert definition="Layout">
    <tiles:put name="title" value="Login" />
	<tiles:put name="body" value="/LoginBody.jsp" />
</tiles:insert>