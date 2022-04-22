package com.monocept.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class MovieStore implements Serializable {
	private static final long serialVersionUID = -2033916275456268303L;
	private int[] id = new int[5];
	private String name[] = new String[5];
	private int year[] = new int[5];
	private String genre[] = new String[5];
	private int count = 0;
	private int idM = 101;

	public void addMovie() {
		if (count >= 5) {
			System.out.println("\nCannot store more than 5 movies.");
			return;
		}
		Scanner scan = new Scanner(System.in);
		this.id[this.count] = idM + this.count;
		System.out.println("\nEnter Movie Name: ");
		this.name[this.count] = scan.nextLine();
		System.out.println("Enter Movie Genre:");
		this.genre[this.count] = scan.nextLine();
		System.out.println("Enter Movie Year: ");
		this.year[this.count] = scan.nextInt();
		save(this);
		count++;
		return;
	}

	public void displayMovies() {
		if (count == 0) {
			System.out.println("\nStore is empty.");
		}
		for (int i = 0; i < this.count; i++) {
			System.out.println("\nId: " + id[i]);
			System.out.println("Name: " + name[i]);
			System.out.println("Genre: " + genre[i]);
			System.out.println("Year: " + year[i]);
			System.out.println(" ");
		}
	}

	public void save(MovieStore movie) {
		try {
			FileOutputStream f = new FileOutputStream("moviestore.txt");
			ObjectOutputStream o = new ObjectOutputStream(f);
			o.writeObject(movie);
			o.close();
			f.close();
		} catch (Exception e) {
			System.out.println(" ");
			;
		}
	}

	public MovieStore load() throws IOException {
		MovieStore store = null;
		try {
			FileInputStream f = new FileInputStream("moviestore.txt");
			ObjectInputStream i = new ObjectInputStream(f);
			store = (MovieStore) i.readObject();
			i.close();
			f.close();
		} catch (Exception e) {
			MovieStore movie = new MovieStore();
			FileOutputStream f = new FileOutputStream("moviestore.txt");
			ObjectOutputStream o = new ObjectOutputStream(f);
			o.writeObject(movie);
			o.close();
			f.close();
			store = movie;
		}
		System.out.println("\nStore loaded.");
		return store;
	}

	public void clearAll() throws FileNotFoundException, IOException {
		this.count = 0;
		System.out.println("\nStore cleared.");
		save(this);
	}

	public int getCount() {
		return this.count;
	}
}
