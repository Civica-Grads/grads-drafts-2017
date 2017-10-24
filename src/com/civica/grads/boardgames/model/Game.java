package com.civica.grads.boardgames.model;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import com.civica.grads.boardgames.exceptions.NoPieceException;
import com.civica.grads.boardgames.exceptions.GameException;
import com.civica.grads.boardgames.interfaces.Describable;
import com.civica.grads.boardgames.interfaces.DeterminesNextMove;
import com.civica.grads.boardgames.interfaces.Move;
import com.civica.grads.boardgames.model.player.Player;
import com.civica.grads.boardgames.exceptions.NoPieceException;


public abstract class Game implements Describable,DeterminesNextMove {
	
	final protected Board board ; 
	protected Player[] player ; 
	final protected ArrayList<TurnRecord> turnRecords = new ArrayList<>() ;


	

	/**
	 * Constructor for game that takes in a int size and  and array of player objects. Also checks for IAE exception to catch wrong board sizes
	 * @param size is the size of the board of type int
	 * @param player is an array of player objects
	 */
	public Game(int size, Player[] player) {
	    checkBoardSizeValue(size) ; 
		this.board = new Board(size) ;
		this.player = player ; 
		initialiseBoardForGame() ; 
	}
	
	/**
	 * Sets the board up for the type of game.
	 */
	abstract protected void initialiseBoardForGame();
	
	public abstract void applyMove(Move move) throws GameException ;
	
	/**
	 * This operation updates the board with the data from the moves;
	 */
	private void updateBoard()
	{
		throw new RuntimeException("This code is missing"); //FIXME Update the board
	}
	
	abstract public void takePiece(Position position) throws NoPieceException ; 
	
	/**
	 * Retrieves number of turns in a game
	 * @return Number of turns
	 */
	public int getNumberOfTurns() {
		return turnRecords.size();
	}
	
	/**
	 * Checks if game has any turns
	 * @return True if turns count > 0, false otherwise
	 */
	public boolean hasTurns() {
		return turnRecords.isEmpty();
	}
	/**
	 * Adds a turn record to list
	 * @param e turn record
	 * @return true if successful, false if failed
	 */
	public boolean addTurn(TurnRecord turn) {
		return turnRecords.add(turn);
	}

    public void addTurns(Collection<TurnRecord> turns) {
        
        for ( TurnRecord turn:turns)
        {
            addTurn(turn);
        }
        
    }
	/**
	 * clears all the turns stored in the turnsRecord arraylist
	 */
	public void clearTurns() {
		turnRecords.clear();
	}

	
	abstract protected void checkBoardSizeValue(int size) throws IllegalArgumentException ;
	
	/**
	 * Retrieves board object
	 * @return Board object
	 */
	public Board getBoard() {
		return board;
	}


	public Player[] getPlayer() {
		return player;
	}

	public ArrayList<TurnRecord> getTurns() {
		return turnRecords;
	}

	@Override
	public void describe(OutputStream out) throws IOException {
		out.write(this.toString().getBytes()) ;  
	}

	
	@Override
	public String toString() {
		return "Game [board=" + board + ", player=" + Arrays.toString(player) + ", turnRecords=" + turnRecords + "]";
	}


	@Override
	public Move evaluate(Board board) {
		// TODO Auto-generated method stub
		return null;
	}


	
}
