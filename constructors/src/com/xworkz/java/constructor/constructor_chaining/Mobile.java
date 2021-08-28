package com.xworkz.java.constructor.constructor_chaining;

public class Mobile {
	
	String brand;
	String color;
	double price;
	
	Mobile(){
		this("on plus","black");
		System.out.println("default constructor");
	}
	
	Mobile(String brand){
		this(brand,"black",20000.00);
		this.brand=brand;
		System.out.println("single constructor");

	}
	Mobile(String brand,String color){
		this(brand,"black",20000.00);
		System.out.println("two parameterized constructor");

	}
	Mobile(String brand,String color,double price){
		this.brand=brand;
		this.color=color;
		this.price=price;
		System.out.println("three parameterized constructor");

	}	

}
