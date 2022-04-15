package com.xworkz.java;

public class AllStringMethods {
	public static void main(String[] args) {
		String a = "akash engineer good guy surname";
		
		System.out.println(a.concat("mabali"));
		System.out.println(a.replace('a', 'z'));
		System.out.println(a.replaceAll("\\s", ""));
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		
		System.out.println(a.substring(10,15));//takes 2 arguments startIndex and endIndex 
		//and returns a substring
		//also we have other versions 
		//System.out.println(a.substring(10));
		
		
		
		System.out.println(a.equals(""));//overridden to compare two object's content 
		System.out.println(a.equalsIgnoreCase(""));
		System.out.println(a.toString());//overridden to print object's content
		System.out.println(a.startsWith("a"));//takes (String prefix) as args
		System.out.println(a.endsWith("a"));//takes (String suffix) as args
		
		String[] str = a.split(" ");
		
		System.out.println(a.length());
		System.out.println(a.trim());//returns a string obj with removed trailing and leading spaces
		
		System.out.println(a.indexOf("abc")); //returns the int value arg can be char or any String value
		//it can also be a.indexOf('c')
		
		System.out.println(a.compareTo("abc"));//return a compares lexicographically and returns int value
		
		System.out.println(a.isEmpty());//returns true if length()=0 or String is empty
		
		System.out.println(a.charAt(0));//returns the car at index
		
		byte[] b = a.getBytes();//returns the byte value of each chars
		
		System.out.println(a.intern());//returns the String obj from SCP
		
		char[] ch = a.toCharArray();//returns each char in an array
		
		int  i = a.lastIndexOf('c');
		
		
		//these are static methods
		
		String s = String.valueOf('c');//returns the String representation of c;
		String s1 = String.valueOf("false");//valueOf(boolean b)
		String s2 = String.valueOf(10);//valueOf(int b) valueOf(float b) valueOf(byte b)
		//similar valueOf(char[] b) valueOf(Object obj)
				
		
		// Java 11 methods on String
		
		System.out.println(a.isBlank());//returns true if String has white space and Empty String
		
		System.out.println(a.strip());//removes leading and trailing space
		
		System.out.println(a.stripLeading()); //leading space removed
		
		System.out.println(a.stripTrailing());//removes trailing spaces
		
		System.out.println(a.repeat(1));//repeats the string based on the int value akashakashakash and returns the String
		
		
		
	}
}
