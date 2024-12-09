package com.student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	private static Connection conn = null;

	public static Connection getMyConnection() {
		if (conn == null) {
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url = "jdbc:mysql://192.168.10.127:3306/dac67";
				conn = DriverManager.getConnection(url, "dac67", "welcome");
				return conn;

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return conn;
	}

	public static void closeMyConnection() {
		try {
			if (conn != null) {

				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
