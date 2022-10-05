package com.xworkz.ds;

public class Array {

	public static int findKey(int a[], int key) {
		for (int i = 0; i < a.length; i++)
			if (a[i] == key)
				return i;
		return -1;
	}

	//normal insertion
//	public static void insertElement(int a[], int ele, int index) {
//		a[index] = ele;
//		System.out.println(Arrays.toString(a));
//	}
	
	//insert and shift
	
	public static int insertNshift(int a[], int ele, int pos, int capacity, int length) {
		if(length == capacity)
			return length;
		int index = pos-1;
		for(int i = length-1; i >= index; i--)
			a[i+1] = a[i];
		a[index] = ele;
		return length+1;
		// worst case time complexity is O(n) for this (moving all elements if i want to insert element
		// at the beginning )
		
		//best case inserting at the end because no need to move any element O(1)
		
		//inserting at the beginning theta (n)
		
		//and in general time complexity of inserting an element is O(n)
	}
	
	public static void main(String[] args) {

		int[] a = new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
//		int i = Array.findKey(a, 10);
//		System.out.println(i);
		//Array.insertElement(a, 100, 1);
		
	}

}
