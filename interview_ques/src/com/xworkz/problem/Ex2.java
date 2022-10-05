package com.xworkz.problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employeee implements Comparable<Employeee>{
	String name;
	int id;
	Employeee(String name, int id){
		this.name = name;
		this.id = id;
	}
	@Override
	public int compareTo(Employeee o) {
		if(this.id > o.id) {
			return 1;
		}else if(this.id < o.id) {
			return -1;
		}else {
			return 0;
		}
	}
	@Override
	public String toString() {
		return " [name=" + name + ", id=" + id + "]";
	}
	
}
//program to sort ArrayList using comparable and comparator
public class Ex2 {
	
	public static void main(String[] args) {
		List<Employeee> list = new ArrayList<>();
		list.add(new Employeee("qqq",3));
		list.add(new Employeee("ddd",2));
		list.add(new Employeee("zzz",1));
		list.add(new Employeee("aasd",4));
		
		Collections.sort(list);
		
		System.out.println(list);
	}
}
