package com.civica.grads.boardgames.model.draughts;

import com.civica.grads.boardgames.enums.Colour;
import com.civica.grads.boardgames.enums.CounterType;
import com.civica.grads.boardgames.exceptions.NoPieceException;
import com.civica.grads.boardgames.exceptions.GameException;
import com.civica.grads.boardgames.interfaces.Move;
import com.civica.grads.boardgames.model.Counter;
import com.civica.grads.boardgames.model.Game;
import com.civica.grads.boardgames.model.Position;
import com.civica.grads.boardgames.model.player.Player;

public class DraughtsGame extends Game {
	private int counterKey ; 

	public static final int BOARD_SIZE = 8 ;
	

	protected DraughtsGame(int size, Player[] player) {
		super(size, player);
		counterKey = 0 ; 
		
	}
	

	public DraughtsGame(Player[] player) {
		this(BOARD_SIZE,player);
	}


	/**
	 * This method initially populates the board with counters, having a Counter object on a set position
	 * an null if there isn't one. It loops from the top left and adds a white counter on every other tile from the
	 * second one (so odd numbered tile starting at 0). It then does the loop again from the bottom right filling the
	 * bottom half of the board with black counters. It leaves a space in the middle so counters can move.
	 */
	@Override
	protected void initialiseBoardForGame() {
		
		int boardSize = board.getSize();
		
		// true if tile should start with a counter on it
		boolean isStartTile;
		
		/*This equation works out how many counters the game should
		 *  have depending on the size, according to standard draughts rules.*/
		int initialTotalCounters = (boardSize-2)*(boardSize/2);
		int whiteCountersLeft = initialTotalCounters/2;
		int blackCountersLeft = initialTotalCounters/2;
		
		//This is the for loop for the white counters.
		for(int i = 0; i < boardSize; i++) {
			for(int j = 0; j < boardSize; j++) {
				
				/*Adds the current i and j values, then divides by 2 and if there's a remainder 
				 * then it is odd. Tiles only get a counter if it's an odd value.*/
				isStartTile = (i+j)%2 == 1;

				if (isStartTile) {
					createNewCounterAndPlace((Counter) board.getBoard()[i][j], Colour.WHITE) ; 
					
					whiteCountersLeft--;
				} else {
					board.getBoard()[i][j] = null;
				}
			}
			if (whiteCountersLeft <= 0) {
				break;
			}
		}
		
		//This is the for loop for the black counters
		for(int i = boardSize-1; i >= 0; i--) {
			for(int j = boardSize-1; j >= 0; j--) {
				
				/*Adds the current i and j values, then divides by 2 and if there's a remainder 
				 * then it is odd. Tiles only get a counter if it's an odd value.*/
				isStartTile = (i+j)%2 == 1;

				if (isStartTile) {
					createNewCounterAndPlace((Counter) board.getBoard()[i][j], Colour.BLACK) ; 

					blackCountersLeft--;
				} else {
					board.getBoard()[i][j] = null;
				}
			}
			if (blackCountersLeft <= 0) {
				break;
			}
		}
	}
	
	private void createNewCounterAndPlace(Counter counter, Colour colour) {
		counter = new Counter(colour, CounterType.NORMAL, counterKey++);
	}
	
	
	// TODO: Either check valid move (R&P) before calling this or at the start!
	public void applyMove(Move move) throws GameException { 
		Position start = move.getPositionStart() ; 
		Position end = move.getPositionFinish() ; 
		
		board.placePiece(board.getAndRemovePiece(start), end); 
	}
	

	public void removeCounter(Position position) {
		board.getBoard()[position.getX()][position.getY()] = null ; 
	}
	/**
	 * This method checks the board size and throws an exception if the size is inappropriate 
	 * @param size is of type int
	 * @throws IllegalArgumentException if board size is wrong
	 */
	protected void checkBoardSizeValue(int size) throws IllegalArgumentException {

		if (size <  8 || size > 12 || (size % 2) == 1) {
			throw new IllegalArgumentException("Board size is incorrect.") ; 
		}
		else {
			startingPlayerCounters = (size - 2)*(size/2) ; 
		}
	}
	
	/**
	 * This method simply removes a piece from the board. 
	 * If there is no piece on the tile, throws an exception.
	 * @Override
	 */
	public void takePiece(Position position) throws NoPieceException {
		
		if (board.getBoard()[position.getY()][position.getX()] == null) {
			throw new NoPieceException("Trying to remove a piece from a tile where one does not exist.") ; 
		}
		else {
			board.getBoard()[position.getY()][position.getX()] = null ;
		} 
				
		return ; 
	}
	
	

}
