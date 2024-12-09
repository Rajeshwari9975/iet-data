package demolinkedlist;

public class Linkedlist {
	public class Node{
		int data ;
		Node  next;
		public Node(int data) {
			super();
			this.data = data;
			this.next = next;
		}
	}
	
		
	Node head;


	public Linkedlist() {
	     head = null;
	}
	public void addelement(int num ) {
		Node node = new Node(num);
		if (head == null){
			head  = node;
			
		}
		else {
		   Node temp = head ;
			while(temp.next!= null) {
				temp = temp.next;
				
			}
			temp.next = node;
		}
	}
	public void display() {
		Node temp = head ;
		while( temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	
	}
	