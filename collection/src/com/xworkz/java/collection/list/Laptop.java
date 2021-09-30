package com.xworkz.java.collection.list;

public class Laptop {
	
	public String brand;
	public double price;
	public String color;
	
	
	public Laptop(String brand,double price,String color) {
		
		this.brand=brand;
		this.price=price;
		this.color=color;
	}


	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}
}
