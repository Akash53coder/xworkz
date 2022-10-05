package com.xworkz.collection.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		
		//here don't use list.remove() in while loop to remove
		//we will get ConCurrentModificationException
		//use Iterator's remove method instead
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			Integer i = itr.next();
			if(i % 2==0) {
				System.out.println(i);
			}else {
				itr.remove();
			}
		}
		System.out.println(list);
	}
}
