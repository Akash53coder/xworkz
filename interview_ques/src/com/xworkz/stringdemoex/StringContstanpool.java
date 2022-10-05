package com.xworkz.stringdemoex;

//Every time you create a string literal, the JVM checks the String constant pool. 
//String constant pool in Java is a pool of Strings stored in Heap memory. 
//If the string exists in the pool, then a reference to the existing literal is returned. 
//If the string is not found, then a new instance is created and placed in the pool. 
public class StringContstanpool {

	public static void main(String[] args) {
		
		String s = "Welcome";
		String s1 = "Welcome";
		
		if(s==s1) {
			System.out.println("true");
		}
		
		if(s1.equals(s)) {
			System.out.println("true");
		}
		
//Strings behave a bit differently when a new instance of String class is created.When you 
//create a string using the new() keyword, JVM places the literal in the constant pool and 
//also creates a new string object in heap memory. The reference variable points to the 
//object in the heap memory.

//In the below example, either 1 or 2 strings will be created. If there is already a string 
//literal "Welcome" in the pool, then only one string will be created. If there is no string 
//literal "Welcome" in the pool, then it will be first created in the pool and then in the 
//heap memory resulting in creation of 2 String objects. 	
		
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		if(s2==s3) {
			System.out.println("true address equal");
		}else {
			System.out.println("address are different");
		}
		
		
		if(s1.equals(s2)) {
			System.out.println("content is same");
		}
		
		
	}
}

