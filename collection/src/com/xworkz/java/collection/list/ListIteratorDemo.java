package com.xworkz.java.collection.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

		LinkedList<String> linkedlist = new LinkedList();
		linkedlist.add("dog");
		linkedlist.add("tiger");
		linkedlist.add("cow");
		linkedlist.add("hamster");
		linkedlist.add("vole");
		
		
		ListIterator<String> litr = linkedlist.listIterator();
		while(litr.hasNext()) {
			String animal = litr.next();
			if(animal.equals("tiger")) {
				litr.add("cat");
			}
			else if(animal.equals("cow")) {
				litr.remove();
			}
			else if(animal.equals("hamster")) {
				litr.set("pig");
			}
			
		}
		System.out.println(linkedlist);

	}

}
