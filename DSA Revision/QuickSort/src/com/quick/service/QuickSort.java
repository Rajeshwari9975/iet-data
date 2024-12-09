package com.quick.service;

public class QuickSort {

	public void sortArr(int[] arr, int i, int j, int pivot) {
		pivot = i;
		
		if(i < j) {
			if(arr[i] <= arr[pivot]) {
				i++;
			}
			if(arr[j] > arr[pivot]) {
				j--;
			}
		}
		else if(i > j) {

		}
		
	}
	
	

}
