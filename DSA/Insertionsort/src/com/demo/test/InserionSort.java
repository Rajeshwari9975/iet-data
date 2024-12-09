package com.demo.test;

import java.util.Arrays;

public class InserionSort {
	public static void main(String[] args) {
      int arr[] = {10,59,4,5,6,7};
      System.out.println(Arrays.toString(arr));
      insertionsort(arr);
      System.out.println(Arrays.toString(arr));
	}

	private static void insertionsort(int[] arr) {
		int n = arr.length;
	
		
		for(int i =1;i<n;i++) {
			int num = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>num) {
				arr[j+1]=arr[j];
				j--;
			
				
			}
			arr[j+1]=num;
			
		}
	}
}
