package com.xworkz.programs;

public class CapitalizeEachWord {

	public static void main(String[] args) {
		String s = "akash is a good guy";
		String[] str = s.split("\\s");
		String res = "";
		for(String s1: str) {
			String firstChar = s1.substring(0,1).toUpperCase();
			String secondChar = s1.substring(1);
			res = firstChar+secondChar+" ";
		}
		System.out.println(res.trim());
	}
}
