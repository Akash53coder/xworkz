package com.xworkz.java;

import java.io.FileNotFoundException;

import java.io.PrintWriter;

//throw keyword is applied only for Throwable types
public class Exception2 {
	
	public Exception2() {
		
	}
	//static ArithmeticException e = new ArithmeticException();

	public static void main(String[] args){

		//throw new ArithmeticException();
//		PrintWriter pw = new PrintWriter("abc.txt");
//		System.out.println(pw);

		// System.out.println("sd");
		
		//throw new RuntimeException();//no error
		
		//throw new Exception();//CE need to handle
		
		
//		try {
//			System.out.println("h");
//		}catch(ClassNotFoundException e) {//CE
//			
//		}
//		
//		try {
//			
//		}catch(Exception e) { //no CE
//			
//		}
		
//		try {
//			
//		}catch(ArithmeticException e) { // no CE
//			
//		}
		
		
		Thread t = new Thread();
		t.start();
		t.start(); //IllegalThreadStateException
	}
}
