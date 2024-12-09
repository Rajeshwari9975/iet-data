package com.student.service.impl;

import java.util.Scanner;

import com.student.beans.Student;
import com.student.service.StudentService;

public class StudentServiceImpl implements StudentService {
	
	Student[] studArr = new Student[10];

	@Override
	public void displayAllStuds() {
		for(Student s : studArr) {
			if(s != null) {
				System.out.println(s);
			}
		}
	}

	@Override
	public void addNewStudent() {
		int count = 0;
		Scanner sc = new Scanner(System.in);
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
		
		studArr[count] = new Student(id,name,m1,m2,m3);
		count++;
	}

}
