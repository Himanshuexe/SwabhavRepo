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

@WebServlet("/application")
public class Application extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext application;

	public Application() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		ServletConfig config = getServletConfig();
		application = config.getServletContext();
		out.println("<html><body><h4>Welcome</h4>");
		Integer i = (Integer) application.getAttribute("counter");
		if (i == null)
			i = 0;
		out.println("");
		out.println("old value is:" + i + "<br/>");
		i++;
		out.println("");
		out.println("new value is:" + i + "<br/>");
		application.setAttribute("counter", i);
		out.println("<a href=" + " \" summary\"" + ">view summary</a>");
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		ServletConfig config = getServletConfig();
		application = config.getServletContext();
		out.println("<html><body><h4>Welcome</h4>");
		Integer i = (Integer) application.getAttribute("counter");
		if (i == null)
			i = 0;
		out.println("");
		out.println("old value is:" + i + "<br/>");
		i++;
		out.println("");
		out.println("new value is:" + i + "<br/>");
		application.setAttribute("counter", i);
		out.println("<a href=" + " \" summary\"" + ">view summary</a>");
		out.println("</body></html>");
	}

}
