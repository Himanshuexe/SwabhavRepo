package com.monocept.model;

public class Board {
	private Cell[] cells = new Cell[9];

	public Board() {
		for (int i = 0; i < cells.length; i++) {
			cells[i] = new Cell();
		}
	}

	public Cell[] getCells() {
		return cells;
	}

	public Cell getSpecificCell(int index) {
		return cells[index];
	}

	public Boolean isBoardFull() {
		int count = 0;
		for (Cell c : cells) {
			if (!c.isCellEmpty())
				count += 1;
		}
		if (!(count == 9))
			return false;
		return true;
	}

	public void markAtCell(int index, Mark mark) {
		if (!(index > -1 && index < 9))
			throw new RuntimeException("Wrong Index Entered");
		cells[index].setMark(mark);
	}

}
