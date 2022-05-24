package com.monocept.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/summary")
public class Summary extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HttpSession session;
	private ServletContext application;

	public Summary() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		session = request.getSession();
		ServletConfig config = getServletConfig();
		application = config.getServletContext();
		Integer sessionCount = (Integer) session.getAttribute("counter");
		out.println("session counter value:" + sessionCount + "<br/>");
		Integer applicationCount = (Integer) application.getAttribute("counter");
		out.println("application counter value:" + applicationCount);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		session = request.getSession();
		ServletConfig config = getServletConfig();
		application = config.getServletContext();
		Integer sessionCount = (Integer) session.getAttribute("counter");
		out.println("session counter value:" + sessionCount + "<br/>");
		Integer applicationCount = (Integer) application.getAttribute("counter");
		out.println("application counter value:" + applicationCount);
	}

}
