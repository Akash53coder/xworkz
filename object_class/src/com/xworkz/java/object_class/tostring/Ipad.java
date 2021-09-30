package com.xworkz.java.object_class.tostring;

public class Ipad {

	String ramSize;
	String cameraQuality;
	double price;
	String brand;
	
	public Ipad(String ramSize, String cameraQuality, double price, String brand) {
		this.ramSize = ramSize;
		this.cameraQuality = cameraQuality;
		this.price = price;
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "ipad [ramSize=" + ramSize + ", cameraQuality=" + cameraQuality + ", price=" + price + ", brand=" + brand
				+ "]";
	}
	
	
	
	
}
