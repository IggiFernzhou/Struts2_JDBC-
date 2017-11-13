package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
	Connection conn=null;
	private static final String url="jdbc:mysql://localhost:3306/examtest"
			+ "?useUnicode=true&characterEncoding=UTF-8";
	private static final String username="root";
	private static final String password="121411254";
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
		
}
