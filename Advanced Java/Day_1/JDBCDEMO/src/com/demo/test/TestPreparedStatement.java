package com.demo.test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class TestPreparedStatement {

	public static void main(String[] args) {
		Connection conn=null;
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://192.168.10.127:3306/dac67?useSSL=false";
			 conn=DriverManager.getConnection(url,"dac67","welcome");
			PreparedStatement pst=conn.prepareStatement("select * from student");
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				
				System.out.println("StudentId"+rs.getInt(1));
				System.out.println("Student FirstName"+rs.getString(2));
				System.out.println("Student lastname"+rs.getString(3));
				System.out.println("Student "+rs.getDate(4));
				System.out.println("Student Email"+rs.getString(5));
				System.out.println("StudentEmail"+rs.getString(6));
			}
			int sid=40000;
			String fname="riya";
			String lname="cccc";
			LocalDate dt=LocalDate.of(2025,03,02);
			String email ="bbbb@11";
			String Email="fgsjdh2";
			java.sql.Date sdt=Date.valueOf(dt);
			int cid=1;
			PreparedStatement pst1=conn.prepareStatement("insert into student values(?,?,?,?,?,?)");
			pst1.setInt(1, sid);
			pst1.setString(2, fname);
			pst1.setString(3, lname);
			pst1.setDate(4,sdt);
			pst1.setString(5, email);
			pst1.setString(6, Email);
			int n=pst1.executeUpdate();
			if(n>0) {
				System.out.println("insertion done");
			}
			else {
				System.out.println("error occured");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
