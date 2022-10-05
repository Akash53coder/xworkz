package com.xworkz.javaeight_streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//demo program to show why stream API is better

//TechSol HR plans for a Buddy program for its new employees to make their changeover, 
//easier. The first thing they need is a sorted list of Ids of the employees who have joined 
//the organization less than a year ago.
public class Baisc {

	public static void main(String[] args) {
		
		//normal approach ------------------------------------------------------------------
		
		List<Employee> list = Employee.getEmpList();
		
		//empty list
		List<Employee> nlist = new ArrayList<>();
		
//		for(Employee emp: list) {
//			if(emp.getYop() <= 1) {
//				nlist.add(emp);
//			}
//		}
		
		System.out.println(list);
		
		//using lambda
		//or nlist.sort((e1, e2)-> e2.getId() - e1.getId());
		
		//using anonymous class
//		Collections.sort(nlist, new Comparator<Employee>() {
//			public int compare(Employee e1, Employee e2) {
//				if(e1.getId() > e2.getId())
//					return 1;
//				else if(e1.getId() < e2.getId())
//					return -1;
//				else 
//					return 0;
//			}
//		});
//		
//		System.out.println(nlist);
		
		//---using lambda --------------------------------------------------------------
	
		list.forEach((a) -> {
			if(a.getYop() <= 1)
				nlist.add(a);
		});
		
		nlist.sort((e1, e2) -> e1.getId()-e2.getId());
		
		nlist.forEach(a -> System.out.print(a));
		
		
		//Lambda and forEach have definitely helped to make the code concise.
		//But as you can observe that, the filtering logic still works with a new list object 
		//to add employees who meet the required criteria.
		
		
		//streams : They resemble queries, giving a syntactical advantage, and can utilize 
		//multiple threads to improve performance.
		
		//A Stream denotes the flow of a group of elements in sequence from a specific source 
		//and supports different data processing operations.
		
		//The group of elements in sequence belongs to a specific type and can have sources 
		//like collections, I/O resources, or arrays.

		//The data processing operations like filter, map, sort, count, etc. 
		//can be easily used to manipulate the data in a stream.
		
		//The Stream interface is available in the java.util.stream package, and can be of 
		//any specified type - Stream<Integer>, Stream<Employee>, etc.
	}
}
