package com.monocept.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.monocept.model.Student;
import com.monocept.service.StudentService;

@WebServlet("/deletestudent")
public class DeleteStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DeleteStudentController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StudentService studentService = StudentService.getInstance();
		Student reqStudent = null;
		List<Student> students = studentService.getStudents();
		int rollNo = Integer.parseInt(request.getParameter("rollNo"));
		for (Student student : students) {
			if (student.getRollNo() == rollNo)
				reqStudent = student;
		}
		studentService.delete(reqStudent);
		response.sendRedirect("home");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
