package com.xworkz.inheritance;

class Super1{
	
	public void m1() {
		System.out.println("m1 called");
	}
}
public class Ex2 extends Super1{

	public void display() {
		System.out.println("display called");
	}
}

class Ex2Starter{
	public static void main(String[] args) {
		
		Ex2 ex = new Ex2();
		ex.display();
		
		Super1 s = new Super1();
		s.m1();
		
		Super1 s1 = new Ex2();
		//s1.display() //-> error
		
		Super1 s2 = (Super1) new Ex2();
		//s2.display(); error
		
		//in order to get subclass methods I need to type cast
		Ex2 e = (Ex2) new Super1();
		e.display();
		
		
	}
}