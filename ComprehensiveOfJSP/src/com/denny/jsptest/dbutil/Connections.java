package com.denny.jsptest.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connections {
	private static Connection conn ;
	private static String connString = "jdbc:mysql://localhost/eownen" ;
	private static String username = "root" ;
	private static String password = "manager" ;
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver") ;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException{
		return (conn == null || conn.isClosed()) ? DriverManager.getConnection(connString,username,password) : conn;
	}
	
	public static void closeResouce(Connection c,Statement s,ResultSet r) throws SQLException{
		if(c != null) {
			c.close() ;
		}
		if(s != null){
			s.close();
		}
		if(r != null){
			r.close();
		}
	}
	
}
