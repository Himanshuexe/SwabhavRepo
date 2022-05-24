package com.monocept.model;

public class Cell {
	private Mark mark;

	public Cell() {
		mark = Mark.EMPTY;
	}

	public Boolean isCellEmpty() {
		if (mark == Mark.EMPTY)
			return true;
		return false;
	}

	public Mark getMark() {
		return mark;
	}

	public void setMark(Mark mark) {
		if (!isCellEmpty())
			throw new RuntimeException("Cell already marked");
		this.mark = mark;
	}

	@Override
	public String toString() {
		return mark.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mark == Mark.EMPTY) ? 0 : mark.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass())
			return false;
		Cell other = (Cell) obj;
		if (mark != other.mark)
			return false;
		return true;
	}

}
