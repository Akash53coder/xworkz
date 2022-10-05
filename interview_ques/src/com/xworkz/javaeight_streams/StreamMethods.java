package com.xworkz.javaeight_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {
	 public static void main(String[] args) {
		 
//		 List<Employee> list = Employee.getEmpList();
//		 
//		 Stream<Employee> stm = list.stream();
		 
		 //syntax - Stream<T> filter(Predicate<? super T> predicate);
		 // The condition passed to, it is used for filtering.
		 
//		 Stream<Employee> nstm = stm.filter(a -> a.getYop() <=1 );
		 
		 //Here, newEmpStream will have employees who are <= 1 year old in the organization.
		 
		 //sorting the new stream
		 //syntax Stream<T> sorted(Comparator<? super T> comparator);
		 
//		 Stream<Employee> sStm = nstm.sorted((e1, e2) -> e1.getId()-e2.getId());
		 
//		 sStm.forEach(a -> System.out.println(a));
		 
		 //Since most of the stream operations return a stream back, they can be 
		 //pipelined in order to make the code clear and concise.
		 
//		  stm.filter(a -> a.getYop() <=1)
//				 .sorted((e1,e2) -> e1.getId() - e2.getId()).forEach(k -> System.out.println(k));
		  
		  
		 //more concise 
		 
//		 List<Employee> list = Employee.getEmpList();
//		 
//		 list.stream().filter( q -> q.getYop() <= 1 )
//		 .sorted((e1, e2) -> e1.getId() - e2.getId())
//		 .forEach( k -> System.out.println(k));
		  
		  
		 //Streams vs Collections
		 
		 //A collection is an in-memory data structure that holds all the data, whereas 
		 //Streams are data structures whose elements are computed only when there is a demand.

		  //Collection can be considered like a stored water tank and Streams are pipes 
		 //from which water flows based on demand.
		  
		 //Map() method 
		 //TechSol wants to apply a one-time Rs. 5000 increments for employees who have 
		 //joined less than a year ago.
		 
		 //For this,you can use the map() function provided by Stream, and return the list
		 //of employees using the collect() function as shown:
		 
		 //syntax <R> Stream<R> map(Function<? super T, ? extends R> mapper);
		  
		 List<Employee> list2 = Employee.getEmpList();
		 
//		  list2.stream().filter(emp -> emp.getYop() <=1 ).map(emp1 -> {
//			 emp1.setSalary(emp1.getSalary()+5000); return emp1;
//		 }).collect(Collectors.toList()).forEach(e -> System.out.println(e));
		  
		  //The function is applied to each element and mapped into the fresh element.
		  //In the example, after filtering, the new salary is applied to each employee 
		  //using the map() method which returns the updated employee stream.
		  
		  //The collect() method converts a stream to another form.
		  
		  //In our example, the filter() and map() methods have provided a Stream as a result.
		  //For converting this stream of employees into a List of employees we have used the 
		  //collect() method of Stream.
		  
		  //syntax <R, A> R collect(Collector<? super T, A, R> collector);

		  //It accepts a Collector type as an argument
		  
		  //Java 8 introduces java.util.stream.Collectors which provides implementations of 
		  //the Collector interface through many useful static methods like toList(), toMap(), 
		  //groupingBy(), maxBy(), minBy() etc.
		  
		  //exercise, [1,2,3,4,5,6] to print squares 
		  
		  List<Integer> l = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		  
//		  l.stream().map(ele -> {
//			  return ele * ele; 
//		 }).collect(Collectors.toList()).forEach(e -> System.out.print(e + ", "));
		  
		  //exercise, [1,2,3,4,5,6] to print squares and print only if it is even
		  
		  //it actually changes the original list
		  
//		  l.stream().map(ele -> {
//			  return ele * ele; 
//		 }).filter(k -> k%2==0).collect(Collectors.toList()).forEach(e -> System.out.print(e + ", "));
		  
		  
		  //Types of operations in stream
		  //Intermediate operations: these will return stream, and can be chained together.
		  //e.x. filter(), map(), sort()
		  
		  //Terminal operations:These are the ones, which produce a result from the pipeline.
		  //e.x. forEach(), collect
		  
		  //***Intermediate operations are lazy, i.e. they do not perform any processing until a 
		  //terminal operation is called on the stream. This may improve performance, as a 
		  //stream is not processed until required.
		  
		  //other intermediate operations - distinct().
		  
		  //distinct will return distinct objects from a list based on Object's equals method
		  //for this we need to override equals and hashcode in employee class.
		  
//		  
//		  List<Employee> list4 = Employee.getEmpList();
//		  list4.stream().distinct().forEach(a ->  System.out.println(a));
		  
	}
}
