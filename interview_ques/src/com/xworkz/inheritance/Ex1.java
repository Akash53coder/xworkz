package com.xworkz.inheritance;

//here  method hiding happens not method overriding
//SuperClass.m1() calls SuperClass's m1() and
//Ex1.m1(); calls Ex1's m1() 
//static methods cannot be overridden
class SuperClass{
	public static void m1() {
		
	}
}
public class Ex1 extends SuperClass{

	public static void m1() {
		
	}
	
}
