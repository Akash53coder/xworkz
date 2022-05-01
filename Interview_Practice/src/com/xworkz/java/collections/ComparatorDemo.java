package com.xworkz.java.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>(new MyComp());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(20);
		t.add(20);
		System.out.println(t);
	}
}

class MyComp implements Comparator {

	//to print elements in descending order
//	public int compare(Object o1, Object o2) {
//		Integer i1 = (Integer) o1;
//		Integer i2 = (Integer) o2;
//		if (i1 < i2)
//			return 1;
//		else if (i1 > i2)
//			return -1;
//		else
//			return 0;
//	}
	
	//possibalities 
//	@Override
//	public int compare(Object o1, Object o2) {
//		Integer i1 = (Integer) o1;
//		Integer i2 = (Integer) o2;
//		return i1.compareTo(i2);
//	}
	
//	@Override
//	public int compare(Object o1, Object o2) {
//		Integer i1 = (Integer) o1;
//		Integer i2 = (Integer) o2;
//		return  -i1.compareTo(i2);
//	}
	
//	@Override
//	public int compare(Object o1, Object o2) {
//		Integer i1 = (Integer) o1;
//		Integer i2 = (Integer) o2;
//		return  i2.compareTo(i1);
//	}
	
	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		return  1;
		//return -1;
		//return 0; //only first element inserted and all other elements are considered as 
		//duplicate
	}
}
