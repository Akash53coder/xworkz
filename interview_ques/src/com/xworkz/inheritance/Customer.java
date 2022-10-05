package com.xworkz.inheritance;

class Customer {
	
	public static String customerType;
	
	public static final String HOTEL_MAPPED;
	
	//better you assign this in constructor as it's a Objects constant
	public final int hotelId = 12;
	
	//these private members will not be accessible by the child
	
//	private static String customerType;
//	
//	private static final String HOTEL_MAPPED;
//	
//	private final int hotelId = 12;
	
	static {
		customerType = "Indian";
		HOTEL_MAPPED = "Avatar";
	}
	
	private String customerId;
	private String customerName;
	
	public Customer(String customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
	}
	public Customer() {
		System.out.println("Parent Default Constructor");
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void displayCustomerDetails() {
		System.out.println(" \n***************************");
		System.out.println("Customer Id : " + customerId);
		System.out.println("Customer Name : " + customerName);
		System.out.println();
	}
	
	public static String m1() {
		return "static method called from Customer";
	}
}

