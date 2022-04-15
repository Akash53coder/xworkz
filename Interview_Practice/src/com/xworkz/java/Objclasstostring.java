package com.xworkz.java;

public class Objclasstostring {
	
	public int i;
	public Objclasstostring(int i){
		this.i = i;
	}
	
	@Override
	public int hashCode() {
		return i;
	}
	
	public static void main(String[] args) {
		Objclasstostring o = new Objclasstostring(1);
		Objclasstostring o1 = new Objclasstostring(10);
		Objclasstostring o2 = new Objclasstostring(100);
		
		System.out.println(o);
		System.out.println(o1);
		System.out.println(o2);
	}
}
