package com.db.connection;

import java.awt.image.RescaleOp;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectQuery {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = DBConnection.dbConnection();
		String sql ="select * from Emp_reg";
		Statement stmt = conn.createStatement();
		ResultSet rs= stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getInt("sno"));
			System.out.println(rs.getString("userName"));
			System.out.println(rs.getString("password"));
			System.out.println(rs.getString("email"));
			System.out.println(rs.getLong("mobile"));
			System.out.println(rs.getString("address"));
		}
	}

}
