package com.xworkz.java.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo2 {
	public static void main(String[] args) {
		TreeSet<StringBuffer> t = new TreeSet<StringBuffer>(new MyComparator1());
		t.add(new StringBuffer("L"));
		t.add(new StringBuffer("S"));
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		System.out.println(t);
	}
}
class MyComparator1 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();		
		return s2.compareTo(s1);
	}
	
}
