package com.xworkz.java.object_class.clone;

public class ShallowCopyTest {

	public static void main(String args[]) {
		Bus bus = new Bus();
		Bus copyOfbus=null;
		
		try {
			 copyOfbus=(Bus)bus.cloneee();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println(bus);
		
		bus.name="volvo";
		System.out.println(bus);

		System.out.println(copyOfbus);
	}
}
