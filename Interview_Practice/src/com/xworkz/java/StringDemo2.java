package com.xworkz.java;

public class StringDemo2 {

	public static void main(String[] args) {
//		String str = "akash mabali is a good guy";
//		String str1[] = str.split(" ");
//		String resultString = "";
//		for(String s: str1) {
//			resultString+=s;
//		}
//		System.out.println(resultString);
		String str = "akash mabali is a good guy";
		String str1 = str.replaceAll("\\s", "");
		System.out.println(str1);
	}
}
