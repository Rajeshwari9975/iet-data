package com.demo.service;

import java.util.Arrays;

import com.demo.beans.Customer;

public class MycircularqueueCustomer {
	Customer []arr;
	int rear=-1;
	int front = -1;
	public MycircularqueueCustomer(int size) {
		arr = new Customer[size];
		
	}
	public MycircularqueueCustomer() {
		arr = new Customer[10];
	}
	
	private boolean isfull() {
		if(front==0 && rear== arr.length-1) 
		{
			return true;
		}
		else{
			front = rear+1;
			
		}
		return false;
	}
	public void enqueue(Customer val) {
		if(isfull()) {
			System.out.println("queue is full");
		}
		else {
			if(front ==-1) {
				front = 0;
			}
			
			rear = (rear+1) % arr.length;
			arr[rear]=val;
			System.out.println(Arrays.toString(arr));

		}
		
	}
	
	
	

}
