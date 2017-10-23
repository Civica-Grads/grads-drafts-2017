package com.civica.grads.boardgames.model;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

import com.civica.grads.boardgames.interfaces.Describable;
import com.civica.grads.boardgames.interfaces.Move;


public class Board implements Describable {

	//* An array which represents the board; if null then there is nothing on a square ;
	private final Piece[][] piecesOnBoard ; 
	
	
	public Board(Piece[][] countersOnBoard) {
		 this.piecesOnBoard = countersOnBoard;
	}
	
	public Board(int size) {
		this( new Piece[size][size] ); 
	}

		
	
	public int getSize() {
		return piecesOnBoard.length;
	}



	public Piece[][] getBoard() { 		    
		return piecesOnBoard; 
	}

	
	@Override
	public void describe(OutputStream out) throws IOException {
		out.write(this.toString().getBytes()) ;  
	}


	
	@Override
	public String toString() {
		return "Board [countersOnBoard=" + Arrays.toString(piecesOnBoard) + "]";
	}
	

	public boolean isOccupied(int x, int y) { 
		if(this.piecesOnBoard[x][y].equals(null)){ 
			return false; 
		}else{ 
			return true; 
		} 
	}
	
	@Deprecated
	public ArrayList<Piece> getWhiteCounters() {
		return null;
	}
	
	@Deprecated
	public ArrayList<Piece> getBlackCounters() {
		return null;
	}
}
 