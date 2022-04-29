package com.monocept.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SqlInjectionSolutionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:4040/monocept", "root", "root");
			System.out.println("Enter Employee Id: ");
			String eId = sc.nextLine();

			String selectEmployee = "SELECT EMPNO, ENAME, SAL, JOB FROM emp WHERE EMPNO=?;";

			PreparedStatement statement = con.prepareStatement(selectEmployee);
			statement.setString(1, eId);
			ResultSet rs = statement.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					System.out
							.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4));
				}
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
