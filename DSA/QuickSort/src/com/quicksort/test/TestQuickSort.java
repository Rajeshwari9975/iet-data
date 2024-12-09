package com.quicksort.test;


import com.quicksort.service.QuickSortService;

public class TestQuickSort {

	public static void main(String[] args) {
		int[] arr = {70,14,12,1,5,6,8,7};
		int first = 0;
		int last = arr.length - 1;
		
		QuickSortService.quickSort(arr,first,last);
		
	}
}
