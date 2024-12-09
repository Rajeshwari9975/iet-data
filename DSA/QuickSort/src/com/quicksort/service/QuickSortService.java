package com.quicksort.service;

import java.util.Arrays;

public class QuickSortService {

	public static void quickSort(int[] arr, int first, int last) {
		int pivot = first;
		int i = first;
		int j = last;

		if (first < last) {
			while (i < j) {
				while (arr[i] <= arr[pivot] && i < last) {
					i++;
				}
				while (j > pivot && arr[j] > arr[pivot]) {
					j--;
				}
				if (i < j) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			int temp = arr[pivot];
			arr[pivot] = arr[j];
			arr[j] = temp;
			quickSort(arr, first, j - 1);
			quickSort(arr, j + 1, last);
			System.out.println(Arrays.toString(arr));
		}

		
	}

}
