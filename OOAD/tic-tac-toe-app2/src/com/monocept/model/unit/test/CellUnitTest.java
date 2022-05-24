package com.monocept.model.unit.test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.monocept.model.Cell;
import com.monocept.model.Mark;

class CellUnitTest {

	@Test
	void shouldBeEmptyOnceCreated() {
		Cell c = new Cell();
		assertTrue(c.getMark() == Mark.EMPTY);
	}

	@Test
	void shouldBeAbleToMarkNought() {
		Cell c = new Cell();
		c.setMark(Mark.O);
		assertEquals(c.getMark(), Mark.O);
	}

	@Test
	void shouldBeAbleToMarkCross() {
		Cell c = new Cell();
		c.setMark(Mark.X);
		assertEquals(c.getMark(), Mark.X);
	}

	@Test
	void shouldThrowExceptionWhenMarkedTwice() {
		Cell c = new Cell();
		c.setMark(Mark.O);
		RuntimeException runtimeException = assertThrows(RuntimeException.class, () -> {
			c.setMark(Mark.X);
		}, "Cell already marked");
//		assertTrue(runtimeException.getMessage().contains("Cell already marked"));
	}

}
