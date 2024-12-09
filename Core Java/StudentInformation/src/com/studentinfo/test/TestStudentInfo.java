package com.studentinfo.test;

import java.util.Scanner;

import com.studentinfo.beans.StudentInfo;
import com.studentinfo.service.StudentInfoService;

//Write a program to maintain student information. 
//For each student store studid, name, m1, 
//m2 and m3 (marks of 3 subjects ). 
//Accept information for 2 students and display it as follows

public class TestStudentInfo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i<3; i++) {
			System.out.println("Enter Student Name:: ");
			String name = sc.nextLine();
			System.out.println("Enter Student Id:: ");
			int id = sc.nextInt();
			System.out.println("Enter Marks M1 :: ");
			int m1 = sc.nextInt();
			System.out.println("Enter Marks M2 :: ");
			int m2 = sc.nextInt();
			System.out.println("Enter Marks M3 :: ");
			int m3 = sc.nextInt();
			sc.nextLine();
			StudentInfo stud = new StudentInfo(id, name, m1, m2, m3);
			StudentInfoService.displayStudentData(stud);
		}
	}

}
