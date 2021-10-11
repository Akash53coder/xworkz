package com.xworkz.java.blocks.iibsssibs;

public class Charger {
	static String brand;
	 String color;
	 double price;
	
	{
		System.out.println("iib one");
		color="white";
		price=1002.0;
		
	}
	{
		System.out.println("iib two");
		color="black";
		price=2002.0;
		
	}
	
	static {
		System.out.println("static block one");
		brand="iphone";
	}
	static {
		System.out.println("static block two");
		brand="one puls";
	}
	
	Charger()
	{
		System.out.println("constructor called");
	}
	
	

}
