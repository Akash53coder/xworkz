package com.xworkz.java.collection.list;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		
		System.out.println(stack.peek());
		
		//search for the element by search(Object ob) returns the 
		//distance from the top(or offset value), if no elemnt found -1
		
		System.out.println(stack.search(1));//3
		
		System.out.println(stack.search(9));//-1
	}

}
