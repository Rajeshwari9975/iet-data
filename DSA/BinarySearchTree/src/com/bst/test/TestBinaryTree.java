package com.bst.test;

import java.util.Scanner;

import com.bst.demo.BinaryTree;

public class TestBinaryTree {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BinaryTree bt = new BinaryTree();

		
		bt.addValue(10);
		bt.addValue(12);
		bt.addValue(11);
		bt.addValue(2);
		bt.addValue(6);
		bt.addValue(16);
		bt.addValue(19);
		bt.addValue(20);
		bt.addValue(15);
		bt.addValue(17);
		bt.addValue(9);
		bt.addValue(8);
		
		bt.displayTree();
		
		
	}

}
