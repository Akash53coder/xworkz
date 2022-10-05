package com.xworkz.collection.maps;

import java.util.HashMap;
import java.util.Map;

public class OccuranceChar {

	public static void main(String[] args) {
		
		String str = "competetion";
		char[] ch = str.toCharArray();
//		Map<Character, Integer>  map = new HashMap<>();
//		for(char c: ch) {
//			if(map.containsKey(c)) {
//				map.put(c, map.get(c)+1);
//			}else {
//				map.put(c, 1);
//			}
//		}
//		System.out.println(map);
		
		for(int i=0; i< ch.length;i++) {
			int ct = 1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i] == ch[j]) {
					ct+=1;
				}
			}
			System.out.print("{" + ch[i] + "="+ ct + "}, ");
		}
	}
}
