package com.xworkz.java.singled_arrays;

public class SumOfElmnts {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3,4},{5,6,7,8}};
		int ct=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				ct+=arr[i][j];
			}
		}
		System.out.println(ct);
		
	}

}
