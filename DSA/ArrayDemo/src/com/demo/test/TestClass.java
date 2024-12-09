package com.demo.test;

import java.util.Scanner;

import com.demo.service.ArrayService;

public class TestClass {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int []arr = {7,3,5,11};
	int max = ArrayService.findmax(arr);
	System.out.println("Mximum : "+max);
	int secondmax = ArrayService.secondmax(arr);
	System.out.println("sceond max"+" "+secondmax);
	int min = ArrayService.findmin(arr);
	System.out.println("minelement "+" " +min);
	int sum = ArrayService.primesum(arr);
	System.out.println(+sum);
	System.out.println("Enter a value you want to search ");
	int val = sc.nextInt();
	int pos = ArrayService.linerSearch(arr,val);
	System.out.println("element found at pos "+" "+pos);
		
	
	
}
}
