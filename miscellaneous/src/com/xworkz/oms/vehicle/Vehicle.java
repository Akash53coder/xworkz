package com.xworkz.oms.vehicle;

public class Vehicle {
	private String[] brand = new String[5];
	private int count = 0;

	public Vehicle() {
		System.out.println("Invoked no-arg constructor");
	}

	public void add(String vehicle) {
		System.out.println("Invoked add()");
		if (vehicle != null && this.count < this.brand.length) {
			brand[count] = vehicle;
			count++;
			System.out.println("added vehicle".concat(vehicle));
		} else {
			System.err.println("either vehicle is null or brand is full");
		}
	}

	public void displayVehicle() {
		System.out.println("invoked display method");
		for (int i = 0; i < this.brand.length; i++) {
			System.out.println(this.brand[i]);
		}
	}
}
