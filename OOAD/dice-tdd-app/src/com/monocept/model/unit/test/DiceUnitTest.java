package com.monocept.model.unit.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import com.monocept.model.DiceRoller;

public class DiceUnitTest {

	@Test
	void diceNotGivingValueMoreThan6() {
		DiceRoller dice = new DiceRoller();
		Map<Integer, Integer> score = dice.roll(10);

		for (Integer key : score.keySet())
			assertTrue(key <= 6);
	}

	@Test
	void diceNotGivingValue0() {
		DiceRoller dice = new DiceRoller();
		Map<Integer, Integer> score = dice.roll(10);

		for (Integer key : score.keySet())
			assertTrue(key >= 0);
	}

	@Test
	void diceShouldNotHaveFrequencyMoreThan10() {
		DiceRoller dice = new DiceRoller();
		Map<Integer, Integer> score = dice.roll(10);

		int frequency = 0;
		for (Integer key : score.keySet())
			frequency += score.get(key);

		assertEquals(10, frequency);
	}

}
