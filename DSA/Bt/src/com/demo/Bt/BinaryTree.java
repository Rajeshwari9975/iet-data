package com.demo.Bt;

public class BinaryTree {
	Node root;
	class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			super();
			this.data = data;
			this.left = null;
			this.right = null;
		}
		
	}
	

	public BinaryTree() {
		super();
		this.root = root;
	}
	public void addValue(int val) {
		root = addval(root,val);
	}

	public Node addval(Node root, int val) {
		Node newnode = new Node(val);
		if(root==null) {
			root=newnode;
		}
		else {
			if(val<root.data) {
				root.left = addval(root.left,val);
				
				
			}
			else {
				root.right = addval(root.right,val);
			}
		}
	return root;
		
	}

	public void display() {
		inorder();
		preorder();
		postorder();
	}
	private void postorder() {
		postordertravese(root);
		
	}
	private Node postordertravese(Node root) {
		if(root!=null) {
			
			root.left = postordertravese(root.left);
			root.right = postordertravese(root.right);
			System.out.println(root.data);

		}
		return root;
		
	}
	private void preorder() {
		preordertravese(root);
		
	}
	private Node preordertravese(Node root) {
		if(root!=null) {
			System.out.println(root.data);
			root.left = preordertravese(root.left);
			root.right = preordertravese(root.right);
		}
		return root;
		
	}
	private void inorder() {
		//left data right 
	inordertravese(root);
		
	}
	private Node inordertravese(Node root) {
		if(root!=null) {
		root.left = inordertravese(root.left);
		System.out.println(root.data);
		root.right = inordertravese(root.right);
		}
		return root;
	}
	

}
