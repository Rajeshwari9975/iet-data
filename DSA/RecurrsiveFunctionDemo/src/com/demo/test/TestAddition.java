package com.demo.test;

public class TestAddition {
	public static void main(String[] args) {
		int ans = addition(5);
		System.out.println("Addition in itreative way"+" "+ans);
		ans = additionrecurssive(5);
		System.out.println("Addition in Recurcive Way" +" " +ans);
	}

	private static int additionrecurssive(int num) {
		if (num==1)
			return 1;
		else
			return num+additionrecurssive(num-1);
			
	}

	private static int addition(int num) {
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum = sum+i;
		}
		return sum;
		
	}

}
