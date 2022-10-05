package com.xworkz.programs;

import java.util.HashMap;
import java.util.Map;

public class StringOccurance {

	public static void main(String[] args) {

		//character occurance
//		String s = "akashmablibli";
//
//		char[] ch = s.toCharArray();
//
//		Map<Character, Integer> map = new HashMap<>();
//
//		for (char c : ch) {
//			if (map.containsKey(c)) {
//				map.put(c, map.get(c) + 1);
//			} else {
//				map.put(c, 1);
//			}
//		}
//
//		System.out.println(map);
		
		//String occurance 
		String s = "akash an a good guy an akash good food fodder food";
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] str = s.split("\\s");
		for(String st : str) {
			if(map.containsKey(st)) {
				map.put(st, map.get(st)+1);
			}else {
				
				map.put(st, 1);
			}
		}
		System.out.println(map);

	}
}
