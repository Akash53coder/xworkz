package com.xworkz.java;
import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		int[][] a = new int[3][3];
		//remove useDelimiter for spaces
		Scanner in = new Scanner(System.in).useDelimiter(",");
//		for(int row=0;row < a.length;row++) {
//			for(int col=0;col < a[row].length ; col++) {
//				int num = in.nextInt();
//				a[row][col]=num;
//			}
//		}
//		for(int row=0;row < a.length;row++) {
//			for(int col=0;col < a[row].length ; col++) {
//				System.out.print(a[row][col] + " ");
//				
//			}
//			System.out.println();
//		}
		
		//to take input in a single line
		int row=0,col=0;
		while(in.hasNext()) {
			if(in.hasNextInt())
			{
				a[row][col]=in.nextInt();
				col++;
				if(col==2) {
					if(row!=2) {
						row++;
						col=0;
						
					}else {
						break;
					}
					
				}
				
			}
			
		}
		for(int i=0;i < a.length;i++) {
		for(int j=0;j < a[i].length ; j++) {
			System.out.print(a[i][j] + " ");
			
		}
		System.out.println();
	}
		
	}
}

//public static void main(String[] args) {
//    Scanner in = new Scanner(System.in); 
//    while (in.hasNext()) {
//        if (in.hasNextInt())
//            System.out.println(in.nextInt());
//        else 
//            in.next();
//    }
//}
//By default, Scanner uses the delimiter pattern "\p{javaWhitespace}+" which matches at least one white space as delimiter. you don't have to do anything special.
//
//If you want to match either whitespace(1 or more) or a comma, replace the Scanner invocation with this
//
//Scanner in = new Scanner(System.in).useDelimiter("[,\\s+]");
