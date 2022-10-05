package com.xworkz.colletion.utilclasses;

import java.util.Arrays;

class Student implements Comparable<Student>{
	public String name;
	public int id;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		if(this.id > o.id)
			return 1;
		else if(this.id < o.id)
			return -1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return "{" + name + ":" + id + "}";
	}
	
	
}

public class ArraysEx {
	
	public static void main(String[] args) {
		
		Student[] s= new Student[3];
		
		s[0] = new Student(1,"www");
		s[1] = new Student(3,"ad");
		s[2] = new Student(4,"da");
		
		//here in order to sort I need to have Student as comparable
		Arrays.sort(s);
		
		System.out.println(Arrays.toString(s));
		
	}
}
