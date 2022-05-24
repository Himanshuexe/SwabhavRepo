package com.monocept.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeController
 */
@WebServlet("/welcome")
public class WelcomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public WelcomeController() {
		System.out.println("Inside Welcome controller");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		String name; 
		if (request.getParameter("name")==null) {
			name="Himanshu" ; 
		} else {
	        name=request.getParameter("name"); 
	    } for(int i=0;i<=10;i++){ 
	    	out.println("<h1>Hello Says developer "+ name +i+
	        "</h1>");
	    }
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		String name; 
		if (request.getParameter("name")==null) {
			name="Himanshu" ; 
		} else {
	        name=request.getParameter("name"); 
	    } for(int i=0;i<=10;i++){ 
	    	out.println("<h1>Hello Says developer "+ name +i+
	        "</h1>");
	    }
		out.println("</body></html>");
	}
}
