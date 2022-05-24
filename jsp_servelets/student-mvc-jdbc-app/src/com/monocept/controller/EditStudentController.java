package com.monocept.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.monocept.model.Student;
import com.monocept.service.StudentService;

@WebServlet("/editstudent")
public class EditStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentService studentService;
	List<Student> students;
	private HttpSession session;

	public EditStudentController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside Edit Student Controller Do get");
		RequestDispatcher view = request.getRequestDispatcher("editStudent.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside Edit Student Controller Do post");
		int rollNo = Integer.parseInt(request.getParameter("rollNo"));
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		Double cgpa = Double.valueOf(request.getParameter("cgpa"));

		studentService = StudentService.getInstance();
		Student editStudent = new Student(rollNo, firstName, lastName, cgpa);
		studentService.editStudent(editStudent);
		response.sendRedirect("home");
	}

}
