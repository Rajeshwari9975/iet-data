package com.demo.test;

import java.util.Arrays;

public class CircularQueue {
	
	int front;
	int rear;
	int arr[];
	public CircularQueue(int size) {
	
		this.front = -1;
		this.rear = -1;
		arr = new int[size];
	}
	
	public CircularQueue() {
		
		this.front = -1;
		this.rear = -1;
		arr = new int[10];
	}

	public void enqueue(int val) {
		if(isFull()) {
			System.out.println("Queue is Full");
		}
		else {
			
			if(front == -1) {
				front = 0;
			}
			rear = (rear + 1) % arr.length;
			arr[rear] = val;
		}
		System.out.println(Arrays.toString(arr));
	}

	private boolean isFull() {
		if(front == 0 && rear == arr.length - 1)
			return true;
		if(front == rear + 1)
			return true;
		return false;
	}

	public void dequeue() {
		if(isEmpty()) {
			
			System.out.println("Queue is Empty");
			
		}
		else {
			if(front == rear) {
				front = -1;
				rear = -1;
			}
			else {
				System.out.println("Dequed Value:  "+arr[front]);
				arr[front] = 0;
				front = (front + 1) % arr.length;
			}
		}
		
	}

	private boolean isEmpty() {
		return front == -1;
	}
	
	

}
