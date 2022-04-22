package com.monocept.model;

import java.util.Scanner;

public class BookCricket {
	private int randomNumber;
	private int score;
	private int turns;
	private int lastPlayerScore;

	public BookCricket(int previousScore) {
		this.score = 0;
		this.turns = 0;
		lastPlayerScore = previousScore;
	}

	public void playGame() {
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Press any key to shuffle page | Press N to stop : ");
			String choice;
			choice = scan.next();
			if (choice.equalsIgnoreCase("N")) {
				break;
			}
			System.out.println("Turn " + (turns + 1));
			randomNumber = (int) ((Math.random() * 300) + 1);
			System.out.println("Page Number: " + this.randomNumber);
			int page = randomNumber % 7;
			if (page == 0) {
				System.out.println("Got 0.");
				turns++;
				break;
			}
			this.score += page;
			turns++;
			System.out.print("Score: " + page + "\n");
			System.out.println("Total score: " + this.score);
			if (this.score > lastPlayerScore)
				break;
		}
		System.out.println("Turn ended.");
		System.out.println("Total score: " + this.score);
	}

	public String getWinner(BookCricket player) {
		if (this.getScore() > player.getScore())
			return "Player 1 Won";
		if (this.getScore() < player.getScore())
			return "Player 2 Won";
		if (this.getScore() == player.getScore()) {
			if (this.turns < player.turns)
				return "Player 1 Won";
			if (this.turns > player.turns)
				return "Player 2 Won";
			if (this.turns == player.turns)
				return "Players Tied";
		}
		return null;
	}

	public int getScore() {
		return this.score;
	}
}
