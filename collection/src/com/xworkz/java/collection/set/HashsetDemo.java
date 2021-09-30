package com.xworkz.java.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {
	public static void main(String[] args) {
		
		HashSet<Character> hashset = new HashSet();
		hashset.add('a');
		hashset.add('b');
		hashset.add('c');
		hashset.add('d');
		
		hashset.add(null);
		hashset.add(null);
		
		System.out.println(hashset);
		
		Iterator<Character> itr = hashset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
