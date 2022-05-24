package com.monocept.model.test;

import com.monocept.model.Board;
import com.monocept.model.Cell;
import com.monocept.model.Mark;

public class BoardTest {
	public static void main(String[] args) {
		Board b = new Board();
		Cell[] c = b.getCells();
		for (Cell c1 : c) {
			System.out.println(b.getCells().toString());
		}
		System.out.println(b.isBoardFull());
		b.markAtCell(0, Mark.X);
		b.markAtCell(1, Mark.O);
		b.markAtCell(2, Mark.X);
		b.markAtCell(3, Mark.X);
		b.markAtCell(4, Mark.X);
		b.markAtCell(5, Mark.X);
		b.markAtCell(6, Mark.X);
		b.markAtCell(7, Mark.X);
		b.markAtCell(8, Mark.X);
		System.out.println(b.isBoardFull());
	}
}
