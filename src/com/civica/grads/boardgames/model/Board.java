package com.civica.grads.boardgames.model;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

import com.civica.grads.boardgames.exceptions.GameException;
import com.civica.grads.boardgames.exceptions.NoPieceException;
import com.civica.grads.boardgames.exceptions.OnToPieceException;
import com.civica.grads.boardgames.interfaces.Describable;
import com.civica.grads.boardgames.interfaces.Move;


public class Board implements Describable {

	//* An array which represents the board; if null then there is nothing on a square ;
	private final Piece[][] piecesOnBoard ; 
	
	
	public Board(Piece[][] piecesOnBoard) {
		 this.piecesOnBoard = piecesOnBoard;
	}
	
	public Board(int size) {
		this( new Piece[size][size] ); 
	}

		
	
	public int getSize() {
		return piecesOnBoard.length;
	}

	public void placePiece(Piece piece, Position position) throws GameException
	{
		if ( isOccupied(position) ){
			throw new OnToPieceException("Invalid move! There's a piece on " + position.getX() + " " + position.getY() +" already!");
			
		}
		this.piecesOnBoard[position.getX()][position.getY()] = piece ;
	}
	
	public Piece getAndRemovePiece(Position position) throws GameException {
		
		if ( !isOccupied(position) ) {
			throw new NoPieceException("Invalid move! There's no piece on " + position.getX() + " " + position.getY() + "!");
		}
		
		Piece removedPiece = this.piecesOnBoard[position.getX()][position.getY()] ; 
		
		this.piecesOnBoard[position.getX()][position.getY()] = null ; 
		
		return removedPiece ; 
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
		return "Board [countersOnBoard = " + Arrays.toString(piecesOnBoard) + "]";
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
		return !(piecesOnBoard[position.getX()][position.getY()]== null);
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
 