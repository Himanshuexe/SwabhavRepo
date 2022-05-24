package com.monocept.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.monocept.dto.UserDTO;
import com.monocept.service.LoginService;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HttpSession session;
	private LoginService loginService;
	private UserDTO userDto;

	public LoginController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside login controller do get ");
		RequestDispatcher view = request.getRequestDispatcher("login.jsp");
		view.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside login controller do post ");
		session = request.getSession();
		int loginId = Integer.parseInt(request.getParameter("loginId"));
		String password = request.getParameter("password");
		System.out.println(loginId + "" + password);
		loginService = LoginService.getInstance();
		userDto = loginService.getUser(loginId, password);
		System.out.println(userDto.getName() + "" + userDto.getEmail());
		session.setAttribute("user", userDto);
		response.sendRedirect("home");
	}
}
