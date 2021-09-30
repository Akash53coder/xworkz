package com.xworkz.java.collection.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		Mobile mobile = new Mobile("apple",67700.0,"iphone se");
		Mobile mobile1 = new Mobile("vivo",12000.0,"vivo v20");
		LinkedList<Mobile> list = new LinkedList();
		list.add(mobile);
		list.add(mobile1);
		
		Iterator<Mobile> itr = list.iterator();
		while(itr.hasNext()) {
			Mobile mob = itr.next();
			System.out.println(mob);
			
		}
	}

}
