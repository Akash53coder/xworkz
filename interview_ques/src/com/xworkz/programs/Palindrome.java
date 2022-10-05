package com.xworkz.programs;

public class Palindrome {

	public static void main(String[] args) {
		String s = "akash";
		StringBuffer sf = new StringBuffer(s);
		String st = sf.reverse().toString();
		if(s.equals(st)) {
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}
	}
}
