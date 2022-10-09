package com.xworkz.stringdemoex;

public class StringBasics {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		
		System.out.println(s1.hashCode());//96354
		System.out.println(s2.hashCode());//96354
		
//		String s3 = "abc";
//		System.out.println(s3.hashCode());//96354
		
//		System.out.println(s3.intern());
		
		String s4 = s2+"";
		System.out.println(s4.hashCode());//96354
		
		System.out.println(s4.intern());
		
		String s5 = s2 + "z";
		System.out.println(s5.hashCode());
		System.out.println(s5.intern());
		
		String s6 = new String("abc");
		System.out.println(s6.intern().hashCode());//96354
		
	}
			
}

