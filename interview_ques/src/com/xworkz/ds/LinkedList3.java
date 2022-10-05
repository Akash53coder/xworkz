package com.xworkz.ds;

//to remove last occurrence of linkedList

public class LinkedList3 {

	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public void printList() {
		Node n = this.head;
		while(n != null) {
			System.out.print(n.data + "-> ");
			n=n.next;
		}
	}
	
	public void removeLastOcc(int data) {
		Node temp = this.head;
		Node ptr = null;
		while(temp != null) {
			if(temp.data == data) {
				ptr = temp;
			}
			temp = temp.next;
		}
		
		//if the last occurrence is last node
		
	}
	
	public static void main(String[] args) {
		LinkedList3 linkedList3 = new LinkedList3();
		
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(2);
		Node n5 = new Node(4);
		
		linkedList3.head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		linkedList3.removeLastOcc(2);
	}
}
