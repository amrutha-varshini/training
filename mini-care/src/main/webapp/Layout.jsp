<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="Style.css"/>
<title><tiles:getAsString name="title"/></title>
</head>
<body>
<h1><tiles:insert attribute="header"/> </h1>
<tiles:insert attribute="header1" ignore="true"/>
<tiles:insert attribute="body"/>
<div class="footer"><tiles:insert attribute="footer" /></div>
</body>
</html>