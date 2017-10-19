package com.civica.grads.boardgames.model;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

import com.civica.grads.boardgames.interfaces.Describable;


//TODO: Constructor only takes board size, counters will be dependent on this, counter belong to the board 
public class Board implements Describable {

	//* An array which represents the board; if null then there is nothing on a square ;
	private final Counter[][] countersOnBoard ; 
	
	public Board(Counter[][] countersOnBoard) {
		 this.countersOnBoard = countersOnBoard;
	}
	public Board(int size) {
		
		this( new Counter[size][size] ); 
	}
	
	public int getSize() {
		return countersOnBoard.length;
	}

	public BoardTile[][] getTiles() {
		return tiles;
	}

	@Deprecated
	public ArrayList<Counter> getWhiteCounters() {
		return whiteCounters;
	}

	@Deprecated
	public ArrayList<Counter> getBlackCounters() {
		return blackCounters;
	}

	  public Counter[][] getArray() { 
		    return array; 
		  } 
	
	@Override
	public void describe(OutputStream out) throws IOException {
		out.write(this.toString().getBytes()) ;  
	}

	@Override
	public String toString() {
		return "Board [size=" + size + ", tiles=" + Arrays.toString(tiles) + ", whiteCounters=" + whiteCounters
				+ ", blackCounters=" + blackCounters + "]";
	}

	
	  public boolean isOccupied(int x, int y) { 
		    if(this.array[x][y].equals(null)){ 
		      return false; 
		    }else{ 
		      return true; 
		    } 
}
 