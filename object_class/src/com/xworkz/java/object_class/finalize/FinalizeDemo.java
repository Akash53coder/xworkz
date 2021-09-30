package com.xworkz.java.object_class.finalize;

public class FinalizeDemo {

	public static void main(String[] args) {

		Fan fan = new Fan();
		System.out.println(fan);
		fan=null;
		System.gc();
	}

}
