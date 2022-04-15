package com.xworkz.java;

class Students{
	public int rno;
	public String name;

	public Students(int rno, String name) {
		super();
		this.rno = rno;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		//if both reference are pointing to same object then just return true
		if(obj==this)
			return true;
		//here instanceof operator avoids both NullPointerException and ClassNotFoundException
		if(obj instanceof Student) {
			//why type casting here obj is of type Object. In order to get Student class properties 
			//we will type cast it 
			Student s = (Student)obj;
			if (name.equals(s.name) && this.rno == s.rno)
				return true;
			return false;
		}
		return false;
	}
}
public class ModifiedEquals {
	public static void main(String[] args) {
		Student s1 = new Student(13, "ass");
		Student s2 = new Student(13, "ass");
		
		System.out.println(s1.equals(null));
		
//		if(null instanceof Student)
//			System.out.println("true");
//		System.out.println("false");

	}
}
