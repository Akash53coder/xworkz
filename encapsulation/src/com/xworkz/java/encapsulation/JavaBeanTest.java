package com.xworkz.java.encapsulation;

public class JavaBeanTest {

	public static void main(String[] args) {
		
		Bag bag = new Bag();
		bag.setBrand("wildcraft");
		bag.setColor("black");
		bag.setPrice(1200.00);
		
		System.out.println(bag.getBrand());
		System.out.println(bag.getColor());
		System.out.println(bag.getPrice());
		
	}

}
