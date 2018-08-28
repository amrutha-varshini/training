<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="../Style.css"/>
<body>
<c:forEach var="i" begin="1" end ="7">
	<c:out value="${i}"/>
</c:forEach>
</body>
</html>