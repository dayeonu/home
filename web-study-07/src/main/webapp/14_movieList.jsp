<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL과 JSTL</title>
</head>
<body>

<%
String[] movieList = {"타이타닉","시네마천국","혹성탈출","킹콩"};
pageContext.setAttribute("movie", movieList);
%>
<table border="1" style="width:100%; text-align:center;">
	<c:forEach var="movie" items="${movie}" varStatus="status">
	${status.index}&nbsp;&nbsp;
	${status.count}&nbsp;&nbsp;
	${movie}<br>
	</c:forEach>
	</table>
</body>
</html>