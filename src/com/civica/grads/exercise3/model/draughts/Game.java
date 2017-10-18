package com.civica.grads.exercise3.model.draughts;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

import com.civica.grads.exercise3.interfaces.Describable;
import com.civica.grads.exercise3.model.player.Player;

public class Game implements Describable {
	final private Board board ; 
	private static int startingPlayerCounters ; 
	private Player[] player ; 
	final private ArrayList<Move> moves = new ArrayList<Move>() ;
	
	/**
	 * This operation updates the board with the data from the moves;
	 */
	private void updateBoard()
	{
		throw new RuntimeException("This code is missing"); //TODO
	}
	
	public int getNumberOfMoves() {
		return moves.size();
	}

	public boolean hasMoves() {
		return moves.isEmpty();
	}

	public boolean addMove(Move e) {
		return moves.add(e);
	}

	public void clearMoves() {
		moves.clear();
	}

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
	
	private static void checkBoardSizeValue(int size) throws IllegalArgumentException {
		if (size <  8 || size > 12 || (size % 2) == 1) {
			throw new IllegalArgumentException("Board size is incorrect.") ; 
		}
		else {
			startingPlayerCounters = (size - 2)*(size/2) ; 
		}
	}
	
	public Board getBoard() {
		return board;
	}

	public int getStartingPlayerCounters() {
		return startingPlayerCounters;
	}

	public Player[] getPlayer() {
		return player;
	}

	public ArrayList<Move> getMoves() {
		return moves;
	}

	@Override
	public void describe(OutputStream out) throws IOException {
		out.write(this.toString().getBytes()) ;  
	}

	@Override
	public String toString() {
		return "Game [board=" + board + ", startingPlayerCounters=" + startingPlayerCounters + ", player="
				+ Arrays.toString(player) + ", moves=" + moves + "]";
	}
	
}
