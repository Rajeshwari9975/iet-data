package com.demo.service;

public class LinkedHashDemo {
	
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
		
		
	}
	
	Node head;
	
	

	public LinkedHashDemo() {
		this.head = null;
	}



	public void addValueToBucket(int value) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
		}
		else {
			newNode.next = head;
			head= newNode;
		}
	}



	public void displayData(int bucket) {
		if(head == null) {
			System.out.println(bucket+"----->Bucket Is Empty");
		}
		else {
			Node temp = head;
			System.out.print(bucket+"------>");
			while(temp != null) {
				System.out.print(temp.data+"  ");
				temp = temp.next;
			}
			System.out.println();
		}
	}



	public void deleteData(int bucket, int value) {
		
		
		if(head == null) {
			System.out.println("Bucket "+bucket+" is Empty and "+value+" not found");
		}else {
			Node temp = head;
			Node prev = null;
			
			if(head.data == value) {
				temp = temp.next;
				head = temp;
			}
			while(temp != null && temp.data != value) {
				prev = temp;
				temp = temp.next;
			}
			
			if(temp == null) {
				System.out.println("Number "+value+" not found in Bucket "+bucket);
			}
			else if(temp.data == value) {
				prev.next = temp.next;
				temp.next = null;
				temp = null;
				
			}
			
		}
		
	}



	public void searchdata(int value, int bucket) {
		
		if(head==null) {
			System.out.println("Bucket "+bucket+" is empty "+value+" not found");
		}
		else {
			Node temp = head;
			while(temp!=null && temp.data!=value) {
				temp =temp.next;
				
			}
			if(temp==null) {
				System.out.println("Bucket "+bucket+" is empty "+value+" not found");
			}
			else if(temp.data==value){
				System.out.println("number "+value+" found");
				
			}
		}
	}

}
