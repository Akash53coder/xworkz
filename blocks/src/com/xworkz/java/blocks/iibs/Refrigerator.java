package com.xworkz.java.blocks.iibs;

public class Refrigerator {
	
	String brand;
	int capacity;
	String color;
	
	
	{
		System.out.println("calling first iibs");
		brand="LG";
		capacity=100;
		color="black";
	}
	
	{
		System.out.println("calling second iibs");
		brand="samsung";
		capacity=100;
		color="blue";
	}
	
	Refrigerator(){
		System.out.println("Refrigerator constructor called");
	}
	

}
