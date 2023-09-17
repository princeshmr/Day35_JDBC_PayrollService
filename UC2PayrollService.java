package com.Day35JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UC2PayrollService {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/payroll_service";
		String username="root";
		String password="Sharma@15268";
		String query="select * from employee_payroll";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			Connection con=DriverManager.getConnection(url, username, password);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			
			String studentData="";
			
			while(rs.next()) {
				studentData=rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5);
				System.out.println(studentData);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
