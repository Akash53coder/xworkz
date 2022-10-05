package com.xworkz.ds;

public class LinkedList2 {

	Node head;
	
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void insertAtFirst(int data) {
		Node n = new Node(data);
		if(this.head == null) {
			this.head = n;
			return;
		}
		n.next = this.head;
		this.head = n;
	}
	
	public void insertAtLast(int data) {
		Node n = new Node(data);
		n.next = null;
		Node last = this.head;
		while(last.next != null) {
			last = last.next;
		}
		last.next = n;
	}
	
	public void printLinkedList() {
		Node n = this.head;
		while(n!=null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
	
	public static void main(String[] args) {
		
		LinkedList2 linkedList2 = new LinkedList2();
		linkedList2.head = new Node(2);
		linkedList2.head.next = new Node(3);
		linkedList2.head.next.next = new Node(4);
		
		//linkedList2.insertAtFirst(5);
		
		linkedList2.insertAtLast(5);
		
		linkedList2.printLinkedList();
	}
}
