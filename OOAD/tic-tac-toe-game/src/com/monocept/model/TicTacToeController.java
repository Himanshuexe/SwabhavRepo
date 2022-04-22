package com.monocept.model;

import java.util.ArrayList;
import java.util.Scanner;

public class TicTacToeController {
	TicTacToeBoard gameBoard = new TicTacToeBoard();
	static ArrayList<Integer> player1Positions = new ArrayList<Integer>();
	static ArrayList<Integer> player2Positions = new ArrayList<Integer>();

	public void start() {
		System.out.println("Welcome to Tic-Tac-Toe Game.");
		displayMenu();

	}

	public void displayMenu() {
		System.out.println("Player 1, chose your symbol.(X or O):");
		Scanner scan = new Scanner(System.in);
		char player1Symbol = scan.next().charAt(0);
		char player2Symbol;
		if (player1Symbol == 'X') {
			player2Symbol = 'O';
		}
		player2Symbol = 'X';
		System.out.println("Player 1 chose: " + player1Symbol + ", Player 2 got: " + player2Symbol);
		while (true) {
			System.out.println("Player 1 enter position to place piece.(1-9):");
			int player1Pos = scan.nextInt();
			placePiece(player1Pos, player1Symbol);
			gameBoard.displayBoard();
			System.out.println("Player 1 enter position to place piece.(1-9):");
			int player2Pos = scan.nextInt();
			placePiece(player2Pos, player2Symbol);

		}
	}

	public void placePiece(int pos, char symbol) {

		char[][] board = gameBoard.newBoard();
		switch (pos) {
		case 1:
			board[0][0] = symbol;
			break;
		case 2:
			board[0][2] = symbol;
			break;
		case 3:
			board[0][4] = symbol;
			break;
		case 4:
			board[2][0] = symbol;
			break;
		case 5:
			board[2][2] = symbol;
			break;
		case 6:
			board[2][4] = symbol;
			break;
		case 7:
			board[4][0] = symbol;
			break;
		case 8:
			board[4][2] = symbol;
			break;
		case 9:
			board[4][4] = symbol;
			break;
		default:
			break;
		}
	}
}
