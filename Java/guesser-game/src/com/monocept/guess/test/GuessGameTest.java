package com.monocept.guess.test;

import java.util.Scanner;
import com.monocept.guess.main.GenerateNumberCheck;

public class GuessGameTest {

	public static void main(String args[]) {
		char ch;
		Scanner obj = new Scanner(System.in);
		GenerateNumberCheck p1;
		do {
			p1 = new GenerateNumberCheck();
			System.out.println("Guess a number between 1 to 100, You have 10 turns.");
			p1.guessCheck();
			System.out.printf("Do you want to play again? (Y or N): ");
			Scanner keyboard = new Scanner(System.in);
			ch = obj.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
		obj.close();
		System.out.println("Thanks for playing.");
	}
}
