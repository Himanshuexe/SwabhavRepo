package com.monocept.model.unit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.monocept.model.Board;
import com.monocept.model.Game;
import com.monocept.model.Mark;
import com.monocept.model.Player;
import com.monocept.model.ResultAnalyser;

class GameUnitTest {

	@Test
	void h() {
		Player[] players = new Player[2];
		players[0] = new Player("himanshu", Mark.X);
		players[1] = new Player("rohan", Mark.O);
		Board board = new Board();
		ResultAnalyser analyser = new ResultAnalyser(board);
		Game game = new Game(players, board, analyser);
		assertEquals(players[0], game.getCurrentPlayer());
	}

	@Test
	void h2() {
		Player[] players = new Player[2];
		players[0] = new Player("himanshu", Mark.X);
		players[1] = new Player("rohan", Mark.O);
		Board board = new Board();
		ResultAnalyser analyser = new ResultAnalyser(board);
		Game game = new Game(players, board, analyser);
		game.play(8);
		assertEquals(players[1], game.getCurrentPlayer());

	}
}
