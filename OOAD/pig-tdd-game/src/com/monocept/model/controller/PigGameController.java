package com.monocept.model.controller;

import java.util.Scanner;

import com.monocept.model.PigGame;

public class PigGameController {
	public void start() {
		PigGame pg = new PigGame();
		System.out.println("TURN " + (pg.getTurn() + 1));

		while (pg.getPlayerScore() + pg.getTurnScore() < 20) {
			startTurn(pg);
		}
		pg.updateTotalScore();
		System.out.println("You Won!!!");
		pg.incrementTurn();
		printScoreDetails(pg);
	}

	private static void startTurn(PigGame pg) {
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

	private static void reset(PigGame pg) {
		System.out.println("Your Turn Ends!!");
		pg.incrementTurn();
		printScoreDetails(pg);
		System.out.println("TURN " + (pg.getTurn() + 1));
	}

	private static int roll(PigGame pg) {
		int dice = pg.play();
		System.out.println(dice);
		if (dice == 1) {
			reset(pg);
		}
		return dice;
	}

	private static void hold(PigGame pg) {
		pg.updateTotalScore();
		pg.incrementTurn();
		printScoreDetails(pg);
		pg.updateTurnScoreToZero();
		System.out.println("TURN " + (pg.getTurn() + 1));
	}

	private static void printScoreDetails(PigGame pg) {
		System.out.println("Turn Score : " + pg.getTurnScore());
		System.out.println("Total Score : " + pg.getPlayerScore());
		System.out.println("Total Turns : " + pg.getTurn());
	}
}
