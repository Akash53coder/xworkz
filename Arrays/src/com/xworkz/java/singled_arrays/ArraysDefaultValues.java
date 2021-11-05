package com.xworkz.java.singled_arrays;

import java.util.Arrays;

//to demonstrate default values before initialization
public class ArraysDefaultValues {

	int intArray[] = new int[3];
	float floatArray[] = new float[3];
	byte byteArray[] = new byte[3];
	boolean boolArray[] = new boolean[3];
	String stringArray[] = new String[3];
	char charArray[] = new char[3];
	
	public static void main(String[] args) {

		ArraysDefaultValues obj = new ArraysDefaultValues();
		System.out.println(obj.intArray);//hashcode
		System.out.println(Arrays.toString(obj.intArray));//[0,0,0]
		System.out.println(Arrays.toString(obj.floatArray));//[0.0,0.0,0.0]
		System.out.println(Arrays.toString(obj.byteArray));//[0,0,0]
		System.out.println(Arrays.toString(obj.boolArray));//[false,false,false]
		System.out.println(Arrays.toString(obj.stringArray));//[null,null,null]
		System.out.println(Arrays.toString(obj.charArray));//[ ,  ,  ]
		
		System.out.println("------------------------------");
		boolean[] b = new boolean[3];
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		int[] a = new int[-3];// NegativeArraySizeException
		System.out.println(a[1]);

		int[] ab = new int[2];
		 System.out.println(ab[3]);// ArrayIndexOutOfBoundException
	}

}
