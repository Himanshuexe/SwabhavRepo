package com.monocept.model.test;

import com.monocept.model.BookCricket;

public class BookCricketTest {

	public static void main(String[] args) {
		BookCricket player1;
		BookCricket player2;
		int maxScore = 1000;
		player1 = new BookCricket(maxScore);
		System.out.println("Player 1's turn: ");
		player1.playGame();
		System.out.println("\n"
				+ "***************************************************************************************************************"
				+ "\n");
		player2 = new BookCricket(player1.getScore());
		System.out.println("Player 2's turn: ");
		player2.playGame();
		System.out.println("Player 1 Score: " + player1.getScore() + "\n" + "Player 2 Score:" + player2.getScore());
		System.out.println(player1.getWinner(player2));
	}
}
