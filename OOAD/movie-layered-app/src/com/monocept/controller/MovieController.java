package com.monocept.controller;

import java.io.IOException;
import java.util.Scanner;

import com.monocept.model.Movie;
import com.monocept.service.MovieService;

public class MovieController {
	public void start() throws IOException {
		System.out.println("Welcome to the movie app developed by Himanshu Saraswat.");
		displayMenu();
	}

	private void displayMenu() throws IOException {
		MovieService mov = new MovieService();
		Scanner scan = new Scanner(System.in);
		int choice;
		while (true) {
			System.out.println("\n1.Add Movie\n" + "2.Display Movie\n" + "3.Clear All Movies\n" + "4.Exit Store");
			System.out.println("Enter your Choice: ");
			choice = scan.nextInt();

			if (choice == 1) {
				System.out.println("\nEnter Movie name:");
				String name = scan.nextLine();
				scan.nextLine();
				System.out.println("Enter Movie Genre: ");
				String genre = scan.next();
				System.out.println("Enter Movie year: ");
				int year = scan.nextInt();

				Movie movie = new Movie(name, genre, year);
				mov.addMovie(movie);
				System.out.println("\nMovie Added.");
			}
			if (choice == 2) {
				if (mov.getMovies() != null) {
					for (Movie movie : mov.getMovies()) {
						System.out.println("\nName:" + movie.getName() + "\nGenre: " + movie.getGenre() + "\nYear: "
								+ movie.getYear() + "\n");
					}
				}
			}
			if (choice == 3) {
				mov.clearMovies();
				System.out.println("\nStore Cleared.");
			}
			if (choice == 4) {
				System.out.println("\nYou chose to exit.");
				break;
			}
		}
	}
}