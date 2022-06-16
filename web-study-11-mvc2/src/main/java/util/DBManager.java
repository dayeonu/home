package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBManager {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context)initContext.lookup("java:/comp/env");

			DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
			conn = ds.getConnection();
			System.out.println("DB연결 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void closeConnection(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			if( rs != null) rs.close();
			if(pstmt != null)pstmt.close();
			if(conn !=null)conn.close();

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//insert, update,delete 작업을 수행한 후 리소스 해제를 위한 메소드
	public static void closeConnection(Connection conn, PreparedStatement pstmt) {
		try {
			if(pstmt != null)pstmt.close();
			if(conn !=null)conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
