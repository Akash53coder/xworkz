package com.xworkz.java.constructor.parameterized_constructors;

public class FlightDemo {
	
	public static void main(String args[]) {
		
		Flight flight = new Flight("N403","5446",233,"bangalore","sigapore");
		System.out.println(flight.flightName);
		System.out.println(flight.capacity);
		System.out.println(flight.number);
		System.out.println(flight.destination);
		System.out.println(flight.source);
	}
	

}
