package com.monocept.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.monocept.model.Student;

public class StudentRepository {
	private List<Student> students = new ArrayList<Student>();

	public StudentRepository() {
		System.out.println("Student Repository created");
	}

	public Connection getConnection() {
		Connection con = null;
		String dbDriver = "com.mysql.jdbc.Driver";
		try {
			Class.forName(dbDriver);
			con = DriverManager.getConnection("jdbc:mysql://localhost:4040/jdbc_app", "root", "root");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public List<Student> getStudents(int start) {
		Connection con = getConnection();
		try {
			String selectStudent = "SELECT rollNo, firstName, lastName, cgpa FROM students limit " + start + ", 5";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(selectStudent);
			if (rs != null) {
				while (rs.next()) {
					System.out
							.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
					int rollNo = rs.getInt(1);
					String firstName = rs.getString(2);
					String lastName = rs.getString(3);
					double cgpa = rs.getDouble(4);
					Student student = new Student(rollNo, firstName, lastName, cgpa);
					students.add(student);
				}
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return students;
	}

	public void addStudent(Student student) {
		Connection con = getConnection();
		try {
			String addStudent = "INSERT INTO students (rollNo, firstName, lastName, cgpa)" + "VALUES ("
					+ student.getRollNo() + ", " + "\'" + student.getFirstName() + "\'" + ", " + "\'"
					+ student.getLastName() + "\'" + ", " + student.getCgpa() + ");";
			Statement statement = con.createStatement();
			statement.executeUpdate(addStudent);
			System.out.println("Record Inserted");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void deleteStudent(Student student) {
		Connection con = getConnection();
		try {
			String deleteStudent = "DELETE FROM students WHERE rollNo=" + student.getRollNo() + ";";
			Statement statement = con.createStatement();
			statement.executeUpdate(deleteStudent);
			System.out.println("Record Deleted");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void editStudent(Student student) {
		Connection con = getConnection();
		try {
			String editStudent = "UPDATE students SET rollNo=" + student.getRollNo() + ", firstName=" + "\'"
					+ student.getFirstName() + "\'" + ", lastName=" + "\'" + student.getLastName() + "\'" + ", cgpa="
					+ student.getCgpa() + "WHERE rollNo=" + student.getRollNo() + ";";
			Statement statement = con.createStatement();
			statement.executeUpdate(editStudent);
			System.out.println("Record Edited");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}