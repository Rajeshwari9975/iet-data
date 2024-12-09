package com.quick.test;

import com.quick.service.QuickSort;

public class TestQuickSort {
	
	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		
		int[] arr = {5,3,8,1,4,6,2,7};
		int i = 0;
		int j = arr.length - 1;
		int pivot = i;
		
		qs.sortArr(arr,i,j,pivot);
		
	}
}
