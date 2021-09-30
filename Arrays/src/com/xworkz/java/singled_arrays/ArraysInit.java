package com.xworkz.java.singled_arrays;

public class ArraysInit {

	public static void main(String[] args) {
		
		int[] a = new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		
		int []ar = {1,2,3};//valid

		int[] arr = {1,2,3,4,5};
		System.out.println(arr);//prints address I[@6504e3b2 i.e fully qualified name
		System.out.println(arr[0]);
		
		boolean[] b = new boolean[3];
		System.out.println(b);//prints [Z@379619aa
		
		String[] s = new String[3];
		System.out.println(s);//prints [Ljava.lang.String;@cac736f
		
		float[] f = new float[4];
		System.out.println(f);//prints [F@766352
		
		double[] d = new double[1];
		System.out.println(d);//prints [D@872932
		
		
	}

}
