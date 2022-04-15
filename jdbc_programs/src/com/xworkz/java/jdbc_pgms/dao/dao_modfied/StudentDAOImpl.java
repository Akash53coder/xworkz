package com.xworkz.java.jdbc_pgms.dao.dao_modfied;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.java.jdbc_pgms.dao.dao_modfied.util.ConnectionProvider;

public class StudentDAOImpl implements StudentDAO {

	@Override
	public void saveStudentDetails() {

		String insertQuery = "INSERT INTO student_details values(20,'pratam',10)";

		try {
			// sending sql query from java program to db engine we need statement object
			Statement statement = ConnectionProvider.getConnection().createStatement();
			statement.executeUpdate(insertQuery);
			System.out.println("Data inserted successfully");
			System.out.println("closing connection");
			ConnectionProvider.closeDbConnection();

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} catch (NullPointerException nullPointerException) {
			System.out.println("connection unsuccessfull");
		}
	}

	@Override
	public void updateStudentDetails() {

		String updateQuery = "update student_details set student_name='gabriel' where student_rollno=6";

		try {
			// Class.forName("com.mysql.cj.jdbc.Driver");//optional for type-4 drivers
			// sending sql query from java program to db engine we need statement object
			Statement statement = ConnectionProvider.getConnection().createStatement();
			statement.executeUpdate(updateQuery);
			System.out.println("Data Updated successfully");
			System.out.println("closing connection");
			ConnectionProvider.closeDbConnection();

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} catch (NullPointerException nullPointerException) {
			System.out.println("connection unsuccessfull");
		}
	}

	@Override
	public void deleteStudentDetails() {

		String deleteQuery = "delete from student_details where student_rollno=3";

		try {
			// Class.forName("com.mysql.cj.jdbc.Driver");//optional for type-4 drivers
			// sending sql query from java program to db engine we need statement object
			Statement statement = ConnectionProvider.getConnection().createStatement();
			statement.executeUpdate(deleteQuery);
			System.out.println("Data Deleted successfully");
			System.out.println("closing connection");
			ConnectionProvider.closeDbConnection();

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} catch (NullPointerException nullPointerException) {
			System.out.println("connection unsuccessfull");
		}

	}

	@Override
	public void readAllRecords() {

		String readSingleRecordQuery = "select * from student_details";
		try {
			// Class.forName("com.mysql.cj.jdbc.Driver");//optional for type-4 drivers
			// sending sql query from java program to db engine we need statement object
			Statement statement = ConnectionProvider.getConnection().createStatement();
			ResultSet resultSet = statement.executeQuery(readSingleRecordQuery);// excecute for read DQL

			while (resultSet.next()) { // it is posiotioned at first row (my first row is column so we use next()
				// method)
				System.out.println();
				System.out.print(resultSet.getInt(1) + " ");// indicating next row student rollno
				System.out.print(resultSet.getString(2) + " ");// indicating next row student name
				System.out.print(resultSet.getInt(3) + " ");// indicating next row student name
			}
			System.out.println("closing connection");
			ConnectionProvider.closeDbConnection();

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} catch (NullPointerException nullPointerException) {
			System.out.println("connection unsuccessfull");
		}

	}

	@Override
	public void saveStudentDetails(int studentId, String studentName, int studentClass) {

		String insertQuery = "INSERT INTO student_details values(?,?,?)"; // adding placeholders

		try {
			PreparedStatement preparedstatement = ConnectionProvider.getConnection().prepareStatement(insertQuery);

			preparedstatement.setInt(1, studentId);
			preparedstatement.setString(2, studentName);
			preparedstatement.setInt(3, studentClass);

			preparedstatement.executeUpdate();

			System.out.println("Data inserted successfully");
			System.out.println("closing connection");
			ConnectionProvider.closeDbConnection();

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} catch (NullPointerException nullPointerException) {
			System.out.println("connection unsuccessfull");
		}
	}

	@Override
	public void updateStudentDetails(String name, int rollno) {

		String updateQuery = "update student_details set student_name=? where student_rollno=?";

		try {
			// Class.forName("com.mysql.cj.jdbc.Driver");//optional for type-4 drivers
			PreparedStatement preparedStatement = ConnectionProvider.getConnection().prepareStatement(updateQuery);
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, rollno);

			preparedStatement.executeUpdate(updateQuery);
			System.out.println("Data Updated successfully");
			System.out.println("closing connection");
			ConnectionProvider.closeDbConnection();

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} catch (NullPointerException nullPointerException) {
			System.out.println("connection unsuccessfull");
		}
	}

	@Override
	public void deleteStudentDetails(int rollno) {

		String deleteQuery = "delete from student_details where student_rollno=?";

		try {
			// Class.forName("com.mysql.cj.jdbc.Driver");//optional for type-4 drivers
			PreparedStatement preparedStatement = ConnectionProvider.getConnection().prepareStatement(deleteQuery);
			preparedStatement.setInt(1, rollno);
			preparedStatement.executeUpdate(deleteQuery);

			System.out.println("Data Deleted successfully");
			System.out.println("closing connection");
			ConnectionProvider.closeDbConnection();

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} catch (NullPointerException nullPointerException) {
			System.out.println("connection unsuccessfull");
		}

	}

}
