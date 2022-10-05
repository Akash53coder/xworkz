package com.xworkz.programs;


//write a program to print second highest integer in array
//to print elements from 0 to 100 without loops
public class OneToHundred {

	public static int i = 0;

	public static void print() {
		i++;
		System.out.println(i);
		if (i < 100) {
			print();
		}

	}

	public static void main(String[] args) {
		print();

	}
}
