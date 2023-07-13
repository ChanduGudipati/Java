package com.db.connection;

import java.sql.Connection;
import java.sql.Statement;

public class InsertIntoDB {

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection conn=DBConnection.dbConnection();
		System.out.println("Connection Established");
		String sql ="insert into emp_reg (sno,username,password,email,mobile,address) values (2,'Sai chander','sai@123','sai@gmail.com',9494721234,'Hyd')";
		Statement smt = conn.createStatement();
		int i =smt.executeUpdate(sql); 
		System.out.println("number of rows inserted "+i);
	
	}

}
