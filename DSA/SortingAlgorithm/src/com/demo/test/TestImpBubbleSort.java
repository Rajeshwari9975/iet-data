package com.demo.test;

import java.util.Arrays;

public class TestImpBubbleSort {
	public static void main(String[]args) {
		int arr[]= {5,7,15,2,12,1,7};
		System.out.println("Give array is ");
		System.out.println(Arrays.toString(arr));
		improvebubblesort(arr);
		System.out.println("sorted arr");
		System.out.println(Arrays.toString(arr));
	}

	private static void improvebubblesort(int[] arr) {
	   int swapcount = 0;
	   int n = arr.length;
	   for(int i=0;i<n;i++) {
		   for(int j =1;j<(n-i);j++) {
			   if(arr[j]>arr[j-1]) {
				   int temp = arr[j];
				   arr[j]= arr[j-1];
				   arr[j-1]=temp;
				   swapcount++;
				   
			   }
	
		   }
		   if(swapcount == 0) {
			   break;
		   }
		   swapcount=0;
		  
	   }
	  
	}

}
