package com.xworkz.java.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {
	public static void main(String[] args) {

		//methods in list WRT queue
		
//		addFirst(Object o):void;
//		addLast(Object o): void;
//		 getFirst():E;
//		 getLast(): E;
//		 remove(): E;		
//		 removeFirst(): Object;
//		 removeLast(): Object;
//		 descendingIterator: Iterator;
//		 element(): Object; //it returns the first element;
//       removeFirstOccurance(): boolean;
		//removeLastOccurance(): boolean	
		
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		
		System.out.println(l);
		
//		l.add(2,12);
//		System.out.println(l);
		
//		Collection<Integer> c = new ArrayList<Integer>();
//		c.add(13);
//		c.add(14);
//		l.addAll(c);
//		System.out.println(l);
		
		
		//l.addFirst(0);
		//System.out.println(l);
		//l.addLast(100);
		//System.out.println(l);
		
		//System.out.println(l.remove());//returns first removed element
		
//		LinkedList<String> s= new LinkedList<String>();
//		s.add("akash");
//		s.add("aish");
//		s.add("adi");
//		System.out.println(s.remove());
		
		//System.out.println(l.element());
		
//		Iterator<Integer> li = l.descendingIterator();
//		
//		while(li.hasNext()) {
//			Integer i = li.next();
//			System.out.print(i + " ");
//		}
		
				
		 
		//methods in list wrt stack
//		 push(): void;
//		 pop(): Object;
		 //poll(): Object;//returns and remove the first element

		 //peek(): Object; //returns the first element, but doen't remove
		 //peekFirst():Object; //returns the first element, but doen't remove
		 //peekLast():Object; //returns the last element, but doen't remove
		 //pollFirst(): Object;//returns and remove the first element
		 //pollLast(): Object;//returns and remove the last element
		
		l.push(1001);
		System.out.println(l);//inserts an element into the top of the stack
		l.push(1002);
		l.push(1003);
		l.push(1004);
		System.out.println(l);
		
//		Integer k = l.pop();
//		System.out.println(k);
		//System.out.println(l);//LIFO-removes the element inserted last
		
		
//		Integer l1 = l.peek();
//		System.out.println(l1);
//		System.out.println(l);
//		
//		Integer l2 = l.peekFirst();
//		System.out.println(l2);
//		System.out.println(l);
//		
//		Integer l3 = l.peekLast();
//		System.out.println(l3);
//		System.out.println(l);
		
		
//		Integer k1 = l.poll();
//		System.out.println(k1);
//		System.out.println(l);
		
//		Integer k1 = l.pollFirst();
//		System.out.println(k1);
//		System.out.println(l);
		
		Integer k1 = l.pollLast();
		System.out.println(k1);
		System.out.println(l);
		
		
	}
}
