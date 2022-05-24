package com.monocept.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session")
public class Session extends HttpServlet {
	private HttpSession session;
	private static final long serialVersionUID = 1L;

	public Session() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		session = request.getSession();
		out.println("<html><body><h4>Welcome</h4>");
		Integer i = (Integer) session.getAttribute("counter");
		if (i == null)
			i = 0;
		String sessionId = session.getId();
		out.println("Session Id:" + sessionId + "<br/>");
		out.println("");
		out.println("old value is:" + i + "<br/>");
		i++;
		out.println("");
		out.println("new value is:" + i + "<br/>");
		session.setAttribute("counter", i);
		out.println("<a href=" + " \" summary\"" + ">view summary</a>");
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		session = request.getSession();
		out.println("<h4>Welcome</h4>");
		Integer i = (Integer) session.getAttribute("counter");
		if (i == null)
			i = 0;
		String sessionId = session.getId();
		out.println("Session Id:" + sessionId + "<br/>");
		out.println("");
		out.println("old value is:" + i + "<br/>");
		i++;
		out.println("");
		out.println("new value is:" + i + "<br/>");
		session.setAttribute("counter", i);
		out.println("<a href=" + " \" summary\"" + ">view summary</a>");
	}

}
