package com.monocept.controller;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.monocept.model.Student;
import com.monocept.service.StudentService;

@WebServlet("/addstudent")
public class AddStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentService studentService;
	private HttpSession session;

	public AddStudentController() {
		System.out.println("addStudent Controller Started");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside Add Student Controller Do get");
		RequestDispatcher view = request.getRequestDispatcher("addStudent.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside Add Student Controller Do post");
		int rollNo = Integer.parseInt(request.getParameter("rollNo"));
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		Double cgpa = Double.valueOf(request.getParameter("cgpa"));

		studentService = StudentService.getInstance();
		studentService.add(new Student(rollNo, firstName, lastName, cgpa));
		response.sendRedirect("home");
	}

}
