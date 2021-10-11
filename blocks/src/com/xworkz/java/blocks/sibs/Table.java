package com.xworkz.java.blocks.sibs;

public class Table {
	
	static String name;
	static String color;
	static double price;
	
	static {
		System.out.println("static one");
		name="computer table";
		color="brown";
		price=5000.0;
	}
	static {
		System.out.println("static two");
		name="dyning table";
		color="black";
		price=10000.0;
	}
	
	//a non-static method can make a reference to static variable
	public void display() {
		System.out.println(name);
	}
	

}
