package com.demo.test;

import java.util.Arrays;

public class CountingSort {
	public static void main(String[] args) {
		int arr[] = { 5, 4, 5, 7, 2, 3, 1, 4, 5, 6 };
		int max = arr[0];
		
		//Find Max Number From Array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= max) {
				max = arr[i];
			}
		}

		//New Array of Size Max Number
		int[] newArr = new int[max + 1];
		
		//Set Whole Array to 0
		for (int j = 0; j < newArr.length; j++) {
			newArr[j] = 0;
		}

		//Original Array's Number Pointing to that Index and count++
		for (int i = 0; i < arr.length; i++) {
			
			int choice = arr[i];

			newArr[choice] += 1;

		}

		//Cumulative Sum
		for(int i = 0; i< newArr.length; i++) {
			if(i< newArr.length - 1) {
				newArr[i + 1] += newArr[i];
			}
			
		}
		
		//Temp Array
		int[] tempArr = new int[arr.length];
		
		//Values Stored in Sorted Manner in Temp Array
		for(int i = 0; i < arr.length; i++) {
			int fetch = arr[i];
			newArr[fetch] -= 1;
			int newFetch = newArr[fetch];
			tempArr[newFetch] = fetch;
		}
		
		System.out.println(Arrays.toString(tempArr));

	}

}
