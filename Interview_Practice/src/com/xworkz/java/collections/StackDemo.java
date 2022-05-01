package com.xworkz.java.collections;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
//		s.empty():boolean;
//		s.push(item):E;
//		s.pop():E:
//		s.peek():E;
//      s.search(): int //	returns the index	
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		System.out.println(s.search(5)); // if no elements found, it returns -1
	}
}
