package com.demo.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestCallableStatement {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://192.168.10.127:3306/dac67?useSSL=false";
			Connection conn=DriverManager.getConnection(url,"dac67","welcome");
			CallableStatement cst=conn.prepareCall("call pro1(?,?,?)"); 
			cst.setInt(1, 10);
			cst.setInt(2, 10);
			cst.registerOutParameter(3,java.sql.Types.INTEGER );
			cst.execute();
			
			int sum=cst.getInt(3);
			System.out.println("Count : "+sum);
			
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
