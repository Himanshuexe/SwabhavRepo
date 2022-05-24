package com.monocept.model;

public class ResultAnalyser {
	private Board board;

	public ResultAnalyser(Board board) {
		this.board = board;
	}

	public Boolean horizontalCheck() {
		Cell[] cellCheck = board.getCells();
		if (cellCheck[0].equals(cellCheck[1]) && cellCheck[1].equals(cellCheck[2])) {
			if (cellCheck[1].getMark() != Mark.EMPTY)
				return true;
		}
		if (cellCheck[3].equals(cellCheck[4]) && cellCheck[4].equals(cellCheck[5])) {
			if (cellCheck[4].getMark() != Mark.EMPTY)
				return true;
		}
		if (cellCheck[6].equals(cellCheck[7]) && cellCheck[7].equals(cellCheck[8])) {
			if (cellCheck[7].getMark() != Mark.EMPTY)
				return true;
		}
		return false;
	}

	public Boolean verticalCheck() {
		Cell[] cellCheck = board.getCells();
		if (cellCheck[0].equals(cellCheck[3]) && cellCheck[3].equals(cellCheck[6])) {
			if (cellCheck[3].getMark() != Mark.EMPTY)
				return true;
		}
		if (cellCheck[1].equals(cellCheck[4]) && cellCheck[4].equals(cellCheck[7])) {
			if (cellCheck[4].getMark() != Mark.EMPTY)
				return true;
		}
		if (cellCheck[2].equals(cellCheck[5]) && cellCheck[5].equals(cellCheck[8])) {
			if (cellCheck[5].getMark() != Mark.EMPTY)
				return true;
		}
		return false;
	}

	public Boolean diagonalCheck() {
		Cell[] cellCheck = board.getCells();
		if (cellCheck[0].equals(cellCheck[4]) && cellCheck[4].equals(cellCheck[8])) {
			if (cellCheck[4].getMark() != Mark.EMPTY)
				return true;
		}
		if (cellCheck[2].equals(cellCheck[4]) && cellCheck[4].equals(cellCheck[6])) {
			if (cellCheck[4].getMark() != Mark.EMPTY)
				return true;
		}
		return false;
	}

	public Result analyseResult() {
		if (verticalCheck())
			return Result.WIN;
		if (horizontalCheck())
			return Result.WIN;
		if (diagonalCheck())
			return Result.WIN;
		if (board.isBoardFull())
			return Result.DRAW;
		return Result.UNDETERMINED;
	}
}
