package com.db.connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteClass {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = DBConnection.dbConnection();
		String sql="delete from emp_reg where sno =2";
		Statement stmt = conn.createStatement();
		int i =stmt.executeUpdate(sql);
		System.out.println("no of rows deleted "+i);

	}

}
