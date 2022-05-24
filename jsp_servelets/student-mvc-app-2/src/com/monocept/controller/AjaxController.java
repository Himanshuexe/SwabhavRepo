package com.monocept.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.monocept.model.Student;
import com.monocept.service.StudentService;

@WebServlet("/ajax")
public class AjaxController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AjaxController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int rollNo = Integer.valueOf(request.getParameter("rollNo"));
		System.out.println("Inside Ajax Controller doGet Value: " + rollNo);
		for (Student student : StudentService.getInstance().getStudents()) {
			if (student.getRollNo() == rollNo) {
				System.out.println("student found");
				break;
			}
		}
	}

}
