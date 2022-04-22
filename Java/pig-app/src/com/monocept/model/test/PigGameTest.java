package com.monocept.model.test;

import java.util.Scanner;

import com.monocept.model.PigGame;
import com.monocept.model.PigGame2;

public class PigGameTest {
	public static void main(String[] args) {
		PigGame2 pg = new PigGame2();
		System.out.println("TURN " + (pg.getTurn() + 1));

		while (pg.getPlayerScore() + pg.getTurnScore() < 20) {
			startTurn(pg);
		}
		pg.updateTotalScore();
		System.out.println("You Won!!!");
		pg.incrementTurn();
		printScoreDetails(pg);
	}

	private static void startTurn(PigGame2 pg) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Roll or hold? (r/h):");
		String choice = sc.nextLine();
		if (choice.equalsIgnoreCase("h")) {
			hold(pg);
			return;
		}
		if (choice.equalsIgnoreCase("r")) {
			roll(pg);
		}
	}

	private static void reset(PigGame2 pg) {
		System.out.println("Your Turn Ends!!");
		pg.incrementTurn();
		printScoreDetails(pg);
		System.out.println("TURN " + (pg.getTurn() + 1));
	}

	private static int roll(PigGame2 pg) {
		int dice = pg.play();
		System.out.println(dice);
		if (dice == 1) {
			reset(pg);
		}
		return dice;
	}

	private static void hold(PigGame2 pg) {
		pg.updateTotalScore();
		pg.incrementTurn();
		printScoreDetails(pg);
		pg.updateTurnScoreToZero();
		System.out.println("TURN " + (pg.getTurn() + 1));
	}

	private static void printScoreDetails(PigGame2 pg) {
		System.out.println("Turn Score : " + pg.getTurnScore());
		System.out.println("Total Score : " + pg.getPlayerScore());
		System.out.println("Total Turns : " + pg.getTurn());
	}
}