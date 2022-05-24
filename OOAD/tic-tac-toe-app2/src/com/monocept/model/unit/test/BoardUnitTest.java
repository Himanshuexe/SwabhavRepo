package com.monocept.model.unit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.monocept.model.Board;
import com.monocept.model.Cell;
import com.monocept.model.Mark;

class BoardUnitTest {

	@Test
	void shouldBeAbleToCreateABoardWith9EmptyCells() {
		Board b = new Board();
		Cell[] cells = b.getCells();
		for (Cell c : cells) {
			assertTrue(c.getMark() == Mark.EMPTY);
		}
		assertTrue(cells.length == 9);
	}

	@Test
	void shouldBeAbleToMarkAtSpecificLocation() {
		Board b = new Board();
		b.markAtCell(4, Mark.X);
		assertTrue(b.getSpecificCell(4).getMark() == Mark.X);
	}

	@Test
	void shouldThrowExceptionIfWrongIndexPassed() {
		Board b = new Board();
		assertThrows(RuntimeException.class, () -> {
			b.markAtCell(9, Mark.X);
		}, "Wrong Index Entered");
	}

	@Test
	void shouldCheckIfBoardIsFull() {
		Board b = new Board();
		b.markAtCell(0, Mark.X);
		b.markAtCell(1, Mark.O);
		b.markAtCell(2, Mark.X);
		b.markAtCell(3, Mark.X);
		b.markAtCell(4, Mark.X);
		b.markAtCell(5, Mark.X);
		b.markAtCell(6, Mark.X);
		b.markAtCell(7, Mark.X);
		b.markAtCell(8, Mark.X);
		assertTrue(b.isBoardFull());
	}

}
