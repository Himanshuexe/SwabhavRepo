package com.monocept.model.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.monocept.model.MovieStore;

public class MovieStoreTest {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		MovieStore store = new MovieStore();
		store = store.load();
		Scanner scan = new Scanner(System.in);
		String choice;
		System.out.println("Welcome to the Store, Developed by: Himanshu Saraswat.\n");
		while (true) {
			System.out.println("\nMovie count: " + store.getCount() + "\n1. Add Movie\n" + "2. Display Movies\n"
					+ "3. Clear All Movies\n" + "4. Exit Store");
			System.out.println("Enter Choice:");
			choice = scan.next();
			if (choice.equalsIgnoreCase("1")) {
				store.addMovie();
			}
			if (choice.equalsIgnoreCase("2")) {
				store.displayMovies();
			}
			if (choice.equalsIgnoreCase("3")) {
				store.clearAll();
			}
			if (choice.equalsIgnoreCase("4")) {
				System.out.println("\nStore Closed.");
				break;
			}
		}
	}
}
