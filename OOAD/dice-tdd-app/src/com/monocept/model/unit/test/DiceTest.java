package com.monocept.model.unit.test;

import java.util.HashMap;
import java.util.Map;

import com.monocept.model.DiceRoller;

public class DiceTest {
	public static void main(String[] args) {

		DiceRoller dice = new DiceRoller();

		Map<Integer, Integer> d = dice.roll(10);
		for (Integer key : d.keySet()) {
			System.out.println(key + " : " + d.get(key));
		}
	}
}