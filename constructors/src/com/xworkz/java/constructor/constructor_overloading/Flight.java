package com.xworkz.java.constructor.constructor_overloading;

public class Flight {
	
	public String flightName="N307";
	public String number="435";
	public int capacity=200;
	public String source="Bangalore";
	public String destination="Singapore";	
	
	Flight(){
		System.out.println("default constructor called");
	}
	
	Flight(String flightName,String number,int capacity,String source,String destination){
		
		this.flightName=flightName;
		this.number=number;
		this.capacity=capacity;
		this.source=source;
		this.destination=destination;	
		System.out.println("Flight [flightName=" + flightName + ", number=" + number + ", capacity=" + capacity + ", source="
				+ source + ", destination=" + destination + "]");
	}


	

}
