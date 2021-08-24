package com.xworkz.java.constructor.parameterized_constructors;

public class Flight {

	public String flightName;
	public String number;
	public int capacity;
	public String source;
	public String destination;
	
	 Flight(String flightName,String number,int capacity,String source,String destination) {
		
		 this.flightName=flightName;
		 this.capacity=capacity;
		 this.source=source;
		 this.destination=destination;
		 this.number=number;
		 
	}
	
}
