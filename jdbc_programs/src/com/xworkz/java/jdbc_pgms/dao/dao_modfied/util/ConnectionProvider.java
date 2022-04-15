package com.xworkz.java.jdbc_pgms.dao.dao_modfied.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	public static String url = "jdbc:mysql://localhost:3306/students";
	public static String username = "root";
	public static String password = "Akash@006";
	private static Connection connection = null;

	static {
		try {
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("connection established");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static Connection getConnection() {
		if (connection != null) {
			return connection;
		}
		return null;
	}

	public static void closeDbConnection() {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
