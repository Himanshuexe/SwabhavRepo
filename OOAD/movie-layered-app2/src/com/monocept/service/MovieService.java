package com.monocept.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.monocept.model.Movie;

public class MovieService implements Serializable {

	private static final long serialVersionUID = 1l;

	List<Movie> movies = new ArrayList<Movie>();

	public MovieService() throws IOException {
		loadMovies();
	}

	public void addMovie(Movie movie) throws IOException {

		loadMovies();
		movies.add(movie);
		saveMovies();

	}

	public void clearMovies() throws IOException {
		movies.clear();
		saveMovies();
	}

	public List<Movie> getMovies() {
		return movies;

	}

	private void loadMovies() throws IOException {
		try {
			FileInputStream file = new FileInputStream("resources\\movies_lib.bin");
			ObjectInputStream ois = new ObjectInputStream(file);

			movies = (List<Movie>) ois.readObject();
			ois.close();
			file.close();
		} catch (Exception e) {
			saveMovies();
		}
	}

	private void saveMovies() throws IOException {
		FileOutputStream file = new FileOutputStream("resources\\movies_lib.bin");
		ObjectOutputStream out = new ObjectOutputStream(file);
		out.writeObject(movies);
		out.close();
		file.close();

	}

}