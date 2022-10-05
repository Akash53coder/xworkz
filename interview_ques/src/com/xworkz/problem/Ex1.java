package com.xworkz.problem;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex1 {
	
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "akash");
		map.put(6, "wew");
		map.put(5, "er");
		map.put(4, "fgg");
		map.put(2, "asd");
		map.put(3, "df");
		
//iterate hashmap
//		Set<Entry<Integer, String>> s = map.entrySet();
//		Iterator itr = s.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
//sorted hashMap		
		TreeMap<Integer, String> t = new TreeMap<Integer, String>(map);
		Set s = t.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
