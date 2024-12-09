package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url = "jdbc:mysql://192.168.10.127:3306";
			Connection cnn = DriverManager.getConnection(url,"dac67","welcome");
			if(cnn!=null) {
				System.out.println("Connected");
			}
			else {
				System.out.println("Not Connected");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
        
	}

}

