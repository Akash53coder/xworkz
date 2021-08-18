package com.xworkz.java.polymorphism.comipletime_polymorphism;

public class FacebookTest {

	public static void main(String args[]){
	    Facebook fb = new Facebook();
	    fb.searchUser(123);
	    fb.searchUser("Steve");
	    fb.searchUser("Steve","Jobs");
	    fb.searchUser(9964124083l);
	    fb.searchUser("Steve","Jobs","Apple founder");
	}
}
