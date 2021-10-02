package com.xworkz.java.abstraction.abstract_interface.inter_face_loosecoupling.loose_coupling_ex2;

public class ChocolateDemo {

	public static void main(String[] args) {

		IChoco ichocom = new MilkyBar();
		ichocom.sweets();
		IChoco ichocod = new DairyMilk();
		ichocod.sweets();
	}

}
