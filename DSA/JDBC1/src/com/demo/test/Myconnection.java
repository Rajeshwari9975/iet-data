package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Myconnection {
	public static void main(String[] args) {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://localhost:3306/student";
			Connection conn=DriverManager.getConnection(url,"dac67","welcome");
			if(conn!=null) {
				System.out.println("connection done");
			}else {
				System.out.println("error occured");
			}
			conn.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
	}
}
