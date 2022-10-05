package com.xworkz.ds;


class LinkedList{
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		//to create a new node
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void printLinkedList() {
		Node n = this.head;
		while(n!=null) {
			System.out.print(n.data + " -> ");
			n = n.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.head = new Node(1);
		
		Node n1 =  new Node(2);
		Node n2 = new Node(3);
		
		linkedList.head.next = n1;
		 n1.next = n2;
		 
		 linkedList.printLinkedList();
		
	}
}
