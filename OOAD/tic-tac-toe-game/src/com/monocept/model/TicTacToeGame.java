package com.monocept.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicTacToeGame {

	public Boolean checkWinner(List<Integer> playerPos) {
		List topRow = Arrays.asList(1, 2, 3);
		List midRow = Arrays.asList(4, 5, 6);
		List bottomRow = Arrays.asList(7, 8, 9);
		List leftcol = Arrays.asList(1, 4, 7);
		List midCol = Arrays.asList(2, 5, 8);
		List rightCol = Arrays.asList(3, 6, 9);
		List cross1 = Arrays.asList(1, 5, 9);
		List cross2 = Arrays.asList(7, 5, 3);

		List<List> winningConditions = new ArrayList<List>();
		winningConditions.add(topRow);
		winningConditions.add(midRow);
		winningConditions.add(bottomRow);
		winningConditions.add(leftcol);
		winningConditions.add(midCol);
		winningConditions.add(rightCol);
		winningConditions.add(cross1);
		winningConditions.add(cross2);
		
		for (List l:winningConditions) {
			if(playerPos.containsAll(l)) {
				
			}
		}
		return true;
	}
}
