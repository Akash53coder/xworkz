package com.xworkz.java.object_class.finalize;

public class FinalizeDemo {

	public static void main(String[] args) {

		Fan fan = new Fan();
		System.out.println(fan);
		try {
			fan.finalize();
		}
		catch(Throwable e) {
			System.out.println(e);
		}
		//fan=null;
		//System.gc();
	}

}
