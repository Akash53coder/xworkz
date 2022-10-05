package com.xworkz.javaeight_streams;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private String name;
	private int yop;
	private int id;
	private int salary;
	
	public Employee(String name, int yop, int id, int salary) {
		this.name = name;
		this.yop = yop;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYop() {
		return yop;
	}

	public void setYop(int yop) {
		this.yop = yop;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "{" + name + " yop:" + yop + " id:" + id + " salary:" + salary+ " }";
	}
	
	
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static List<Employee> getEmpList(){
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("akash",1,1,2000));
		list.add(new Employee("akash",1,3,4000));
		list.add(new Employee("sihi",1,4,1200));
		list.add(new Employee("akash",1,5,9000));
		list.add(new Employee("ram",1,2,7000));
		
		return list;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
