package com.xworkz.java.polymorphism.comipletime_polymorphism;

public class Facebook {
	public void searchUser(int userId){
		System.out.println("serach for user Id found : "+userId);
	}

	public void searchUser(long phoneNo){
	    System.out.println("serach for Phone number found : "+phoneNo);
	}

	public void searchUser(String fname,String lname){
	    System.out.println("serach for Full Name found : "+fname+" "+lname);
	}

	public void searchUser(String name){
	    System.out.println("serach for name found : "+name);
	}

	public void searchUser(String... query){
	    String str="";
	    for(String s:query){
	        str=str+" "+s;
	    }
	    System.out.println("serach for user for the query string found :"+str);
	}

}
	


