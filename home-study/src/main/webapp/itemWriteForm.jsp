<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<Form method="post" action="itemWriteResult.jsp">
<table>

<tr>
<td>상품명</td>
<td><input type="text" name="name" size=20 ></td>
</tr>

<tr>
<td>가격</td>
<td><input type="text" name="price" size=20></td>
</tr>

<tr>
<td>상품설명</td> 
<td><textarea name = "description" cols='50' rows="5"></textarea></td>
</tr>

</table>


<input type="submit" value="전송">
<input type="reset" value="취소">

</Form>
</body>
</html>