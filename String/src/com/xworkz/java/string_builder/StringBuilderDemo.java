package com.xworkz.java.string_builder;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();//it constructs empty string 
		//of size 16 here we have used no-argument constructor of StrinBuffer
		System.out.println("value is"+sb);
		
		sb.append("akashmabali");
		System.out.println(sb);//mutable
		
		sb.delete(5, 11);
		System.out.println(sb);
		
		sb.deleteCharAt(1);
		System.out.println(sb);
		
		sb.insert(1,"ab");
		System.out.println(sb); 
	}

}
