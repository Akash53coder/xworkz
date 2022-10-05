package com.xworkz.collection.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//first as a developer I will give default natural sorting 
//order by considering id
class Student implements Comparable {

	 String name;
	 Integer id;

	public Student(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return name + " : " + id;
	}

	@Override
	public int compareTo(Object o) {
		int id = this.id;
		Student s = (Student) o;
		int id1 = s.id;
		if (id < id1)
			return -1;
		else if (id > id1)
			return 1;
		else
			return 0;

	}

}

public class TreesetComprble {

	public static void main(String[] args) {
		// here it uses default natural sorting order
		// and Integer objects are comparable
		// as Integer implements Comparable
//		Set<Integer> s = new TreeSet<>();
//		s.add(1);
//		s.add(3);
//		s.add(4);
//		s.add(5);
//		s.add(2);
//		s.add("a"); ClassCastException

		// System.out.println(s);

		Student s1 = new Student("ram",1);
		Student s2 = new Student("zoya",2);
		Student s3 = new Student("darshi",3);
		Student s4 = new Student("vani",4);
		Student s5 = new Student("akash",5);
		Student s6 = new Student("lalit",6);

		//with default natural sorting order
//		Set<Student> s = new TreeSet<>();
//		s.add(s6);
//		s.add(s1);
//		s.add(s2);
//		s.add(s4);
//		s.add(s5);
//		s.add(s3);
//
//		System.out.println(s);
		
		//with my own customized sorting order
		Set<Student> set = new TreeSet<>(new MyComparator());
		set.add(s6);
		set.add(s1);
		set.add(s2);
		set.add(s4);
		set.add(s5);
		set.add(s3);

		System.out.println(set);

	}
}

class MyComparator implements Comparator<Student>{

	//here generic are used so parameters of compare method are Student
	//instead of Object
	@Override
	public int compare(Student o1, Student o2) {
		String name1 = o1.name;
		String name2 = o2.name;
		
		return name1.compareTo(name2);
	}
	
}
