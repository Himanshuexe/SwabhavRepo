package com.monocept.model.unit.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.monocept.model.NegativeValueNotAllowedException;
import com.monocept.model.OddEvenGenerator;

class OddEvenGeneratorUnitTest {

	@Test
	void getEvenNosTillMethodNotReturnNull() {
		OddEvenGenerator generator = new OddEvenGenerator();
		int[] result = generator.getEvenNosTill(10);
		assertNotNull(result);
	}

	@Test
	void getEvenTillShouldGenerate5EvenNosForInput10() {
		int expectedEvenNosSize = 5;
		int[] expectedEvenNos = { 2, 4, 6, 8, 10 };
		OddEvenGenerator generator = new OddEvenGenerator();
		int[] evnos = generator.getEvenNosTill(10);
		assertTrue(evnos.length == expectedEvenNosSize);
		assertArrayEquals(evnos, expectedEvenNos);
	}

	@Test
	void getEvenTillShouldGenerate10EvenNosForInput20() {
		int expectedEvenNosSize = 10;
		int[] expectedEvenNos = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		OddEvenGenerator generator = new OddEvenGenerator();
		int[] evnos = generator.getEvenNosTill(20);
		assertTrue(evnos.length == expectedEvenNosSize);
		assertArrayEquals(evnos, expectedEvenNos);
	}

	@Test
	void getOddNosTillMethodNotReturnNull() {
		OddEvenGenerator generator = new OddEvenGenerator();
		int[] result = generator.getOddNosTill(10);
		assertNotNull(result);
	}

	@Test
	void getOddTillShouldGenerate5EvenNosForInput10() {
		int expectedOddNosSize = 5;
		int[] expectedOddNos = { 1, 3, 5, 7, 9 };
		OddEvenGenerator generator = new OddEvenGenerator();
		int[] odnos = generator.getOddNosTill(10);
		assertTrue(odnos.length == expectedOddNosSize);
		assertArrayEquals(odnos, expectedOddNos);
	}

	@Test
	void getOddTillShouldGenerate5EvenNosForInput20() {
		int expectedOddNosSize = 10;
		int[] expectedOddNos = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
		OddEvenGenerator generator = new OddEvenGenerator();
		int[] odnos = generator.getOddNosTill(20);
		assertTrue(odnos.length == expectedOddNosSize);
		assertArrayEquals(odnos, expectedOddNos);
	}

	@Test
	void shouldThrowException() {
		OddEvenGenerator generator = new OddEvenGenerator();
		assertThrows(NegativeValueNotAllowedException.class, () -> generator.getEvenNosTill(-10),
				"Failed:NegativeValueNotAllowedException.");
	}
}
