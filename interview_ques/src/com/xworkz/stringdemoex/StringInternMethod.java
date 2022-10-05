package com.xworkz.stringdemoex;

public class StringInternMethod {

	public static void main(String[] args) {
		// important constructors of String
		// String();
		// String (StringBuffer sb);
		// String (StringBuilder sb);
		// String (byte[] b);
		// String (Char[] c);

		// intern method of a String
		// intern() always returns a canonical representation of a String
		//in the sense We can use the method String.intern() to create string literals 
		//for the string objects. 
		// When the intern method is invoked, if the pool already contains a string equal to
		// this String object as determined by the equals(Object) method, then the
		// string from the pool is returned. Otherwise, this String object is added to the pool and
		// a reference to this String object is returned.

		String s = new String("akash");
		String s1 = s.intern();

		System.out.println(s == s1);
	}

}
