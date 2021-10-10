package com.xworkz.java.jdbc_pgms.dao;

import java.sql.SQLException;

public interface StudentDAO {

	void saveStudentDetails();
	void updateStudentDetails();
	void deleteStudentDetails();
	void readAllRecords();
}
