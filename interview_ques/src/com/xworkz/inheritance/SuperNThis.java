package com.xworkz.inheritance;

//Super keyword always refers to Parent class object
//Super keyword is derived based on inheritance (Super class)
//Super() is used to call Parent class constructor 
//Super can be used to get Parent class Objects, variable, method
//the Java compiler automatically inserts a call to the no-argument 
//constructor of the superclass.

class Motor{
	
	public static String name = "something";
	
	public static final String MODEL = "BOX";
	
	public void runs() {
		System.out.println("motor runs");
	}
}
class Bus extends Motor{
	
	public int noOfWheels;
	
	
	public Bus() {
		//1. calling super class constructor
		//first line of any base class constructor should be a call to super class constructor
		super();
	}
	
	public Bus(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	
	public void runs() {
		//1. getting parent class method
		super.runs();
		
		//2. getting parent class static variables
		System.out.println(super.name);
		System.out.println(super.MODEL);
		
		System.out.println("Bus runs");
	}
}
class Benz extends Bus{
	
	public void runs() {
		//I can't use 
//		super.super.runs();// Error
		super.runs();
 		System.out.println("Benz runs");
	}
}
public class SuperNThis {

	public static void main(String[] args) {
		Benz benz = new Benz();
		benz.runs();
	}
}
