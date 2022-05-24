package com.monocept.model.unit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.monocept.model.Board;
import com.monocept.model.Mark;
import com.monocept.model.Result;
import com.monocept.model.ResultAnalyser;

class ResultAnalyserUnitTest {

	@Test
	void shouldShowWinForCrossVertically() {
		Board b = new Board();
		b.markAtCell(0, Mark.X);
		b.markAtCell(3, Mark.X);
		b.markAtCell(6, Mark.X);
		ResultAnalyser analyser = new ResultAnalyser(b);
		assertEquals(Result.WIN, analyser.analyseResult());
	}

	@Test
	void shouldShowWinForCrossHorizontally() {
		Board b = new Board();
		b.markAtCell(0, Mark.X);
		b.markAtCell(1, Mark.X);
		b.markAtCell(2, Mark.X);
		ResultAnalyser analyser = new ResultAnalyser(b);
		assertEquals(Result.WIN, analyser.analyseResult());
	}

	@Test
	void shouldShowWinForCrossDiagonally() {
		Board b = new Board();
		b.markAtCell(0, Mark.X);
		b.markAtCell(4, Mark.X);
		b.markAtCell(8, Mark.X);
		ResultAnalyser analyser = new ResultAnalyser(b);
		assertEquals(Result.WIN, analyser.analyseResult());
	}

	@Test
	void shouldShowWinForNoughtVertically() {
		Board b = new Board();
		b.markAtCell(0, Mark.O);
		b.markAtCell(3, Mark.O);
		b.markAtCell(6, Mark.O);
		ResultAnalyser analyser = new ResultAnalyser(b);
		assertEquals(Result.WIN, analyser.analyseResult());
	}

	@Test
	void shouldShowWinForNoughtHorizontally() {
		Board b = new Board();
		b.markAtCell(0, Mark.O);
		b.markAtCell(1, Mark.O);
		b.markAtCell(2, Mark.O);
		ResultAnalyser analyser = new ResultAnalyser(b);
		assertEquals(Result.WIN, analyser.analyseResult());
	}

	@Test
	void shouldShowWinForNoughtDiagonally() {
		Board b = new Board();
		b.markAtCell(0, Mark.O);
		b.markAtCell(4, Mark.O);
		b.markAtCell(8, Mark.O);
		ResultAnalyser analyser = new ResultAnalyser(b);
		assertEquals(Result.WIN, analyser.analyseResult());
	}

	@Test
	void shouldShowDrawWhenBoardIsFull() {
		Board b = new Board();
		b.markAtCell(0, Mark.O);
		b.markAtCell(1, Mark.X);
		b.markAtCell(2, Mark.X);
		b.markAtCell(3, Mark.X);
		b.markAtCell(4, Mark.O);
		b.markAtCell(5, Mark.O);
		b.markAtCell(6, Mark.O);
		b.markAtCell(7, Mark.O);
		b.markAtCell(8, Mark.X);
		ResultAnalyser analyser = new ResultAnalyser(b);
		assertEquals(Result.DRAW, analyser.analyseResult());
	}
}
