package com.xworkz.java.singled_arrays;

import java.util.Scanner;

public class ArrayScan {

	public static void main(String[] args) {

		System.out.println("Enter number of elements");
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		String[] str = new String[n];
		System.out.println("Enter the String array elements");
		for(int i=0;i<str.length;i++) {
			str[i]=in.next();
		}
		
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}

}
