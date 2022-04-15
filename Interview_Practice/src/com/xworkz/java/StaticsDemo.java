package com.xworkz.java;

public class StaticsDemo{
	public static int rollno = 0;
	public String name;
	
//	static{
//		System.out.println("Static block called");
//		rollno++;
//	}
	StaticsDemo(){
		System.out.println("constructor called");
		rollno++;
	}
	StaticsDemo(String name){
		System.out.println("constructor called");
	}
	public static void main(String[] args) {
		StaticsDemo s = new StaticsDemo();
		System.out.println(rollno);
		StaticsDemo s2 = new StaticsDemo();
		System.out.println(rollno);
		StaticsDemo s3 = new StaticsDemo();
		System.out.println(rollno);
		StaticsDemo s4 = new StaticsDemo();
		System.out.println(rollno);
//		StaticsDemo s1 = new StaticsDemo("akash");
//		System.out.println(rollno);
//		
	}
}