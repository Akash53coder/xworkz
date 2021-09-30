package com.xworkz.java.singled_arrays;

public class ArraySort {

	public static void main(String[] args) {
		int[] array = {100,500,200,300};
	       int tmp = 0;
	        for (int i = 0; i < array.length; i++) {
	            for (int j = i + 1; j < array.length; j++) {
	                if (array[i] > array[j]) {
	                	tmp = array[i];
	                    array[i] = array[j];
	                    array[j] = tmp;
	                }
	            }
	        }
	        
	        for(int i=0;i<array.length;i++) {
	        	System.out.print(array[i]+" ");
	        }
	}

}
