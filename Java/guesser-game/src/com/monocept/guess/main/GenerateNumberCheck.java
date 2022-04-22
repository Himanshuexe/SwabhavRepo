package com.monocept.guess.main;

import java.util.Random;
import java.util.Scanner;

public class GenerateNumberCheck {
	 Random Random_number = new Random();
		int number = Random_number.nextInt(100);
		int turns = 0;
	
public void guessCheck() {
        int guess;
		int i = 0;
		Scanner scan = new Scanner(System.in);
		boolean win = false;
		while (win == false) {
			guess = scan.nextInt();
				turns++;
				if (guess == number) {
					win = true;
				} else if (i > 8) {
					System.out.println("You lose the right answer was: " + number);
					return;
				} else if (guess < number) {
					i++;
					System.out.println("Sorry, Your Guess is too low.");
				} else if (guess > number) {
					i++;
					System.out.println("Sorry, Your Guess is too high.");
				}
			}
			System.out.println("You win!");
			System.out.println("The right number was " + number);
			System.out.println("You used " + turns + " turns to guess the right number");
	}
	}
