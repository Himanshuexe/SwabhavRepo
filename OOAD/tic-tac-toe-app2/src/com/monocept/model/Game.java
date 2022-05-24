package com.monocept.model;

public class Game {
	private Result result;
	private Player[] players;
	private Player currentPlayer;
	private ResultAnalyser analyser;
	private Board board;
	private int playerTurn = 2;

	public Game(Player[] players, Board board, ResultAnalyser analyser) {
		super();
		this.players = players;
		this.board = board;
		this.analyser = analyser;
		this.currentPlayer = players[0];
	}

	public void play(int cellLocation) {
		board.markAtCell(cellLocation, currentPlayer.getMark());
		playerTurn++;
		currentPlayer = players[playerTurn % 2];
		result = analyser.analyseResult();
	}

	public Result getResult() {
		return result;
	}

	public Player[] getPlayers() {
		return players;
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public Player getLastPlayer() {
		if (playerTurn % 2 == 0)
			return players[1];
		return players[0];
	}

	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

}
