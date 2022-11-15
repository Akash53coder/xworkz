package com.xworkz.inheritance;


//ClassCastException is unchecked exception
//Can be avoided using instanceof operator
//upcasting is handled by a compiler implicitly.
//Upcasting narrows the list of methods and properties available to this object, 
//and downcasting can extend it.
//https://www.baeldung.com/java-type-casting
class Vehicle{
	
}

class Car extends Vehicle {
	
	public final String name = "Innova";
	
	public static void method(Vehicle v) {
		
		if(v instanceof Car) {
			//Without performing up-cast if we try to downcast, 
			//ClassCastException will be thrown.
			Car c = (Car) v;
			System.out.println("car name - " + c.name);
		}else {
			System.out.println("not an instance");
		}
	}
	
}

public class DownCastDemo {

	public static void main(String[] args) {
		
		//implicit type casting 
		Vehicle v = (Vehicle) new Car();
		//can also be Vehicle v = new Car()
		Car.method(v);
		
		Vehicle v1 = new Vehicle();
		Car.method(v1);
	}
}
