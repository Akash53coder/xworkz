package com.xworkz.java;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
//		int a[] = new int[5];
//		System.out.println(a);
//		
//		byte b[] = new byte[9];
//		System.out.println(b.toString());
//		
//		char ch[] = new char[3];
//		System.out.println(ch.toString());
//		
//		
//		Integer i[] = new Integer[5];
//		System.out.println(i.toString());

//		Integer ab = null;
//		System.out.println(ab);

//		Character c[] = new Character[9];
//		System.out.println(c.toString());
//
//		
//		String s = new String("akash");
//		System.out.println(s.toString());

//		int a[] = {1,2,3,4,5};
//		char c[] = {'a','b','v'};
//		String s = new String(c);

//		int[] a = new int[5];
//		System.out.println(Arrays.toString(a));

		// to print 2-d array using Arrays
//		int arr[][] = { { 23, 70, 39 }, { 51, 64, 47 }, { 81, 11, 105 } };
		//can also be done like this
//		int arr[][] = new int[][] { { 23, 70, 39 }, { 51, 64, 47 }, { 81, 11, 105 } };
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(Arrays.toString(arr[i]));
//		}
		
		int[] b = {1,4,5,3,6,2,8,9,7};
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		
		int index = Arrays.binarySearch(b, 3);
		System.out.println(index);
		
		int b1[] = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.equals(b, b1)); //return true or false

	}
}
