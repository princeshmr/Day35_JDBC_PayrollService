package com.Day35JDBC;

import java.sql.DriverManager;
import java.sql.SQLException;

public class UC1PayrollService {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/payroll_service";
		String username="root";
		String password="Sharma@15268";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			DriverManager.getConnection(url, username, password);
			System.out.println("Connection is established");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
