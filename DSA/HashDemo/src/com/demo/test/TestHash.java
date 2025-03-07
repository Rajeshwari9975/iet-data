package com.demo.test;

import java.util.Scanner;

import com.demo.service.LinkedHashDemo;

public class TestHash {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LinkedHashDemo[] hashtable = new LinkedHashDemo[5];
		
		for(int j = 0; j < hashtable.length; j++) {
			hashtable[j] = new LinkedHashDemo();
		}
		
		int choice = 0;
		do {
			System.out.println("1.Add Data\n2.Delete Data\n3.Search Data");
			System.out.println("4.Display Data\n5.Exit");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: 
				findBucketAddData(hashtable);
				break;
			case 2:
				fetchBucketDeleteData(hashtable);
				break;
			case 3: 
				fetchBucketSearchData(hashtable);
				break;
			case 4: 
				displayDataUsingBucket(hashtable);
				break;
			case 5:
				System.out.println("Thank You!!");
				break;
			default: 
				break;
			}
		}while(choice != 5);
	}

	private static void fetchBucketSearchData(LinkedHashDemo[] hashtable) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to Search ");
		int value = sc.nextInt();
		int bucket = value % hashtable.length;
		hashtable[bucket].searchdata(value,bucket);
		
	}

	

	private static void fetchBucketDeleteData(LinkedHashDemo[] hashtable) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to be Deleted");
		int value = sc.nextInt();
		
		int bucket = value % hashtable.length;
		
		hashtable[bucket].deleteData(bucket,value);
	}

	private static void displayDataUsingBucket(LinkedHashDemo[] hashtable) {

		
		for(int i = 0; i < hashtable.length; i++) {
			hashtable[i].displayData(i);
		}
	}

	private static void findBucketAddData(LinkedHashDemo[] hashtable) {
		Scanner sc= new Scanner(System.in);
		
			System.out.println("Enter Number:: ");
			int value = sc.nextInt();
			int bucket = value % hashtable.length;
			
			hashtable[bucket].addValueToBucket(value);
		
	}

}
