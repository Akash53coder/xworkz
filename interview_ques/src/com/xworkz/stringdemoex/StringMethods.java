package com.xworkz.stringdemoex;

import java.util.Arrays;

public class StringMethods {
	
	public static void main(String[] args) {
			
		String s = new String("akash");
		
		String s1 = s.concat(" mabali is good guy!!");

		//System.out.println(s.toUpperCase());
		//System.out.println(s.toLowerCase());
		
		System.out.println(s1.replace('\s','.'));
		//*** use \\s for space in replaceAll() because it's regex(which takes a String)
		System.out.println(s1.replaceAll("\\s", ""));
		
		//System.out.println(s.indexOf('a'));
		//System.out.println(s.lastIndexOf('a'));
		
		//System.out.println(s.charAt(0));
		
		//System.out.println(s.substring(2));
		//System.out.println(s.substring(1,3));
		
		//System.out.println(s1.compareTo(s)); //lexographically it checks
		
		
		String s3 = " akash ";
		System.out.println(s3.trim());//removes trailing and leading space
		
		char[] ch = s3.toCharArray();
		System.out.println(ch);
		
		byte[] b = s3.getBytes();
		
		
		//isEmpty considers "\\s" as not empty
		//isEmpty returns true if, s.length == 0
		String s4 = " ";
		System.out.println(s4.isEmpty());
		
		//return true if string object has white space, or empty
		String s5 = " ";
		System.out.println(s5.isBlank());
		
		
		String s6 = "akash mabali is an engineer";
		String[] s7 = s6.split("\\s");
		System.out.println(Arrays.toString(s7));
		
		//program to remove all spaces in String
		String s8 = " akash   mabali is an engineer";
		String[] s9 = s8.split("\\s");
		StringBuffer sb = new StringBuffer();
		for(String s10: s9) {
			if(!s10.equals("\\s")) {
				sb.append(s10);
			}
		}
		System.out.println(sb.toString());
		
		String s11 = "akash";
		System.out.println(s11.repeat(10));
		
		//trim and strip are almost same
		System.out.println("akash".strip());
		System.out.println("akash".trim());
		
		//matches() used to match a String with any regex
		System.out.println("999".matches("[0-9]+"));
		
		System.out.println("akash".length());
		
		System.out.println("akash".startsWith("a"));
		System.out.println("akash".endsWith("a"));
		
		//Static Methods of String
		//all valueOf() will convert respective types to String type
		boolean b1 = true;
//		String s89 = String.valueOf(b1);
		System.out.println(String.valueOf(b1));
		
//		System.out.println(String.valueOf(byte b));
//		System.out.println(String.valueOf(char c));
//		System.out.println(String.valueOf(int i));
//		System.out.println(String.valueOf(float f));
//		System.out.println(String.valueOf(double d));
		
		//same applies for Wrapper class also
		Integer i = 10;
		System.out.println(String.valueOf(i));
		
		Double d = 10.0;
		System.out.println(String.valueOf(i));
		
		
	}
}
