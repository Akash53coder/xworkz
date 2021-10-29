package com.xwrokz.oms.helmet;

public class Helmet {
	private String[] brand = new String[5];
	public int count = 0;

	public Helmet() {
		System.out.println("Invoked no-arg constructor");
	}

	public void add(String helmet) {
		System.out.println("Invoked add()");
		if (helmet != null && this.count < this.brand.length) {
			brand[count] = helmet;
			count++;
			System.out.println("added Helmet brand".concat(helmet));
		} else {
			System.err.println("either Helmet is null or brand array is full");
		}
	}

	public void displayVehicle() {
		System.out.println("invoked display method");
		for (int i = 0; i < this.brand.length; i++) {
			System.out.println(this.brand[i]);
		}
	}
	
	
	public int some() {
		return 1;
	}
	
	
	public boolean b() {
		return true;
	}
}
