package com.xworkz.java.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set<String> s  = new HashSet<String>();
		//all the methods are same as in Collection
		
		//all the elements are stored in hashtable based on the hasCode value
		//insertion order is not preserved 
		//duplicated not allowed
		HashSet<String> h = new HashSet<String>();
		h.add("akash");
		h.add("akash");
		h.add("abc");
		h.add(null);
		System.out.println(h);
		
		//insertion order preserved 
		//duplicates not allowed
		LinkedHashSet<String> l = new LinkedHashSet<String>();
		l.add("akash");
		l.add("akash");
		l.add(null);
		System.out.println(l);
	}
}
