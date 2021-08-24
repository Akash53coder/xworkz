package com.xworkz.java.constructor.constructor_chaining;

public class Book {
	String name;
	int noOfPages;
	
	Book(){
		//this("viiv",200);
		this("classmate");
	}

	Book(String name,int noOfPages){
		this.name=name;
		this.noOfPages=noOfPages;
	}
	
	Book(String name){
		this.name=name;
	}
}
