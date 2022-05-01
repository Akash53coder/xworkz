package com.xworkz.java.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreesetDemo {
	public static void main(String[] args) {
		SortedSet<String> s = new TreeSet<String>();
		s.add("kim");
		s.add("akash");
		s.add("zan");
		System.out.println(s);
		
		TreeSet<Character> t=new TreeSet<Character>();
		t.add('A');
		t.add('L');
		t.add('B');
		t.add('z');
		t.add('Z');
		t.add('a');
		t.add('2'); //numerics will be added first
		System.out.println(t);
	}
}
