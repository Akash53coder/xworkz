package com.xworkz.java.collection.set;

import java.util.TreeSet;
public class PractiseTreeSetStringBuffer {

	public static void main(String[] args) {

		TreeSet<StringBuffer> treeSet = new TreeSet(new PractiseTreeSetStringBufferDemo());
		
		treeSet.add(new StringBuffer("wiki"));
		treeSet.add(new StringBuffer("american"));
		treeSet.add(new StringBuffer("puma"));
		treeSet.add(new StringBuffer("skybags"));
		treeSet.add(new StringBuffer("adidas"));
		treeSet.add(new StringBuffer("tommyhilfiger"));
		
		System.out.println(treeSet);
	}

}
