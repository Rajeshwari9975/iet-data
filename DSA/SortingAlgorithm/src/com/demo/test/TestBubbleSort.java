package com.demo.test;
import java.util.Arrays;

public class TestBubbleSort {
public static void main(String[] args) {
	int arr[]= {2,7,5,12,65,30,25,17};
	System.out.println("Give array is ");
	System.out.println(Arrays.toString(arr));
	bubblesort(arr);
	System.out.println("Print Sorted array");
	System.out.println(Arrays.toString(arr));
	
	
}

private static void bubblesort(int[] arr) {
	// TODO Auto-generated method stub
	int swapcount =0;
	int n = arr.length;
	for( int i =0;i<n;i++) {
		for(int j=1;j<(n-i);j++) {
			if(arr[j-1]>arr[j]) {
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				swapcount++;
			}
		}
		System.out.println("itreation" +(i+1)+"Swapcount"+swapcount);
		System.out.println(Arrays.toString(arr));
		if(swapcount==0) {
			break;
		}
		swapcount=0;
		
	}
	
}

}
