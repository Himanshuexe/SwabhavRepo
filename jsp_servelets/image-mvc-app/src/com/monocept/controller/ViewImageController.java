package com.monocept.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.monocept.model.Image;
import com.monocept.service.ImageService;

@WebServlet("/viewimage")
public class ViewImageController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ViewImageController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ImageService imageService = ImageService.getInstance();
		int id = Integer.valueOf(request.getParameter("imageid"));
		Image image = imageService.getImage(id);
		request.setAttribute("image", image);
		RequestDispatcher view = request.getRequestDispatcher("viewimage.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
