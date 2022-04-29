package com.monocept.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SqlInjectionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:4040/monocept", "root", "root");
			System.out.println("Enter Employee Id: ");
			String eId = sc.nextLine();

			String selectEmployee = "SELECT EMPNO, ENAME, SAL, JOB FROM emp\nWHERE EMPNO=?;";

			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(selectEmployee);
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
