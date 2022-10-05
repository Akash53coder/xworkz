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
	
	//public interface Deleteable(){}
	
	//and my entity class must implement Deleteable in order to delete it from table
	
	//public class Entity implements Deleteable{ //.... }
	
	//in DAO delete method, that deletes my entity object
	//public class EntityDAO{
	
		//public void delete(Entity en){
		//if((en instanceof Deleteable)){
	
			//delete object
		
		//}
	
	
	//}
	
	//refer : 
//https://www.baeldung.com/java-marker-interfaces#:~:text=A%20marker%20interface%20is%20an,also%20called%20a%20tagging%20interface.
}

