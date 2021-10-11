package com.xworkz.java.finalkeyword;

public class FinalDemo {
	
	// we cannot initialize a constant in a method
//	final int CAPACITY;
//	
//	void finalValue() {
//		CAPACITY=20;
//	}
	
	// we can create and initialize the final variable inside a method
	void finalValue() {
		final int CAPACITY;
		CAPACITY=20;
	}
	
	//we can initialize a final variable inside a constructor
	final int CAP;
	FinalDemo(){
		CAP=10;
		
	}
	FinalDemo(int i){
		CAP=20;
	}
	FinalDemo(int i, int j){
		CAP=30;
	}
	
	public static void main(String args[]) {
		FinalDemo fd = new FinalDemo();
		System.out.println(fd.CAP); // will print 10
		FinalDemo fd1 = new FinalDemo();
		System.out.println(fd1.CAP); //will print 10
		FinalDemo fd2 = new FinalDemo(10);
		System.out.println(fd2.CAP);//will print 20
		FinalDemo fd3 = new FinalDemo(10,20);
		System.out.println(fd3.CAP);//will print 30
		

		
	}
	

}
