package com.xworkz.java.jdbc_pgms.dao.dao_modfied;


public class Student {

	public static void main(String[] args) {

		StudentDAOImpl studentDAOImpl=new StudentDAOImpl();
		//studentDAOImpl.saveStudentDetails();
		//studentDAOImpl.saveStudentDetails(13,"sihi",9);
		//studentDAOImpl.updateStudentDetails("sihi",19);
//		studentDAOImpl.updateStudentDetails();
//		studentDAOImpl.deleteStudentDetails();
//		studentDAOImpl.readAllRecords();
		studentDAOImpl.deleteStudentDetails(19);
	}

}
