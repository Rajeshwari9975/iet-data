package com.demo.test;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int arr []= {23,4,1,5,20,36,78,3,7};
		System.out.println("before sorting");
		System.out.println(Arrays.toString(arr));
		selectionsort(arr);
		System.out.println("After sorting");
		System.out.println(Arrays.toString(arr));
	}

	private static void selectionsort(int[] arr) {

		for(int i = 0; i < arr.length - 1; i++ ) {
			int min_index=i;
			for(int j = i + 1; j < arr.length ; j++) {
				if(arr[min_index] > arr[j]) {
					min_index = j;
				}
			}
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
			

			
		}
		
	}

}
