package com.xworkz.inheritance;

class RegularCustomer extends Customer {
	private float discount;
	
	private static String customerType;
	
	private static final String HOTEL_MAPPED = "Taj";
	
	public RegularCustomer(String custId, String custName) {
		super();
		this.setCustomerId(custId);
		this.setCustomerName(custName);
		this.discount = 5.0f;
		System.out.println("Child Constructor");
		System.out.println("customer type " + Customer.customerType);
		System.out.println("customer type " + RegularCustomer.customerType);
		System.out.println("hotel mapped" + Customer.HOTEL_MAPPED);
		System.out.println("hotel mapped" + RegularCustomer.HOTEL_MAPPED);
		
		System.out.println("hotel id"+ hotelId);
		
		//yes static methods also inherited
		System.out.println(Customer.m1());
		System.out.println(RegularCustomer.m1());
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	
	//here static method is not overridden
	//and method hiding happens
	//it hides the static m1() method of Customer
	public static String m1() {
		return "static method called from RegularCustomer";
	}
}

