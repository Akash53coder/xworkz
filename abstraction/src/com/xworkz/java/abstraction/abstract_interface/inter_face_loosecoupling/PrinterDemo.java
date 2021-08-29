package com.xworkz.java.abstraction.abstract_interface.inter_face_loosecoupling;

public class PrinterDemo {

	public static void main(String[] args) {

		Sony sony = new Sony();
		Epson epson = new Epson();
		Computer c = new Computer();
		c.slot(sony);
		c.slot(epson);
	}

}
