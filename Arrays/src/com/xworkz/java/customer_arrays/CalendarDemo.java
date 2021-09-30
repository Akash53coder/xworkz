package com.xworkz.java.customer_arrays;

public class CalendarDemo {

	public static void main(String[] args) {

//		Calendar[] calendars = new Calendar[2];
		
		Calendar mallige=new Calendar("medium",20,"mallige","paper");
		Calendar sampige=new Calendar("small",23,"sampige","paper cut");
		
		//using literals
		Calendar[] calendars = {mallige,sampige};
		
		for(Calendar c:calendars) {
			System.out.println(c.toString());
		}
	}

}
