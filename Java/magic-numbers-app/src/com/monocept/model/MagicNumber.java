package com.monocept.model;

import java.util.Scanner;

public class MagicNumber {
	public static void main(String[] args) {
		int guess;
		System.out.println("attempt a guess:");
		Scanner scan = new Scanner(System.in);
		boolean win = false;
		int turns = 0;
		while (!win) {
			guess = scan.nextInt();
			turns++;
			if (turns == 5) // here 5 is a magic number
			{
				System.out.println("You lose the right answer was.");
				System.out.println("You used up all the allowed turns.");
				break;
			}
		}
	}
}
