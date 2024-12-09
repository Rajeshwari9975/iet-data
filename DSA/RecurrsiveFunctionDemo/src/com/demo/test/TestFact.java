package com.demo.test;

public class TestFact {
	public static void main(String[] args) {
		int ans = factorialrecur(5);
		System.out.println("Factorial of 5 "+" "+ans);
		ans = factorial(3 );
		System.out.println("Fact of "+ans);
		
	}

	private static int factorial(int n) {
	    int fact = 1;
	    for(int i=2;i<=n;i++) {
	    	fact = fact*i;
	    }
	    
		return fact;
	}

	private static int factorialrecur(int num) 
	 {
		
			if(num==0)
				return 1;
			else
				return num* factorialrecur(num-1);
		}
	
	

}
