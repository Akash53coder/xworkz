package com.xworkz.objectdemo;

public class ShallowNDeepCopy {

	 public static void main(String[] args) {
		
		 Address address = new Address();
		 address.setPlace("gadag");
		 
		 Customer c = new Customer(1, address);
		 System.out.println(c.getAddress().getPlace());
		 
		 Customer clonned = null;
		try {
			clonned = (Customer) c.clone();
			System.out.println(clonned.getAddress().getPlace());
			 
			 //two objects are same i.e shallow copy
			 System.out.println(c.getAddress().hashCode());
			 
			 System.out.println(clonned.getAddress().hashCode());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		 
		 
	}
}

//in order to clone a object my class should implement Cloneable interface
//classes that implements cloneable interface (java.lang) must override clone() of Object class.
class Customer implements Cloneable{
	
	private int id;
	private Address address;
	
	public Customer(int id, Address address) {
		super();
		this.id = id;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		//as clone method is protected calling Object's class clone() method using super for 
		//shallow copy
		//syntax of clone() in Object class
		//protected Object clone() throws CloneNotSupportedException
		//return super.clone();
		
		//code for deep copy
		Address add = new Address();
		add.setPlace("banglore");
		return new Customer(this.id, add);
	}
	
}
