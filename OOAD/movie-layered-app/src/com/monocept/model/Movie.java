package com.monocept.model;

import java.io.Serializable;

public class Movie implements Serializable {

	private static final long serialVersionUID = 1L;
	private String movieName;
	private String genre;
	private int year;
	int count = 0;

	public Movie(String movieName, String genre, int year) {
		this.movieName = movieName;
		this.genre = genre;
		this.year = year;
		count++;

	}

	public String getName() {
		return movieName;
	}

	public String getGenre() {
		return genre;
	}

	public int getYear() {
		return year;
	}

	public int getCount() {
		return count;
	}
}