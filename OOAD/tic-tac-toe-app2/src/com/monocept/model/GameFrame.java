package com.monocept.model;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GameFrame extends JFrame implements ActionListener {
	private JButton[] buttons = new JButton[9];
	private JFrame frame = new JFrame();
	private JPanel title_panel = new JPanel();
	private JPanel button_panel = new JPanel();
	private JLabel textfield = new JLabel();
	private JButton restart = new JButton();
	private Player[] players = { new Player("Player1", Mark.X), new Player("Player2", Mark.O) };
	private Board board = new Board();
	private ResultAnalyser analyser = new ResultAnalyser(board);
	private Game game = new Game(players, board, analyser);
	private int[] score = new int[2];

	public GameFrame() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		frame.setTitle("Welcome to Tic-Tac-Toe Game");
		frame.getContentPane().setBackground(Color.gray);
		frame.setLayout(new BorderLayout());

		textfield.setBackground(Color.gray);
		textfield.setForeground(Color.blue);
		textfield.setFont(new Font("Monospace", Font.BOLD, 75));
		textfield.setHorizontalAlignment(JLabel.CENTER);
		textfield.setText("Player 1's Turn");
		textfield.setOpaque(true);

		title_panel.setLayout(new BorderLayout());
		title_panel.setBounds(0, 0, 800, 100);

		button_panel.setLayout(new GridLayout(3, 3));
		button_panel.setBackground(new Color(150, 150, 150));

		for (int i = 0; i < 9; i++) {
			buttons[i] = new JButton();
			button_panel.add(buttons[i]);
			buttons[i].setFont(new Font("Monospace", Font.BOLD, 120));
			buttons[i].setFocusable(false);
			buttons[i].addActionListener(this);
		}

		title_panel.add(textfield);
		frame.add(title_panel, BorderLayout.NORTH);
		frame.add(button_panel);
		frame.setVisible(true);
	}

	public void restart() {
		for (int i = 0; i < 9; i++) {
			buttons[i].setText("");
		}
		board = new Board();
		analyser = new ResultAnalyser(board);
		game = new Game(players, board, analyser);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < 9; i++) {
			if (game.getResult() != Result.WIN) {
				if (e.getSource() == buttons[i]) {
					if (game.getCurrentPlayer() == players[0]) {
						if (buttons[i].getText() == "") {
							game.play(i);
							buttons[i].setForeground(Color.red);
							buttons[i].setText("" + players[0].getMark());
							textfield.setText("Player 2's Turn");
							if (game.getResult() == Result.WIN) {
								textfield.setText("Player 1 Won");
								score[0]++;
								JOptionPane pane = new JOptionPane();
								int dialogResult = JOptionPane.showConfirmDialog(pane,
										"Player 1 Won, Play Again?" + "\n" + "Player1 Score =" + score[0] + "\n"
												+ "Player2 Score =" + score[1],
										"Game Over.", JOptionPane.YES_NO_OPTION);
								if (dialogResult == JOptionPane.YES_OPTION)
									restart();
								else
									System.exit(0);
							}
							if (game.getResult() == Result.DRAW) {
								textfield.setText("Game Draw");
								JOptionPane pane = new JOptionPane();
								int dialogResult = JOptionPane
										.showConfirmDialog(pane,
												"Game Draw,Play Again" + "\n" + "Player1 Score=" + score[0] + "\n"
														+ "Player2 Score=" + score[1],
												"Game Over.", JOptionPane.YES_NO_OPTION);
								if (dialogResult == JOptionPane.YES_OPTION)
									restart();
								else
									System.exit(0);

							}
						}
					} else {
						if (buttons[i].getText() == "") {
							game.play(i);
							buttons[i].setForeground(Color.GREEN);
							buttons[i].setText("" + players[1].getMark());
							textfield.setText("Player 1's Turn");
							if (game.getResult() == Result.WIN) {
								textfield.setText("Player 2 Won");
								score[1]++;
								JOptionPane pane = new JOptionPane();
								int dialogResult = JOptionPane
										.showConfirmDialog(pane,
												"Player 2 Won,Play Again" + "\n" + "Player1 Score=" + score[0] + "\n"
														+ "Player2 Score=" + score[1],
												"Game Over.", JOptionPane.YES_NO_OPTION);
								if (dialogResult == JOptionPane.YES_OPTION)
									restart();
								else
									System.exit(0);
							}

						}
					}
				}
			}
		}
	}

}
