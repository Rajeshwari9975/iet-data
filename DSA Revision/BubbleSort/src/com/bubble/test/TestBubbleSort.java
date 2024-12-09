package com.bubble.test;

public class TestBubbleSort {
	
	public static void main(String[] args) {
		int[] arr =  {2,7,5,12,65,30,25,17};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 1; j < arr.length - i ; j++) {
				if(arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		
		for(int k = 0; k < arr.length; k++) {
			System.out.print(arr[k]+"  ");
		}
	}

}
