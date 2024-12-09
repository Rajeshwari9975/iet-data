package com.demo.linkedlist;

public class Linkedlist {
	class Node{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
		
	}
	
	Node head;
	

	public Linkedlist() {
		
		head = null;
	}
	
	public void addElement(int num) {
		Node node = new Node(num);
		if(head == null) {
			
			head= node;
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	public void displayList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
	}

	public void addAtPosition(int i,int num) {
		Node node = new Node(num);
		
		Node temp = head;
		int count = 1;
		while(count < i - 1) {
			
			temp = temp.next;
			count++;
		}
		node.next = temp.next;
		temp.next = node;
		
	}
	public void addatpos(int i,int num) {
		Node node = new Node(num);
		Node temp =head;
		int count = 1;
		while(count<i-1) {
			temp= temp.next;
			count++;
			
		
		}
		node.next= temp.next;
		temp.next=node;
		
		
	}

	public void deletebypos(int i) {
		if(head ==  null) {
			System.out.println("empty list ");
		}
		else {
			Node temp =head ,prev = null ;
			int count=1;
			if(head.data==1) {
				head = temp.next;
				temp.next = null;
				temp=null;
				
				
			}else {
				while(temp!=null && temp.data!= i) {
					prev =temp;
					temp=temp.next;
				}
				
			}
			
		}
		
	}

	public void deleteById(int i) {
		int count = 1;
		Node prev = null;
		Node temp;
		temp = head;
		
		while(count < i) {
			prev = temp;
			temp = temp.next;
			count++;
			
		}
		prev.next = temp.next;
		temp.next = null;
		temp = null;
		
	}
	
	
	

}
