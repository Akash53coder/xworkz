package com.xworkz.oms.monitor;

public class Monitor {

	private String[] brand = new String[5];
	private int count = 0;

	public Monitor() {
		System.out.println("Invoked no-arg constructor");
	}

	public void add(String monitor) {
		System.out.println("Invoked add()");
		if (monitor != null && this.count < this.brand.length) {
			brand[count] = monitor;
			count++;
			System.out.println("added monitor".concat(monitor));
		} else {
			System.err.println("either monitor is null or brand is full");
		}
	}

	public void displayMonitor() {
		System.out.println("invoked display method");
		for (int i = 0; i < this.brand.length; i++) {
			System.out.println(this.brand[i]);
		}
	}

}
