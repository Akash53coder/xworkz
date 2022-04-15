package com.xworkz.java;

public class TernaryOP {
	public static void main(String[] args) {
//		boolean res = (10>20) ? false : true;
//		System.out.println(res);
		
		byte b = 10;
		
		switch(b+1) {
			case 12: System.out.println("1");
			break;
			case 20: System.out.println("2");
			break;
			default: System.out.println("default");
			case 11: System.out.println("11");//prints 11
			break;
		}
		
		int a = 10;
		System.out.println(Integer.toBinaryString(a));
		
		int[] arr = new int[12];
		
		
	}
}
