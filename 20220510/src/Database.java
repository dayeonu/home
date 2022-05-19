import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Database {

		private Connection con; 		// mysql 연결
		private PreparedStatement pstmt; // sql 문장 전송
		private final String URL = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";

		//생성자, 드라이브 등록 : 한번만 하면 됨. 
		public Database() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("서버 접속 성공 입니다.");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		//연결
		public void getConnetion() {
			try {
				con = DriverManager.getConnection(URL,"root","1234");
				System.out.println("서버 로그인아 잘되니");
			}catch(Exception e) {
				e.printStackTrace();		
			}
		}
		
		//연결해제
		public void disConnetion() {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		public void mydbselect(String name) { //원하는 필드만 뽑아오기 메서드(동명이인도 걸러짐)
			try {
				//1. Mysql 연결
				getConnetion();
				
				//2. SQL문장 작성
				String sql = "select* from member where name=? "; // create table 의 이름을 적어야 함. 
				
				//3. MySql 로 SQL 문장 전송
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, name); // 
				
				//4. 실행결과 받아온다. 
				ResultSet rs = pstmt.executeQuery(); 	//  DBMS에게 검색(출력)을 할 때 사용하는 메소드
														//- SELECT 구문 전용 메소드라고 볼 수 있음
														//- 실행시 검색된 결과(Result Set)을 반환
				
				//5. 결과를 출력
				
				while(rs.next()) { // while(rs.next())  문을 사용하면 동명이인 추출, 
								// while문 없이 rs.next() 사용하면  동명이인 걸러짐 
					System.out.println("No" + rs.getInt(1)
										+ ", " + "이름: " + rs.getString(2)
										+ ", " + "성별: "+ rs.getString(3)
										+ ", " + "내용: "+ rs.getString(4) + " ");
				}
			} catch(Exception e) {
					e.printStackTrace();
				}finally {
					disConnetion();
				}
			}
		
			

		public void mydbListData() { // 원하는 no 데이터만 뽑아오는 메서드.
			try {
				//1. Mysql 연결
				getConnetion();
				
				//2. SQL문장 작성
				String sql = "select* from member "; // create table 의 이름을 적어야 함. 
				
				//3. MySql 로 SQL 문장 전송
				pstmt = con.prepareStatement(sql);
				
				//4. 실행결과 받아온다. 
				ResultSet rs = pstmt.executeQuery(); 
				
				//5. 결과를 출력
				
				/*  name varchar(34) not null
				  	sex	 varchar(10) not null,
    				content text,
    				primary key(no) 
				 */
				
				while(rs.next()) {
					System.out.println("No" + rs.getInt(1)
										+ ", " + "이름: " + rs.getString(2)
										+ ", " + "성별: "+ rs.getString(3)
										+ ", " + "내용: "+ rs.getString(4) + " ");
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				disConnetion();
			}
		}
		
		
		// 데이터 추가(Insert)
		public void mydbInsert(int no, String name, String sex, String Content ) { // 2번 문장의 매개변수ㅇ랑 일치해야함 
			
			try {
			
			//1. 연결
				getConnetion();
				
			//2. sql 문장 작성
				String sql = "insert into member(no, name, sex, content ) " //반드시 한칸 띄어야함 
						+ "values(?,?,?,?)";
				
			//3. MySql 로 SQL 문장 전송
			pstmt = con.prepareStatement(sql);
	
			//4. ???? 에 값을 채운다. 
			pstmt.setInt(1, no);
			pstmt.setString(2, name);
			pstmt.setString(3, sex);
			pstmt.setString(4, Content);
			
			//5. 실행
			pstmt.executeUpdate(); //db 값을 변동하는 경우에는 executeUpdate 사용한다.  DMBS에게 출력 이외의 행위(삽입, 수정, 삭제)를 할 때 사용하는 메소드
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally{
				disConnetion();
			}
		}
		
		//데이터 수정
		public void mydbUpdate(int no, String name1, String sex1, String Content1 ) {
			try {

				getConnetion();
				String sql = "update member set name=? , sex=?, content=? "
						+"where no = ?";
				pstmt = con.prepareStatement(sql);
				
				pstmt.setString(1, name1);
				pstmt.setString(2, sex1);
				pstmt.setString(3, Content1); 
				pstmt.setInt(4, no); 
				
				pstmt.executeUpdate(); 
				
			}catch(Exception e) {
				e.printStackTrace();		
			}finally {
				disConnetion();
			}
		}
		
		//데이터 삭제
		public void mydbDelete(int no) {
			try {
				
				getConnetion();
				String sql = "delete from member where no = ? ";
				
				pstmt =con.prepareStatement(sql);
				pstmt.setInt(1, no);
				
				pstmt.executeUpdate();

			}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnetion();
		}
	}
		public static void main(String[] args) {
			Database db = new Database();
			db.getConnetion(); 
			db.mydbListData();
			System.out.println("----------------");
//			db.mydbInsert(14, "쥬다", "여자", "바이");
//			System.out.println("----------------");
			db.mydbUpdate(11, "유다연", "여자","공부하는 중");
			db.mydbListData();
			System.out.println("----------------");
			db.mydbDelete(13);
			System.out.println("----------------");
			db.mydbListData();
			db.mydbselect("이순신");
		}
}