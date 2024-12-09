package com.demo.test;

public class TestCircularQueue {
	
	public static void main(String[] args) {
		
		CircularQueue cQue = new CircularQueue(5);
		
		cQue.enqueue(10);
		cQue.enqueue(20);
		cQue.enqueue(30);
		cQue.dequeue();
		cQue.enqueue(40);
		cQue.enqueue(50);
		cQue.enqueue(60);
		
	}

}
