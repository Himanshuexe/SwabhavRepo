package com.monocept.test;

import java.io.IOException;

import com.monocept.controller.MovieController;

public class App {

	public static void main(String[] args) throws IOException {
		MovieController app = new MovieController();
		app.start();
	}
}