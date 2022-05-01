package com.xworkz.java.collections;

import java.util.Comparator;
import java.util.TreeSet;

//to insert element in reverese order
public class ComparatorDemo1 {
	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>(new MyComparator());
		t.add("Roja");
		t.add("Shoba Rani");
		t.add("Raja Kumari");
		t.add("Ganga Bhavani");
		t.add("Ramulamma");
		System.out.println(t);
	}
}

class MyComparator implements Comparator{
	
	public int compare(Object o1, Object o2) {
		String s1 = (String)o1; //or
		String s2 = o2.toString();
		return -s1.compareTo(s2);
	}
}

