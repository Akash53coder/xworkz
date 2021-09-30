package com.xworkz.java.singled_arrays;

public class StudentCustomArray {

	public String name;
	public String gender;
	public int age;
	public String qualification;
	public double aggregate;
	
	public StudentCustomArray(String name, String gender, int age, String qualification, double aggregate) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.qualification = qualification;
		this.aggregate = aggregate;
	}
	

	@Override
	public String toString() {
		return "StudentCustomArray [name=" + name + ", gender=" + gender + ", age=" + age + ", qualification="
				+ qualification + ", aggregate=" + aggregate + "]";
	}


	public static void main(String[] args) {

		StudentCustomArray[] students = new StudentCustomArray[5];
		
		students[0]=new StudentCustomArray("akash","male",23,"BE",70.2);
		students[1]=new StudentCustomArray("adarsh","male",22,"BE",81.2);
		students[2]=new StudentCustomArray("nandini","female",21,"MCA",90.2);
		students[3]=new StudentCustomArray("rahul","male",23,"BE",74.2);
		students[4]=new StudentCustomArray("rohini","female",22,"BCA",59.2);

	
		System.out.println("student with qualification BE & aggregate >80");
		System.out.println("-----------------------------------------------");
		for(StudentCustomArray stu:students) {
			if(stu.qualification.equals("BE") && stu.aggregate>80) {
				System.out.println(stu.name);
				
			}
		}
		
		System.out.println("student with age>22  & aggregate <60");
		System.out.println("-----------------------------------------------");
		for(StudentCustomArray stu:students) {
			if(stu.age>22 && stu.aggregate<60) {
				System.out.println(stu.name);
				
			}
		}
		
		System.out.println("student with aggregate >60 & aggregate <80");
		System.out.println("-----------------------------------------------");
		for(StudentCustomArray stu:students) {
			if(stu.aggregate>60 && stu.aggregate<80) {
				System.out.println(stu.name);
				
			}
		}
		
		System.out.println("male students");
		System.out.println("-----------------------------------------------");
		for(StudentCustomArray stu:students) {
			if(stu.gender.equals("male")) {
				System.out.println(stu.name);
				
			}
		}
		
		
	}

}
