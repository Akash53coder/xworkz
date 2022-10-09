package com.xworkz.stringdemoex;

class AgeStud {

	private int dob;

	public int getDob() {
		return this.dob;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}
}

public final class ImmutableStuednt{

	private final String name;
	private final int rollNo;
	private final AgeStud age;

	public ImmutableStuednt(String name, int rollNo, AgeStud age) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		AgeStud ageStud = new AgeStud();
		ageStud.setDob(age.getDob());
		this.age = ageStud;
	}
	
	public String getName() {
		return name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public AgeStud getAge() {
		AgeStud ageStud = new AgeStud();
		ageStud.setDob(this.age.getDob());
		return ageStud;
	}
	
	@Override
	public String toString() {
		return "name: " + name + ", rollno: " + rollNo + ", DOB: " + age.getDob();
	}

	public static void main(String[] args) {
		AgeStud age = new AgeStud();
		age.setDob(1990);
		
		ImmutableStuednt stud = new ImmutableStuednt("akash", 12, age);
		System.out.println("Student details " + stud);
		
		stud.getAge().setDob(1998);
		System.out.println("Student details " + stud);
		
		age.setDob(1989);
		System.out.println("Student details " + stud);
		
	}

}
