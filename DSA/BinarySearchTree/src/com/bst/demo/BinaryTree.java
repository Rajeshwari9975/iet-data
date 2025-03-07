package com.bst.demo;

public class BinaryTree {
	
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
	
	Node root;

	public BinaryTree() {
		super();
		this.root = null;
	}

	public void addValue(int val) {
		root = addDataToTree(root,val);
	}

	private Node addDataToTree(Node root, int val) {
		Node newNode = new Node(val);
		
		if(root == null) {
			root = newNode;
			
		}
		else {
			if(val < root.data) {
				root.left = addDataToTree(root.left, val);
			}
			else {
				root.right = addDataToTree(root.right, val);
			}
		}
		return root;
	}

	public void displayTree() {
		inOrder(root);
		preOrder(root);
		postOrder(root);
	}

	private void postOrder(Node root) {
		System.out.println("Postorder Traversal");
		postOrderTraverse(root);
		
	}

	private void postOrderTraverse(Node root) {
		if(root != null) {
			postOrderTraverse(root.left);
			postOrderTraverse(root.right);
			System.out.println(root.data+"  ");
			
		}
	}

	private void preOrder(Node root) {
		System.out.println("Preorder Traversal");
		preOrderTraverse(root);
	}

	private void preOrderTraverse(Node root) {
		if(root != null) {
			System.out.println(root.data+"  ");
			preOrderTraverse(root.left);
			preOrderTraverse(root.right);
		}
	}

	private void inOrder(Node root) {
		System.out.println("Inorder Traversal");
		inOrderTraverse(root);
	}

	private void inOrderTraverse(Node root) {
		if(root != null) {
			inOrderTraverse(root.left);
			System.out.println(root.data+"  ");
			inOrderTraverse(root.right);
		}
	}
	
	
	

}
