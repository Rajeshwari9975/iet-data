package com.demo.test;

import java.util.Scanner;
import java.util.stream.Stream;

public class TreeBinarySearch {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Integer arr[]= {5,6,7,8,9};
	Stream.of(arr).forEach(System.out::println);
	String ans =null;
	do {
		System.out.println("Enter a number to serach ");
		int num = sc.nextInt();
		int pos = binarysearch(arr,0,arr.length-1,num);
		if(pos!=-1) {
			System.out.println("Number is found "+pos);
		}
		else{
			System.out.println("Number is not found");
		}
		System.out.println("do you want to contunie(y/n)?");
		ans = sc.next();
		
	}while(ans.equals("y"));

}

private static int binarysearch(Integer[] arr, int low, int high, int num) {
   int l = low;
   int h = high;
   if(l<=h)
   {
     int mid = (l+h)/2;
     System.out.println("high" +" "+high+"low"+" "+low + " "+"mid"+" "+ mid);
     if(arr[mid]==num)
     {
    	 return mid;
     }
     else if(num<arr[mid]) 
     {
    	 return binarysearch(arr,l,mid-1,num);
     }
     else if(num>arr[mid])
     {
    	 return binarysearch(arr,mid+1,h,num);
     }
     
     
     
   }
   return -1;
} 

}

