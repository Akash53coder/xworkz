package com.xworkz.java.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparableandComparator {
	public static void main(String[] args) {
		Employee e1 = new Employee(100, "nag");
		Employee e2 = new Employee(200, "balaiah");
		Employee e3 = new Employee(50, "chiru");
		Employee e4 = new Employee(150, "venki");
		Employee e5 = new Employee(100, "nag");

		TreeSet<Employee> t = new TreeSet<Employee>();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
		
		TreeSet<Employee> t1 = new TreeSet<Employee>(new EmpComparator());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		System.out.println(t1);

	}
}

//the person who is developing this class must implement Comparable
class Employee implements Comparable<Employee> {
	public int id;
	public String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + "]";
	}

	// when we have Comparable
//	public int compareTo(Object obj) {
//		int eid1 = this.id;
//		Employee e = (Employee)obj;
//		int eid2 = e.id;
//		if(eid1 < eid2)
//			return -1;
//		else if(eid1 > eid2)
//			return 1;
//		else
//			return 0;
//	}

	// when we have Comparable<Employee>

	@Override
	public int compareTo(Employee o) {
		int eid1 = this.id;
		int eid2 = o.id;
		if (eid1 < eid2)
			return -1;
		else if (eid1 > eid2)
			return 1;
		else
			return 0;
	}


}

class EmpComparator implements Comparator<Employee>{
	
	//if with sorting with name
	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name);
	}
}






