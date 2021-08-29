package com.xworkz.java.abstraction.abstract_interface.inter_face_loosecoupling;

public class Computer {

	// here printer is an interface which is used as a reference for sony and epson
	//to show loose coupling
	void slot(Printer printer) {
		printer.print();
	}
}
