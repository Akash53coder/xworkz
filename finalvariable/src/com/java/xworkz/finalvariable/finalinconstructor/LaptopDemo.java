package com.java.xworkz.finalvariable.finalinconstructor;

public class LaptopDemo {
	public static void main(String a[]) {
		
		Laptop l1 = new Laptop();
		l1.display();
		
		Laptop l2 = new Laptop(53000.0);
		l2.display();
		
		Laptop l3 = new Laptop(54000.0,55500.0);
		l3.display();
	}

}
