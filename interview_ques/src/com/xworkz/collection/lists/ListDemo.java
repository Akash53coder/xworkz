package com.xworkz.collection.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ListDemo {

	public static void main(String[] args) {
//		List list = new ArrayList();
//		list.add("String");
//		list.add(1);
//		
//		System.out.println(list.remove(1));
//		 
//		List l1 = new ArrayList();
//		l1.add(3);
//		
//		list.addAll(0, l1);
		
		
		//program to remove last occurrence of a given value
//		List<Integer> list = new ArrayList<>();
//		list.add(10);
//		list.add(11);
//		list.add(12);
//		list.add(13);
//		list.add(10);
//		list.add(14);
//		
//		int val = 10;
//
//		Iterator<Integer> i = list.iterator();
//		int ct = 0;
//		while(i.hasNext()) {
//			if(i.next() == val) {
//				ct+=1;
//			}
//		}
//		if(ct >= 2) {
//			int i1 = list.lastIndexOf(val);
//			list.remove(i1);
//		}
//		
//		System.out.println(list);
		
		//to remove duplicates from an arraylist
		
		//List<Integer> list = new ArrayList<>(Arrays.asList(10,11,12,13,10,14));
		
//		List<Integer> newList = new ArrayList<>();
//		for(Integer i: list) {
//			if(!newList.contains(i)) {
//				newList.add(i);
//			}
//		}
//		
//		System.out.println(newList);
		
//		Iterator itr = list.iterator();
//		while(itr.hasNext()) {
//			int curi = list.indexOf(itr.next());
//			int lati = list.lastIndexOf(itr.next());
//			if(curi != lati) {
//				System.out.println(curi);
//
//			}
//				
//		}
//		System.out.println(list);
		
		List arraylist = new ArrayList();
		arraylist.add(null);
		arraylist.add(null);
		arraylist.add(null);
		arraylist.add(null);
		
		System.out.println(arraylist);
		
		List l1 = new LinkedList();
		l1.add(0, "a");
		l1.add(null);
		l1.add(null);
		System.out.println(l1);
		
		List l2 = new ArrayList(Arrays.asList(1,2,5,4));
		Collections.sort(l2);
		System.out.println(l2);
		
		List l3 = new ArrayList(Arrays.asList(1,2,3,1,2,4));
		Set l4 = Collections.singleton(l3);
		System.out.println(l4);
		
	}
}