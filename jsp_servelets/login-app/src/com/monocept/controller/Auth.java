package com.monocept.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Auth
 */
@WebServlet("/auth")
public class Auth extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Auth() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		if (userName.equals("admin") && password.equals("admin")) {
			out.println("<h3>welcome back admin!!</h3>");
		} else {
			out.println("Wrong credentials. try logging in again\n");
			out.println("<a href=" + " \" index.html\"" + ">click here</a>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		if (userName.equals("admin") && password.equals("admin")) {
			out.println("<h3>welcome back admin!!</h3>");
		} else {
			out.println("Wrong credentials. try logging in again\n");
			out.println("<a href=" + " \" index.html\"" + ">click here</a>");
		}
	}

}
