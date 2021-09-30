package com.xworkz.java.singled_arrays;

//to demonstrate default values before initialization
public class Arrays {

	public static void main(String[] args) {

		boolean[] b = new boolean[3];
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		int[] a = new int[-3];// NegativeArraySizeException
		System.out.println(a[1]);
		
		int[] ab = new int[2];
		System.out.println(ab[3]);//ArrayIndexOutOfBoundException
	}

}
