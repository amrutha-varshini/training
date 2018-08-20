<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <tiles:insert definition="Sitter">
    <tiles:put name="title" value="Job Search" />
	<tiles:put name="body" value="/JobSearchBody.jsp" />
</tiles:insert>