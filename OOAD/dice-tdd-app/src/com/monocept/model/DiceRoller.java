package com.monocept.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DiceRoller {

	public Map<Integer, Integer> roll(int rolls) {

		HashMap<Integer, Integer> diceScore = new HashMap<>();
		Random rand = new Random();

		for (int i = 1; i <= rolls; i++) {

			int face = rand.nextInt(6) + 1;

			if (diceScore.containsKey(face)) {
				diceScore.put(face, diceScore.get(face) + 1);
			}
			if (!diceScore.containsKey(face)) {
				diceScore.put(face, 1);
			}
		}
		return diceScore;
	}
}
