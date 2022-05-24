package com.monocept.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/setcookie")
public class SetCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SetCookie() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie cookie = new Cookie("color", "red");
		cookie.setMaxAge(60 * 60 * 24 * 7);
		response.addCookie(cookie);
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("Cookie set succesfully<br/>");
		out.println("<a href=" + " \" getcookie\"" + ">view cookie</a>");
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie cookie = new Cookie("color", "red");
		cookie.setMaxAge(60 * 60 * 24 * 7);
		response.addCookie(cookie);
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("Cookie set succesfully<br/>");
		out.println("<a href=" + " \" getcookie\"" + ">view cookie</a>");
		out.println("</body></html>");
	}

}
