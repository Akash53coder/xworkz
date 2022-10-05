package com.xworkz.ds;

//basic structure of linked list
public class ListNode {

	int data;
	ListNode next;
	
	ListNode(int data){
		this.data = data;
	}
	
	//to get the length of list
	public int listLength(ListNode headNode) {
		int length = 0;
		ListNode currentList = headNode;
		while(currentList != null) {
			length++;
			currentList = currentList.next;
		}
		return length;
	}
	
	public static void main(String[] args) {
		ListNode listNode = new ListNode(12);
		System.out.println(listNode.listLength(listNode));
		
	}
}
