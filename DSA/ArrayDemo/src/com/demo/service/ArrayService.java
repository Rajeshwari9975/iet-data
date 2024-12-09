package com.demo.service;

public class ArrayService {
	public static int findmax(int arr[]) {
		int max = arr[0];
		for(int i =1;i<arr.length;i++) {
			if(arr[i]>max) 
			{
				max = arr[i];
			}
		}
		
		return  max;
	}

	public static int secondmax(int[] arr) {
		int max =arr[0],xmax=arr[0];
		for(int i =1;i<arr.length;i++)
		{
			if(arr[i]>max) {
				xmax=max;
				max= arr[i];
			}
			if(arr[i]>max && arr[i]<max) {
				xmax= arr[i];
			}
		}
		return xmax;
	}

	public static int findmin(int[] arr) {
	    int min= arr[0];
	    for(int i =1;i<arr.length;i++) {
	    	if(arr[i]<min) {
	    		min =arr[i];
	    	}
	    }
		return min;
	}

	public static int primesum(int[] arr) {
	    int sum =0;
	    for( int i =0;i<arr.length;i++) {
	    	if(arr[i]%2 !=0) {
	    		sum=sum+arr[i];
	    	}
	    }
		return sum;
	}

	public static int linerSearch(int[] arr, int val) {
		for(int i=0;i<arr.length;i++) {
			if( arr[i]==val) {
				return i;
			}
		}
		return -1;
	}


}
