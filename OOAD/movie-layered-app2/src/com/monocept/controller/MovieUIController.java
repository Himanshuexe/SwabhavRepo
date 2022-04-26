package com.monocept.controller;

import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import com.monocept.model.Movie;
import com.monocept.service.MovieService;

public class MovieUIController {
	public void start() throws IOException {
		System.out.println("Movie Store Running");
		displayMenu();
	}

	private void displayMenu() throws IOException {
		MovieService mov = new MovieService();
//		mov.clearMovies();
		JFrame frame = new JFrame("Movie Store");
		JLabel label = new JLabel("Welcome to the store.");
		JButton addButton = new JButton("Add Movie");
		JButton displayButton = new JButton("Display Movies");
		JButton clearButton = new JButton("Clear Movies");
		JPanel panel = new JPanel();
		JFrame displayFrame = new JFrame("Movies Saved");
		ActionListener add = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame addframe = new JFrame("Movie Details");
				JLabel nameField = new JLabel("Enter Movie name:");
				JTextField nameInput = new JTextField(20);
				addframe.add(nameField);
				addframe.add(nameInput);

				JLabel genreField = new JLabel("Enter Movie Genre: ");
				JTextField genreInput = new JTextField(20);
				addframe.add(genreField);
				addframe.add(genreInput);

				JLabel yearField = new JLabel("Enter Movie year: ");
				JTextField yearInput = new JTextField(4);
				addframe.add(yearField);
				addframe.add(yearInput);

				addframe.setLayout(new FlowLayout());
				addframe.setSize(400, 400);
				addframe.setLocationRelativeTo(null);
				addframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				addframe.setVisible(true);

				JButton addMovie = new JButton("Add Movie");
				ActionListener addMov = new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String name = nameInput.getText();
						String genre = genreInput.getText();
						int year = Integer.valueOf(yearInput.getText());
//						int year = 2012;
						Movie movie = new Movie(name, genre, year);
						try {
							mov.addMovie(movie);
							addframe.dispose();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
				};
				addMovie.addActionListener(addMov);
				addframe.add(addMovie);
			}
		};

		ActionListener display = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (mov.getMovies() != null) {
					panel.removeAll();
					for (Movie movie : mov.getMovies()) {
						panel.add(new JLabel("Name: " + movie.getName()));
						panel.add(new JLabel(", Genre: " + movie.getGenre()));
						panel.add(new JLabel(", Year: " + movie.getYear()));
					}
				} else {
					panel.add(new JLabel("No Movies Saved..."));
				}

				displayFrame.add(panel);
				panel.setLayout(new FlowLayout());
				displayFrame.setSize(400, 400);
				displayFrame.setLocationRelativeTo(null);
				displayFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				displayFrame.setVisible(true);
			}
		};

		ActionListener clear = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					mov.clearMovies();
					JOptionPane.showMessageDialog(null, "Movies Cleared", "Message", 0);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		};

		addButton.addActionListener(add);
		displayButton.addActionListener(display);
		clearButton.addActionListener(clear);
		frame.setLayout(new FlowLayout());
		frame.add(label);
		frame.add(addButton);
		frame.add(displayButton);
		frame.add(clearButton);
		frame.setSize(400, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}
}