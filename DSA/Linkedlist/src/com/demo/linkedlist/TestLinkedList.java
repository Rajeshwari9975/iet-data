package com.demo.linkedlist;

public class TestLinkedList {

	public static void main(String[] args) {
		Linkedlist lst = new Linkedlist();
		lst.addElement(10);
		lst.addElement(20);
		lst.addElement(30);
		lst.displayList();
		System.out.println("--------------------------");
		lst.addAtPosition(2,25);
		lst.addAtPosition(3,25);
		lst.displayList();
		System.out.println("_________________________________");
		//lst.deletebypos(2);
		lst.displayList();
		System.out.println("_______________________________________");
		
		lst.deleteById(3);
		lst.displayList();

		
	}
}
