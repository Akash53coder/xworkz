package com.xworkz.java.collection.set;

import java.util.Comparator;

public class PractiseTreeSetStringBufferDemo implements Comparator<StringBuffer>{

	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
		String str1=o1.toString();
		String str2=o2.toString();
		
		if(str1.length()<str2.length()) {
			return -1;
		}else if(str1.length()>str2.length()) {
			return 1;
		}else {
			return str1.compareTo(str2);
		}
	}
}
