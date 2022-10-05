package com.xworkz.problem;

import java.util.Arrays;

public class Employee {

	String name;
	int salary;
	
	Employee(String name, int salary){
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "{" + name + ":" + salary + "}";
	}
	
	
	
}

class EmployeeRunner{
	public static void main(String[] args) {
		Employee[] arr = new Employee[5];
		arr[0] = new Employee("akash",12000);
		arr[1] = new Employee("ram",10000);
		arr[2] = new Employee("sham",11000);
		arr[3] = new Employee("aish",9000);
		arr[4] = new Employee("ravi",6000);
		
		Employee temp = null;
		for(int i=0 ; i< arr.length-1 ;i++) {
			if(arr[i].salary > arr[i+1].salary) {
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
				
		}
		
		
		System.out.println(Arrays.toString(arr));
		
	}
}