package com.xworkz.interfaceex;

// a class extends two interfaces 
interface inter {
	public void display();
}

interface interr {
	public void display();
}

public class InterfaceEx implements inter, interr{

	@Override
	public void display() {
		System.out.println("display1");
	}
	
	public static void main(String[] args) {
		InterfaceEx ex = new InterfaceEx();
		ex.display();
	}
	
}
