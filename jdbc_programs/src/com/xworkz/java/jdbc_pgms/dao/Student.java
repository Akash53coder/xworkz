package com.xworkz.java.jdbc_pgms.dao;

public class Student {

	public static void main(String[] args) {

		StudentDAOImpl studentDAOImpl=new StudentDAOImpl();
		studentDAOImpl.saveStudentDetails();
		studentDAOImpl.updateStudentDetails();
		studentDAOImpl.deleteStudentDetails();
		studentDAOImpl.readAllRecords();
	}

}
