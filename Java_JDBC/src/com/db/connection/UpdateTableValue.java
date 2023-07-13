package com.db.connection;

import java.sql.Connection;
import java.sql.Statement;

public class UpdateTableValue {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Connection conn = DBConnection.dbConnection();
		String sql ="update emp_reg set address ='Hyderabad' where sno =3";
		Statement stmt = conn.createStatement();
		int i =stmt.executeUpdate(sql);
		System.out.println("No of rows Updated "+i);
	}

}
