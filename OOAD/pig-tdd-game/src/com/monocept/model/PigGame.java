package com.monocept.model;

import java.util.Random;

public class PigGame {

	private int playerScore;
	private int turnScore;
	private int turn;

	public int play() {
		int dice = rollDice();
		updateTurnScore(dice);
		return dice;
	}

	private void updateTurnScore(int diceNumber) {
		if (diceNumber == 1) {
			this.turnScore = 0;
		} else {

			this.turnScore += diceNumber;
		}
	}

	private int rollDice() {
		Random rand = new Random();
		return rand.nextInt(6) + 1;
	}

	public void incrementTurn() {
		this.turn++;
	}

	public void updateTurnScoreToZero() {
		this.turnScore = 0;
	}

	public void updateTotalScore() {
		this.playerScore += this.turnScore;
	}

	public int getPlayerScore() {
		return this.playerScore;
	}

	public int getTurnScore() {
		return this.turnScore;
	}

	public int getTurn() {
		return this.turn;
	}
}
