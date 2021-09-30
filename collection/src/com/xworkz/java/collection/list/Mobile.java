package com.xworkz.java.collection.list;

public class Mobile {

	String brand;
	double price;
	
	public Mobile(String brand, double price, String name) {
		super();
		this.brand = brand;
		this.price = price;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", price=" + price + ", name=" + name + "]";
	}
	String name;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
