<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="jakarta.tags.core" prefix="c" %>
    <%@ page import=" java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL-CORE</title>
</head>
<body>
<h1>JSTL Core Tags</h1>
<c:forEach var="a" begin="1" end="10">
<c:out value="${a }"></c:out><br>
</c:forEach>
<%
List<String> listNames=Arrays.asList("R","vi","s","f");
%>
</body>
</html>