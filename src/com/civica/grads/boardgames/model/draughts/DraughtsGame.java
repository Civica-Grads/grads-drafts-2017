package com.civica.grads.boardgames.model.draughts;

import com.civica.grads.boardgames.enums.Colour;
import com.civica.grads.boardgames.enums.CounterType;
import com.civica.grads.boardgames.model.Counter;
import com.civica.grads.boardgames.model.Game;
import com.civica.grads.boardgames.model.Position;
import com.civica.grads.boardgames.model.player.Player;

public class DraughtsGame extends Game {

	public DraughtsGame(int size, Player[] player) {
		super(size, player);
		
	}
	

	@Override
	protected void initialiseBoardForGame() {
		
		int boardSize = board.getSize();
		
		// true if tile should start with a counter on it
		boolean isStartTile;
		
		
		//TODO: for loop to populate one colour in one direction, until maximum no hit (size-2)*(size/2), then use another for loop to populate backwards for other colour
		for(int i = 0; i < boardSize; i++) {
			for(int j = 0; j < boardSize; j++) {
				
				isStartTile = (i+j)%2 == 1;
				
				if (isStartTile ) {
					board.getBoard()[i][j] = new Counter(Colour.WHITE, 
														CounterType.NORMAL, 
														new Position(i, j));
				} else if (isStartTile  ) {
					board.getBoard()[i][j] = new Counter(Colour.BLACK, 
														CounterType.NORMAL, 
														new Position(i, j));
				} else {
					board.getBoard()[i][j] = null;
				}
			}
		}

	}


	/**
	 * This method checks the board size and throws an exception if the size is inappropriate 
	 * @param size is of type int
	 * @throws IllegalArgumentException if board size is wrong
	 */
	protected void checkBoardSizeValue(int size) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		if (size <  8 || size > 12 || (size % 2) == 1) {
			throw new IllegalArgumentException("Board size is incorrect.") ; 
		}
		else {
			startingPlayerCounters = (size - 2)*(size/2) ; 
		}
	}
	
	

}
