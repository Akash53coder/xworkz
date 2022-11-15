package com.xworkz.interfaceex;

public class MarkerInterface {

	
	//marker interfaces
	
	//doen't have any methods and variables in it.
	//Cloneable, Serializable
	//marker interfaces will provide run-time information to compiler and JVM.
	//examples to show runtime-info
	
	//1. If we try to clone an object that doesn't implement this interface, 
	//	the JVM throws a CloneNotSupportedException. Hence, the Cloneable marker interface 
	//	is an indicator to the JVM that we can call the Object.clone() method.
	
	//want to write something into the file and while calling ObjectOutPutStream.writeObject(),
	//without serializable interface,  JVM will throw  NotSerializableException 
	
	//we can also create custom marker interfaces.
	
	//example of custom marker interface.
	
	//deleting entity from a table
	
	//my interface (custom )
	
	//public interface Deleteable{}
	
	//and my entity class must implement Deleteable in order to delete it from table
	
	//public class Entity implements Deleteable{ //.... }
	
	//in DAO delete method, that deletes my entity object
	//public class EntityDAO{
	
		//public void delete(Entity en){
		//if((en instanceof Deleteable)){
	
			//delete object
		//}
	//}
	
// Marker Interfaces were the only way to declare metadata about a class. For example, 
//the Serializable Marker Interface lets the author of a class say that their class will 
//behave correctly when serialized and deserialized.
//as per modern java Marker interfaces are completely replaced by annotations (Java 5). 
//	They are called marker interfaces. And as the name implies, 
// they mark that some object is available for certain sort of operations.
//Again Annotations are a better choice @ThreadSafe, @Test looks a lot better than implementing 
//the ThraedSafe marker interface.


	
//refer : 
//https://www.baeldung.com/java-marker-interfaces#:~:text=A%20marker%20interface%20is%20an,also%20called%20a%20tagging%20interface.
//https://javarevisited.blogspot.com/2012/01/what-is-marker-interfaces-in-java-and.html#ixzz2v6fIh1rw
}

