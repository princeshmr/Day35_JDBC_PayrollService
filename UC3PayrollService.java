package com.Day35JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UC3PayrollService {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/payroll_service";
		String username="root";
		String password="Sharma@15268";
		String sql="update employee_payroll set salary=? where name='Bill'";
		
		Connection con=null;
		PreparedStatement pstmt=null;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		try {
			con=DriverManager.getConnection(url, username, password);
			pstmt=con.prepareStatement(sql);
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the salary");
			int salary=scan.nextInt();
			
			pstmt.setInt(1, salary);
			int row=pstmt.executeUpdate();
			if(row==0) {
				System.out.println("Updation failed");
			}
			else {
				System.out.println("Updateion successful");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
