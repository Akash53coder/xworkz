package com.xworkz.java.Arrayclass;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String w = sc.next();
		int i=0,j=w.length()-1;
		boolean flag = false;
		while(i<j) {
			if(w.charAt(i)==w.charAt(j)) {
				continue;
				
			}else {
				break;
			}
		}
	}
}
