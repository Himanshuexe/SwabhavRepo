package com.monocept.model;

import java.util.Scanner;
import java.util.Random;

public class PigGame {

	public static void main(String[] args) {
		int playerScore = 0;
		int playerTotal = 0;

		int dice;
		int turn = 1;
		boolean gameOver = false;
		boolean turnOver = false;
		char repeat;
		String input = null;
		Scanner keyboard = new Scanner(System.in);

		Random random = new Random();
		while (!gameOver) {
			System.out.println("Turn " + turn);
			do {
				dice = random.nextInt(6) + 1;
				System.out.println("Die: " + dice);
				if (dice == 1) {
					playerScore = 0;
					System.out.print("Turn over. No Score. ");
					turnOver = true;
					break;
				} else {
					playerScore += dice;
					if (playerScore >= 20) {
						System.out.println("YOU WIN!");
						System.out.println("You took " + turn + " turns.");
						gameOver = true;
						turnOver = true;
					}
					System.out.println("Roll or hold?(r/h): ");
					input = keyboard.nextLine();
					if (input.equalsIgnoreCase("r")) {
						continue;
					}
					if (input.equalsIgnoreCase("h")) {
						System.out.println("Your score is " + playerScore);
						turnOver = true;
						break;
					}
				}
				playerTotal += playerScore;
				turnOver = true;
				continue;
			} while (!turnOver);
			turn++;
			System.out.println();
		}
	}

	private static int roll() {
		int dice = pg.play();
		System.out.println(dice);
		if (dice == 1) {
			reset(pg);
		}
		return dice;
	}
}
