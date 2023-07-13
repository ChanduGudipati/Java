package com.db.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	static String url ="jdbc:mysql://localhost:3306/digit";
	static String user ="root";
	static String password ="Divyansh@21";
	
	public static Connection dbConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 conn = DriverManager.getConnection(url, user, password);
			return conn;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	

}
