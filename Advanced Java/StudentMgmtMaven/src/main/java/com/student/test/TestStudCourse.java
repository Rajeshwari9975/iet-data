package com.student.test;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.student.service.StudentService;
import com.student.service.StudentServiceImpl;

public class TestStudCourse {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StudentService ss = new StudentServiceImpl();
		
		int choice = 0;
		do {
			System.out.println("1.Add New Student \n2.Display All Students");
			System.out.println("3.Find Student By Student ID \n4.Find Students By Course ID");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				String ip = "n";
				do {
					ss.addNewStudent();
					System.out.println("Do you want to add more Students?");
					ip = sc.next();
					System.out.println(ip);
				}while(ip.equals("y"));
				
				break;
			case 2:
				ss.displayAllStudents();
				break;
			case 3:
				ss.displayAllStudents();
				break;
			case 4:
				System.out.println("Enter Course ID");
				int cid = sc.nextInt();
				ss.getStudsByCourseId(cid);
				break;
			default:
				break;
			}
		}while(choice!=5);
		
		
	}

}
