package com.xworkz.java;

class Student {
	public int rno;
	public String name;

	public Student(int rno, String name) {
		super();
		this.rno = rno;
		this.name = name;
	}
	
	//eclipse generated equals and hashCode method
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + rno;
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		if (rno != other.rno)
//			return false;
//		return true;
//	}
//	
	

//	@Override
//	public boolean equals(Object obj) {
//		Student s = (Student)obj;
//		if(this.name.equals(s.name) && this.rno == s.rno) {
//			return true;
//		}
//		return false;
//	}

	// to show ClassCastException
	@Override
	public boolean equals(Object obj) {
		try {
			//when I pass null, its successfully type casted to Student but null.name or null.rono 
			//will throw NullPointerException
			Student s = (Student) obj;
			//this can removed as it's a instance method, this.name and name are same
			if (name.equals(s.name) && this.rno == s.rno)
				return true;
			return false;
		} catch (ClassCastException | NullPointerException e) {
			return false;

		}

	}
	

}

public class ObjEquals {

	public static void main(String[] args) {
		Student s1 = new Student(13, "ass");
		Student s2 = new Student(13, "ass");
//		if(s1.equals(s2)) {
//			System.out.println("equal");
//		}
//		else {
//			System.out.println("not equal");
//		}

		// code for checking ClassCastException

//		if (s1.equals("some String value")) {
//			System.out.println("equal");
//		} else {
//			System.out.println("not equal");
//		}
		
		//code for checking NullPointerException
		if (s1.equals(null)) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
		
		System.out.println(s1.hashCode());
	}
}
