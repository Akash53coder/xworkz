package com.xworkz.java.collection.set;

import java.util.HashSet;

public class PerfumeDemo {

	public static void main(String[] args) {

		//while using the custom objects we must override equals and hashcode method
		HashSet<Perfume> perfumeSet = new HashSet();
		
		Perfume perfume1 = new Perfume(123.0,"rose","fogg","strong");
		Perfume perfume2 = new Perfume(333.0,"jsamine","wild stone","strong");
		Perfume perfume3 = new Perfume(193.0,"park avenue","lavish","strong");
		Perfume perfume4 = new Perfume(193.0,"axe","mint","mild");
		Perfume perfume5 = new Perfume(193.0,"axe","mint","mild");
		
		
		perfumeSet.add(perfume5);
		perfumeSet.add(perfume4);
		perfumeSet.add(perfume3);
		perfumeSet.add(perfume2);
		perfumeSet.add(perfume1);
		
		System.out.println(perfumeSet);
	}

}
