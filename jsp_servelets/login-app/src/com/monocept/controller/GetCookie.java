package com.monocept.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getcookie")
public class GetCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Cookie[] cookies = null;
	Cookie cookie = null;

	public GetCookie() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		cookies = request.getCookies();
		cookie = cookies[0];
		String name = cookie.getName();
		String value = cookie.getValue();
		PrintWriter out = response.getWriter();
		out.println("<html><body style='background-color: " + value + "'>");
		out.print("Name : " + name + ",  ");
		out.print("Value: " + value + " <br/>");
		out.println("</body></html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		cookies = request.getCookies();
		cookie = cookies[0];
		String name = cookie.getName();
		String value = cookie.getValue();
		PrintWriter out = response.getWriter();
		out.println("<html><body style='background-color: " + value + "'>");
		out.print("Name : " + name + ",  ");
		out.print("Value: " + value + " <br/>");
		out.println("</body></html>");
	}

}
