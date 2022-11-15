package com.xworkz.exception;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		int[] arr = {5,4,6,3,1,2};
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
