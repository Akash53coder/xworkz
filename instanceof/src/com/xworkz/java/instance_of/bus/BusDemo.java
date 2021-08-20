package com.xworkz.java.instance_of.bus;

public class BusDemo {
	public static void main(String args[]) {
		
		Destiny dest = new Destiny();
		Bmtc bmtc = new Bmtc();
		Ksrtc ksrtc = new Ksrtc();
		
		Bus bus = new Bus();
		
		dest.destination(ksrtc);
		dest.destination(bmtc);
		dest.destination(bus);
	}

}
