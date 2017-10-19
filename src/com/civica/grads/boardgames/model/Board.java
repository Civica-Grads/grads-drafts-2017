package com.civica.grads.boardgames.model;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

import com.civica.grads.boardgames.interfaces.Describable;


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



	public Counter[][] getBoard() { 		    
		return countersOnBoard; 
	}

	
	@Override
	public void describe(OutputStream out) throws IOException {
		out.write(this.toString().getBytes()) ;  
	}


	
	@Override
	public String toString() {
		return "Board [countersOnBoard=" + Arrays.toString(countersOnBoard) + "]";
	}
	

	public boolean isOccupied(int x, int y) { 
		if(this.countersOnBoard[x][y].equals(null)){ 
			return false; 
		}else{ 
			return true; 
		} 
	}
	
	@Deprecated
	public ArrayList<Counter> getWhiteCounters() {
		return null;
	}
	
	@Deprecated
	public ArrayList<Counter> getBlackCounters() {
		return null;
	}
}
 