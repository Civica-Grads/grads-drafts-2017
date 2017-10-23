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

	public void placePiece(Piece piece, Position position)
	{
		if ( isOccupied(position) )
		{
			// FIXME
		}
		this.piecesOnBoard[position.getX()][position.getY()] = piece ;
	}
	

	public Piece getPiece(Position position)
	{
		return this.piecesOnBoard[position.getX()][position.getY()];
	}

	/**
	 * @deprecated Use {@link #placePiece(Piece, Position)} and {@link #getPiece(Position)}
	 */
	@Deprecated
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
	
	/**
	 * @deprecated Use {@link #isOccupied(Position)}
	 */
	public boolean isOccupied(int x, int y) { 
		if(this.piecesOnBoard[x][y].equals(null)){ 
			return false; 
		}else{ 
			return true; 
		} 
	}

	public boolean isOccupied(Position position) {
		// FIXME Auto-generated method stub
		return false;
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
 