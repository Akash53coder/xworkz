package com.xworkz.java.jdbc_pgms.dao.dao_modfied;

import java.sql.SQLException;

public interface StudentDAO {

	void saveStudentDetails();
	
	void saveStudentDetails(int studentId,String studentName,int studentClass);
	
	void updateStudentDetails();
	
	void updateStudentDetails(String name,int rollno);

	
	void deleteStudentDetails();
	
	void deleteStudentDetails(int rollno);
	void readAllRecords();
}
