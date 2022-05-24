package com.monocept.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.monocept.model.BeerExpert;

@WebServlet("/beerSelector")
public class BeerSelectionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List result;

	public BeerSelectionController() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String color = request.getParameter("color");
		BeerExpert expert = new BeerExpert();
		result = expert.getBrands(color);
//		
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.println("Beer Selection Advice<br>");

//		Iterator iterator = result.iterator();
//		while (iterator.hasNext()) {
//			out.println("<br>try:" + iterator.next());
//		}
		request.setAttribute("styles", result);

		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
	}

}
