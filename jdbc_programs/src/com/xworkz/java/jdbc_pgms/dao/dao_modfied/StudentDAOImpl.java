package com.xworkz.java.jdbc_pgms.dao.dao_modfied;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.java.jdbc_pgms.dao.dao_modfied.util.ConnectionProvider;

public class StudentDAOImpl implements StudentDAO{

	@Override
	public void saveStudentDetails(){

		String insertQuery = "INSERT INTO student_details values(9,'angelina',10)";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//sending sql query from java program to db engine we need statement object
			Statement statement = ConnectionProvider.getConnection().createStatement();
			statement.executeUpdate(insertQuery);	
			System.out.println("Data inserted successfully");

		}catch(ClassNotFoundException | SQLException e) {

			System.out.println(e.getMessage());
		}
		ConnectionProvider.closeDbConnection();
	}

	@Override
	public void updateStudentDetails() {

		String updateQuery = "update student_details set student_name='gabriel' where student_rollno=6";

		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");//optional for type-4 drivers
			//sending sql query from java program to db engine we need statement object
			Statement statement = ConnectionProvider.getConnection().createStatement();
			statement.executeUpdate(updateQuery);	
			System.out.println("Data Updated successfully");

		}catch( SQLException e) {

			System.out.println(e.getMessage());
		}
		ConnectionProvider.closeDbConnection();
	}


	@Override
	public void deleteStudentDetails() {

		String updateQuery = "delete from student_details where student_rollno=3";

		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");//optional for type-4 drivers
			//sending sql query from java program to db engine we need statement object
			Statement statement = ConnectionProvider.getConnection().createStatement();
			statement.executeUpdate(updateQuery);	
			System.out.println("Data Deleted successfully");

		}catch( SQLException e) {

			System.out.println(e.getMessage());
		}
		ConnectionProvider.closeDbConnection();

	}

	@Override
	public void readAllRecords() {

		String readSingleRecordQuery = "select * from student_details";
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");//optional for type-4 drivers
			//sending sql query from java program to db engine we need statement object
			Statement statement = ConnectionProvider.getConnection().createStatement();
			ResultSet resultSet=statement.executeQuery(readSingleRecordQuery);//excecute for read DQL


			while(resultSet.next()) { //it is posiotioned at first row (my first row is column so we use next() method)
				System.out.println();
				System.out.print(resultSet.getInt(1)+" ");//indicating next row student rollno 
				System.out.print(resultSet.getString(2)+" ");//indicating next row student name
				System.out.print(resultSet.getInt(3)+" ");//indicating next row student name
			}

		}catch( SQLException e) {

			System.out.println(e.getMessage());
		}
		ConnectionProvider.closeDbConnection();

	}


}
