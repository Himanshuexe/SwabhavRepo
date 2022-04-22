package com.monocept.model.unit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.monocept.model.PigGame;

class PigGameUnitTest {

	@Test
	void diceFaceShouldBeValid() {
		PigGame dice = new PigGame();
		int score = dice.play();
		assertTrue(score >= 0 && score <= 6);
	}
}
