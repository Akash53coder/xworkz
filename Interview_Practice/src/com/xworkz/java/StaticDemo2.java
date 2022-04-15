package com.xworkz.java;

public class StaticDemo2 {
	private static int counter;
	private int driverId=0;
	static {
//	    int randomNumber = 121;
//	    counter = (int) Math.pow(randomNumber, 3);
	   counter=0;
	}
	StaticDemo2(){
		this.driverId = counter++;
		System.out.println("this is counter "+counter);
		System.out.println("inside StaticDemo2 "+this.driverId);
	}

	public static void main(String[] args) {
		StaticDemo2 s = new StaticDemo2();
		System.out.println(s.driverId);
		StaticDemo2 s2 = new StaticDemo2();
		System.out.println(s2.driverId);
		StaticDemo2 s3 = new StaticDemo2();
		System.out.println(s3.driverId);
	}
}
