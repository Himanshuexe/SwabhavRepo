package com.monocept.test;

import java.io.IOException;

import com.monocept.controller.MovieUIController;

public class App {

	public static void main(String[] args) throws IOException {
		MovieUIController app = new MovieUIController();
		app.start();
	}
}