package com.monocept.guess.game;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

	public static void guessGame() {
		System.out.println("Number Guessing Game - created by Himanshu Saraswat.");
		Random Random_number = new Random();
		int right_guess = Random_number.nextInt(100);
		int turns = 0;
		System.out.println("Guess a number between 1 to 100, You have 25 turns.");
		int guess;
		int maxTurns = 0;
		Scanner scan = new Scanner(System.in);
		boolean win = false;
		while (!win) {
			guess = scan.nextInt();
			turns++;
			if (maxTurns == 24) {
				System.out.println("You lose the right answer was: " + right_guess);
				System.out.println("You used up all the allowed turns.");
				return;
			} else if (guess == right_guess) {
				win = true;
				System.out.println("You win!");
				System.out.println("The right number was " + right_guess);
				System.out.println("You used " + turns + " turns to guess the right number");
			} else if (guess < right_guess) {
				maxTurns++;
				System.out.println("Sorry, Your Guess is too low.");
			} else if (guess > right_guess) {
				maxTurns++;
				System.out.println("Sorry, Your Guess is too high.");
			}
		}

	}

	public static void main(String args[]) {
		boolean playAgain = false;
		do {
			guessGame();
			System.out.printf("Do you want to play again? (Y or N): ");
			Scanner keyboard = new Scanner(System.in);
			String repeatAgain;
			repeatAgain = keyboard.next();
			if (repeatAgain.equalsIgnoreCase("Y")) {
				playAgain = true;
			} else if (repeatAgain.equalsIgnoreCase("N")) {
				playAgain = false;
				System.out.println("You chose to exit the game. Thanks for playing.");
				keyboard.close();
			} else {
				System.out.println("Invalid response.");
				keyboard.close();
			}
		} while (playAgain == true);
	}
}
