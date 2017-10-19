package com.civica.grads.boardgames.model;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

import com.civica.grads.boardgames.interfaces.Describable;
import com.civica.grads.boardgames.interfaces.DeterminesNextMove;
import com.civica.grads.boardgames.model.player.Player;

public abstract class Game implements Describable,DeterminesNextMove {
	
	final protected Board board ; 
	protected static int startingPlayerCounters ; 
	protected Player[] player ; 
	final protected ArrayList<TurnRecord> turnRecords = new ArrayList<>() ;
	
	

	/**
	 * Constructor for game that takes in a int size and  and array of player objects. Also checks for IAE exception to catch wrong board sizes
	 * @param size is the size of the board of type int
	 * @param player is an array of player objects
	 */
	public Game(int size, Player[] player) {
		try {
			checkBoardSizeValue(size) ; 
		}
		catch (IllegalArgumentException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		this.board = new Board(size) ;
		this.player = player ; 
	}
	
	/**
	 * Sets the board up for the type of game.
	 */
	abstract protected void initialiseBoardForGame();
	
	
	/**
	 * This operation updates the board with the data from the moves;
	 */
	private void updateBoard()
	{
		throw new RuntimeException("This code is missing"); //TODO
	}
	
	public int getNumberOfTurns() {
		return turnRecords.size();
	}

	public boolean hasTurns() {
		return turnRecords.isEmpty();
	}

	public boolean addTurn(TurnRecord e) {
		return turnRecords.add(e);
	}

	/**
	 * clears all the turns stored in the turnsRecord arraylist
	 */
	public void clearTurns() {
		turnRecords.clear();
	}

	
	abstract protected void checkBoardSizeValue(int size) throws IllegalArgumentException ;
	
	public Board getBoard() {
		return board;
	}
	

	public int getStartingPlayerCounters() {
		return startingPlayerCounters;
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
	public MoveRecord evaluate(Board board) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
