package com.xworkz.java.string;

public class StringWithNewKeyword {

	public static void main(String[] args) {

		String str = new String("Manju");//it creates 2 objects
		String str1=str.intern();
		
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		
	}

}
