package com.monocept.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.monocept.model.Student;

@WebServlet("/home")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Student student = null;

	public HomeController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String dbDriver = "com.mysql.jdbc.Driver";
		try {
			Class.forName(dbDriver);
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/monocept", "root", "root");
			String eId = request.getParameter("id");

			String selectEmployee = "SELECT StudentId, StudentName, StudentDept, CollegeID FROM students1 WHERE StudentId=?;";

			PreparedStatement statement = con.prepareStatement(selectEmployee);
			statement.setString(1, eId);
			ResultSet rs = statement.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					System.out
							.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
					int id = rs.getInt(1);
					String name = rs.getString(2);
					String dept = rs.getString(3);
					int cid = rs.getInt(4);
					student = new Student(id, name, dept, cid);
				}
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		request.setAttribute("data", student);
		RequestDispatcher view = request.getRequestDispatcher("home.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
