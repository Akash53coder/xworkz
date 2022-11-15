package com.xworkz.inheritance;

class Super1{
	
	public void m1() {
		System.out.println("m1 called");
	}
	
	public static void m2() {
		System.out.println("m2 static method in Super1");
	}
}
public class Ex2 extends Super1{

	//I can't make a overridden method as static in child class
//	public static void m1() {
//		
//	}
	
	//I can't a overridden static method to non-static
//	public void m2() {
//		
//	}
//	
	public void m1() {
		System.out.println("m1 in Ex2");
	}
	
	public void display() {
		System.out.println("display called");
	}
}

class Ex2Starter{
	public static void main(String[] args) {
		
//		Ex2 ex = new Ex2();
//		ex.display();
//		
//		Super1 s = new Super1();
//		s.m1();
		
//		Super1 s1 = new Ex2();
		//s1.display() //-> error
		
//		Super1 s2 = new Ex2();
		//s2.display(); error
		
		//CCE
		//Without performing up-cast if we try to downcast , 
		//ClassCastException will be thrown.
//		Ex2 e = (Ex2) new Super1();
//		e.display();
//		
		//the above can be done like
//		Super1 sp1 = new Ex2();//first upcast
//		Ex2 ex1 = (Ex2) sp1;//next downcast
//		ex1.display();
		
		Super1 sup = new Ex2();
		sup.m1();
		
	}
}