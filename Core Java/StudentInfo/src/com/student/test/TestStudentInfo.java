package com.student.test;

import java.util.Scanner;

import com.student.service.StudentService;
import com.student.service.impl.StudentServiceImpl;

public interface TestStudentInfo {

	public static void main(String[] args) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		StudentService stud = new StudentServiceImpl();
		do {
			System.out.println("1.Add New Student\n2.Display All Students\n 3.Search By ID");
			System.out.println("4.Search By Name\n5.Calculate GPA\n6.Exit");
			choice = sc.nextInt();
			switch(choice) {
			case 1 :
				stud.addNewStudent();
				break;
			case 2:
				stud.displayAllStuds();
				break;
			case 3 :
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			default :
				break;
			}
		}while(choice != 7);
	}
}
