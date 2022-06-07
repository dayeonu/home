package com.saeyan.dao;

import java.sql.Connection;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

 

public class MemberDAO {
	private MemberDAO() {
		
	}
	//ΩÃ±€≈Ê ∆–≈œ,,, 
	private static MemberDAO instance = new MemberDAO();
	
	public static MemberDAO getInstance() {
		
		return instance;
	}
	
	public Connection getConcConnection() throws Exception{
		Connection conn = null;
		javax.naming.Context initContext = new InitialContext();
		Context envContext = (Context)initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
		conn = ds.getConnection();
		return conn;
	}
}
