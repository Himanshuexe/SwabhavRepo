package com.monocept.model;

public class TicTacToeBoard {

	public char[][] newBoard() {
		char[][] gameBoard = { { ' ', '|', ' ', '|', ' ' }, { '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' },
				{ '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' } };
		return gameBoard;
	}

	public void displayBoard() {
		for (char[] row : newBoard()) {
			for (char c : row) {

				System.out.print(c);
			}
			System.out.println();
		}
	}
}
