<!--  별짓 다 해봤는데도 결과값이 안나오면 sql에서 commit 안한것일수도있다~~  -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
<% 
Connection conn = null;
Statement stmt = null;
ResultSet rs = null; // sql문 수행하기 위해서 변수 선언 conn,stmt,rs

String url = "jdbc:oracle:thin:@localhost:1521:XE"; // sql문 수행하기 위해서 변수 선언 url,id,pwd,sql
String uid = "system";
String pwd = "1234";
String sql = "select * from member";
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 테이블 사이즈 넣기 ,보더 공부 할 것 -->
	<table width='800' border='1'>
		<tr>
			<th>이름</th>
			<th>아이디</th>

		</tr>
<%
	try{
		/* JDBC를 이용해서 데이터베이스에 연결하는 방법 4단계를 기재한다. 해당 절차는 암기해 둘 것!!! */
		/* JDBC 드라이버 로드 / 데이터 베이스와 연결 / SQL문 실행 */
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		//class.forName() 메소드에 드라이버 클래스이름을 지정하면~ jdbc드라이버가 로드되어 driverManager에 등록된다. 이 매니저는 드라이버만 관리한다. 얘 덕에 오라클 접속이 가능하게 되는 것!
		conn = DriverManager.getConnection(url, uid, pwd);
		//이 드라이버매니저에 있는 Connection객체를 get해서 쓰면 데이터베이스에 연결해 작업을 수행할 수 있도록 만들어준다. 아주 중요한 놈이다!
		stmt = conn.createStatement();
		//conn객체로 접근해서 createStatement()메소드를 호출한다. 그러면, stmt에 메소드 결과값이 저장된다.
		rs = stmt.executeQuery(sql);
		//executeQuery는 sql의 select문과 같이 결과 값이 여러개의 레코드로 구해질 때 사용한다.
		//해당 페이지에는 "select * from member"; 결과값을 구하는 거니까, executeQuery(sql);로 사용한 것임.
		//이 외의 경우 executeUpdate(); 로 사용한다. 그리고 결과값을 ResultSet으로 받게 된다.
	
	//데이터베이스에 저장된 모든 정보를 얻어오기 위해서 반복문을 타서 컬럼 단위로 데이터를 얻어온다.	
	// 문자열로 선언된 컬럼이라서 getString을 사용했다. 만약 정수형태라면 getInt 겠지?
	while(rs.next()){ 
		out.print("<tr>"); // <tr>을 해야 테이블 안에 데이터가 들어간다. 
		out.print("<th>"+rs.getString("name")+"<th>");
		out.print(rs.getString("userid")); // 위처럼 <th> 를 안쓰면 테이블 밖으로 출력됨 
		
	} //while문의 끝 
	}catch(Exception e){	
		e.printStackTrace();
	}finally{
		try{
			if( rs != null) rs.close();
			if( stmt != null) stmt.close();
			if( conn != null) conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}//finally의 끝
%>
	</table>
</body>
</html>