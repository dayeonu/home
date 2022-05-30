<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> JSTL </title>
</head>
<body>
	<form method="post" action="exam09_login.jsp">
		아이디&nbsp;&nbsp;&nbsp;&nbsp;: <input type="text" name="id" id="userid"> <br> 
		패스워드&nbsp;: <input type="password" name="pwd" id="userpwd"><br>  <!-- 별표로 표시해줌  -->
	
		<input type=radio name="admin" value= "1"> 사용자 
		<input type=radio name= "admin" value= "2"> 관리자 <br>
		
	<hr><br>
		<input type="submit" value="로그인">
	 
	</form>
 
</body>
</html>