package com.demo.test;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
	int arr[] = {65,10,20,5,7,25,8,27,9,6,30};
	mergesort(arr);
	System.out.println(Arrays.toString(arr));
	
	
	

	}

	private static void mergesort(int[] arr) {
		
		int first = 0;
		int last = arr.length - 1;
		int mid = (first+last)/2;
		
		if(first < last) {
		
		int lArrLength = mid - first + 1;
		int rArrLength = last - mid;
		
		int[] leftArr = new int[lArrLength];
		int[] rightArr = new int[rArrLength];
		
		int l = 0;
//		for(int i=0; i<=mid; i++) {
//			leftArr[l] = arr[i];
//			l++;
//		}
//		int k = 0;
//		for(int j = mid + 1; j < last; j++) {
//			rightArr[k] = arr[j];
//			k++;
//		}
		
		System.arraycopy(arr, first, leftArr, 0, lArrLength);
		System.arraycopy(arr, mid + 1, rightArr, 0, rArrLength);
		
		mergesort(leftArr);
		mergesort(rightArr);
		merge(arr,leftArr,rightArr);
		}
		
	}

	private static void merge(int[] arr, int[] leftArr, int[] rightArr) {
		int i = 0;
		int j = 0; 
		int k =0;
		while(i < leftArr.length && j < rightArr.length) {
			if(leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
				k++;
			}
			else {
				arr[k] = rightArr[j];
				j++;
				k++;
			}
		}
		while(i < leftArr.length) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		while(j < rightArr.length) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}
	}

	

}
