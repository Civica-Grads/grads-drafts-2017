package com.civica.grads.boardgames.model.draughts;

import com.civica.grads.boardgames.model.Game;
import com.civica.grads.boardgames.model.player.Player;

public class DraughtsGame extends Game {

	public DraughtsGame(int size, Player[] player) {
		super(size, player);
		
	}
	

	@Override
	protected void initialiseBoardForGame() {
		
		

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
