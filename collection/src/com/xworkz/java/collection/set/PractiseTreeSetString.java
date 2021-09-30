package com.xworkz.java.collection.set;

import java.util.TreeSet;

public class PractiseTreeSetString {
	//bags demo
	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet(new PracticeTreeSetStringDemo());
		treeSet.add("wiki");
		treeSet.add("skybags");
		treeSet.add("puma");
		treeSet.add("adidas");
		treeSet.add("american");
		treeSet.add("nike");
		treeSet.add("tommyhilfiger");
		
		System.out.println(treeSet);
		
		
	}

}
