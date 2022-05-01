package com.xworkz.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

class Student{
	
}
public class ListDemo implements Comparator{
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>(5);
		l.add("abc");
		l.add("abcd");
		l.add("akash");
		l.set(2, "adiii");
		System.out.println(l);
		
		ListIterator<String> i = l.listIterator();
		while(i.hasNext()) {
			String s = i.next();
			System.out.println(s);
		}
		Student s = null;
		System.out.println(l.contains(s));
		
		Integer[] i1 = new Integer[3];
		List<Integer> l1 = Arrays.asList(i1);
		System.out.println(l1);
		
		l.sort(new ListDemo());//need to pass a Comparator, meaning the object of a class which
		//implements Comparator and overrides compare() method
		
		System.out.println(l);
	}

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String) o1;
		String s2 = (String) o2;
		if(s1.length() > s2.length()) {
			return 1;
		}else if(s1.length() < s2.length()) {
			return -1;
		}else {
			return 0;
		}
	}


}

