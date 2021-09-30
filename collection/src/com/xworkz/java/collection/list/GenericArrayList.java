package com.xworkz.java.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
public class GenericArrayList {

	public static void main(String[] args) {

		Laptop lenovo = new Laptop("Lenovo",34212.1,"black");
		Laptop mac = new Laptop("Mac",125000.0,"silver");
		Laptop hp = new Laptop("HP",20000.0,"black");
		
		ArrayList<Laptop> list = new ArrayList<>();
		
		list.add(lenovo);
		list.add(mac);
		list.add(hp);
		//System.out.println(list); //prints the toString of Object class
		
		
		Iterator<Laptop> itr = list.iterator();
		
		while(itr.hasNext()) {
			Laptop lp = itr.next();
			System.out.println(lp.brand+" "+lp.price+" "+lp.color);
		}
		
		System.out.println("--------- Black Colored Laptop with a Price"
				+ "<20000--------------------------");
		
		Iterator<Laptop> itr1 = list.iterator();
		while(itr1.hasNext()) {
			Laptop lp = itr1.next();
			if(lp.price<20000 || lp.color.equals("black")) {
				System.out.println(lp.brand);
			}
		}
		
		System.out.println("--------- Black Colored Laptop with a Price"
				+ "<25000--------------------------");
		Iterator<Laptop> itr2 = list.iterator();
		while(itr2.hasNext()) {
			Laptop lp = itr2.next();
			if(lp.price<25000 && lp.color.equals("black")) {
				System.out.println(lp.brand);
			}
		}
		
	}

}
