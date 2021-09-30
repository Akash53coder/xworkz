package com.xworkz.java.custom_exception.custom_checked_exception;

public class Customer {

	public static void main(String args[]) {
		Dmart d = new Dmart();
		try {
			d.searchItem("biscuits");
			
		}catch(DmartException e) {
			System.out.println(e);
		}
	}
}
