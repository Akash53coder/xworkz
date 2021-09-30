package com.xworkz.java.customer_arrays;

public class Calendar {
	String size;
	int price;
	String name;
	String type;
	
	public Calendar(String size, int price, String name, String type) {
		this.size = size;
		this.price = price;
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Calendar [size=" + size + ", price=" + price + ", name=" + name + ", type=" + type + "]";
	}
	
	
	
	
}
