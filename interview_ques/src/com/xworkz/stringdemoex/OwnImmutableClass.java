package com.xworkz.stringdemoex;

//as per my knowledge
public final class OwnImmutableClass {

	private final String name;
	
	private OwnImmutableClass(String name) {
		this.name = name;
	}
	
	public OwnImmutableClass createAnotherObject(String name)
	{
		if(this.name.equals(name)) {
			return this;
		}
		return new OwnImmutableClass(name);
	}
	
	public static void main(String[] args) {
		
		//create a initial object
		OwnImmutableClass o = new OwnImmutableClass("akash");
		
		//trying to modify the object
		OwnImmutableClass o1 = o.createAnotherObject("akash");
		
		OwnImmutableClass o2 = o.createAnotherObject("steve");
		
		if(o==o1) {
			System.out.println("o and o1 are same");
		}
		
		if(o==o2) {
			System.out.println("o and o2 are same");
		}
		
	}
}
