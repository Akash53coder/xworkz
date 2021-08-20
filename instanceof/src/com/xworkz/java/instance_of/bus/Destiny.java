package com.xworkz.java.instance_of.bus;

public class Destiny {

	public void destination(Bus bus) {
		if(bus instanceof Bmtc) {
			System.out.println("bmtc buses cover short distance");
		}else {
			System.out.println("ksrtc buses cover long distance");
		}
	}
}
