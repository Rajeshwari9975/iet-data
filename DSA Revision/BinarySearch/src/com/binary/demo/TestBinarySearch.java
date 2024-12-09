package com.binary.demo;

import java.util.Arrays;

public class TestBinarySearch {

	public static void main(String[] args) {
		int[] arr = {10,20,12,11,4,3,5,6,7,9};
		
		
		
		mergeSort(arr,0,arr.length-1);
		
		
		
		
	}

	private static void mergeSort(int[] arr, int start, int end) {
		if(start < end) {
			int mid = (start + end)/2; //4

			mergeSort(arr, start, mid);
			mergeSort(arr, mid+1, end);
			
			merge(arr,start,mid,end);
			
		}
		
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		int left = mid - start + 1;
		int right = end - mid;
		
		int[] leftArr = new int[left];
		int[] rightArr= new int[right];
		
		
	}

	
}
