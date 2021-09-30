package com.xworkz.java.collection.set;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet treeset = new TreeSet();
		
		treeset.add(12.4f);
		treeset.add(10.4f);
		treeset.add(103.0f);
		treeset.add(78.3f);
		treeset.add(14.3f);
		//ClassCastException
		treeset.add('q');
		
		System.out.println(treeset);
		
		
	}
}
