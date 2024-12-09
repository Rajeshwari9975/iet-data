package com.demo.test;

import java.util.Arrays;

public class HeapSort {
	public static void main(String[] args) {
		int arr[]= {5,2,10,1,7,8,2,4,7};
		int length = arr.length;
		for(int i = length/2 - 1; i>= 0; i--) {
			heapify(arr,length,i);
		}
		
		for(int i = length -1; i>=0 ;i--) {
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			heapify(arr, i, 0);
		}
		
		
	}

	private static void heapify(int[] arr, int length, int i) {
		int largest = i;
		int left =2*i+1;
		int right = 2*i+2;
		int temp;
		if(left < length && arr[largest] < arr[left] ) {
			largest = left;
		}
		if(right < length && arr[largest] < arr[right] ) {
			largest = right;
		}
		
		if(largest != i) {
			temp = arr[largest];
			arr[largest] = arr[i];
			arr[i] = temp;
			heapify(arr, length, largest);
		}
		
		System.out.println(Arrays.toString(arr));
	}

	

}
