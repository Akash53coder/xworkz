package com.xworkz.java;

public class Objhashcode {
	public static void main(String[] args) {
		String s1 = "durga";
		String s2 = "durga";
		
		//in String class both equals and hashcode are overridden for "content comparison"
		//normally in Object class equals and hashcode are written for reference comparison
		
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
		
		String s3 = new String("akash");
		String s4 = new String("akash");
		//in String class hashcode is same for all devices as it is overridden for content comparison 
		System.out.println(s3.equals(s4));
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		//in StringBuffer equals and hashcode are not overriden
		StringBuffer sb = new StringBuffer("durga");
		StringBuffer sb1 = new StringBuffer("durga");
		
		//in StringBuffer the hashcode is not overwritten so, the values from system to system
		System.out.println(sb.equals(sb1));
		System.out.println(sb.hashCode());
		System.out.println(sb1.hashCode());
		
		//in all wrapper class equals are overriden
		Integer i = 10;
		Integer i1 = 10;
		
		System.out.println(i.equals(i1));
		System.out.println(i.hashCode());
		System.out.println(i1.hashCode());
		
		
	}
}
