import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Database {

		private Connection con; 		// mysql ����
		private PreparedStatement pstmt; // sql ���� ����
		private final String URL = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";

		//������, ����̺� ��� : �ѹ��� �ϸ� ��. 
		public Database() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("���� ���� ���� �Դϴ�.");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		//����
		public void getConnetion() {
			try {
				con = DriverManager.getConnection(URL,"root","1234");
				System.out.println("���� �α��ξ� �ߵǴ�");
			}catch(Exception e) {
				e.printStackTrace();		
			}
		}
		
		//��������
		public void disConnetion() {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		public void mydbselect(String name) { //���ϴ� �ʵ常 �̾ƿ��� �޼���(�������ε� �ɷ���)
			try {
				//1. Mysql ����
				getConnetion();
				
				//2. SQL���� �ۼ�
				String sql = "select* from member where name=? "; // create table �� �̸��� ����� ��. 
				
				//3. MySql �� SQL ���� ����
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, name); // 
				
				//4. ������ �޾ƿ´�. 
				ResultSet rs = pstmt.executeQuery(); 	//  DBMS���� �˻�(���)�� �� �� ����ϴ� �޼ҵ�
														//- SELECT ���� ���� �޼ҵ��� �� �� ����
														//- ����� �˻��� ���(Result Set)�� ��ȯ
				
				//5. ����� ���
				
				while(rs.next()) { // while(rs.next())  ���� ����ϸ� �������� ����, 
								// while�� ���� rs.next() ����ϸ�  �������� �ɷ��� 
					System.out.println("No" + rs.getInt(1)
										+ ", " + "�̸�: " + rs.getString(2)
										+ ", " + "����: "+ rs.getString(3)
										+ ", " + "����: "+ rs.getString(4) + " ");
				}
			} catch(Exception e) {
					e.printStackTrace();
				}finally {
					disConnetion();
				}
			}
		
			

		public void mydbListData() { // ���ϴ� no �����͸� �̾ƿ��� �޼���.
			try {
				//1. Mysql ����
				getConnetion();
				
				//2. SQL���� �ۼ�
				String sql = "select* from member "; // create table �� �̸��� ����� ��. 
				
				//3. MySql �� SQL ���� ����
				pstmt = con.prepareStatement(sql);
				
				//4. ������ �޾ƿ´�. 
				ResultSet rs = pstmt.executeQuery(); 
				
				//5. ����� ���
				
				/*  name varchar(34) not null
				  	sex	 varchar(10) not null,
    				content text,
    				primary key(no) 
				 */
				
				while(rs.next()) {
					System.out.println("No" + rs.getInt(1)
										+ ", " + "�̸�: " + rs.getString(2)
										+ ", " + "����: "+ rs.getString(3)
										+ ", " + "����: "+ rs.getString(4) + " ");
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				disConnetion();
			}
		}
		
		
		// ������ �߰�(Insert)
		public void mydbInsert(int no, String name, String sex, String Content ) { // 2�� ������ �Ű��������� ��ġ�ؾ��� 
			
			try {
			
			//1. ����
				getConnetion();
				
			//2. sql ���� �ۼ�
				String sql = "insert into member(no, name, sex, content ) " //�ݵ�� ��ĭ ������ 
						+ "values(?,?,?,?)";
				
			//3. MySql �� SQL ���� ����
			pstmt = con.prepareStatement(sql);
	
			//4. ???? �� ���� ä���. 
			pstmt.setInt(1, no);
			pstmt.setString(2, name);
			pstmt.setString(3, sex);
			pstmt.setString(4, Content);
			
			//5. ����
			pstmt.executeUpdate(); //db ���� �����ϴ� ��쿡�� executeUpdate ����Ѵ�.  DMBS���� ��� �̿��� ����(����, ����, ����)�� �� �� ����ϴ� �޼ҵ�
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally{
				disConnetion();
			}
		}
		
		//������ ����
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
		
		//������ ����
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
//			db.mydbInsert(14, "���", "����", "����");
//			System.out.println("----------------");
			db.mydbUpdate(11, "���ٿ�", "����","�����ϴ� ��");
			db.mydbListData();
			System.out.println("----------------");
			db.mydbDelete(13);
			System.out.println("----------------");
			db.mydbListData();
			db.mydbselect("�̼���");
		}
}