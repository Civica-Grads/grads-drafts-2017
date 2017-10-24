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
	
	/**
	 * Constructor with default board size
	 * @param piecesOnBoard 
	 */
	public Board(Piece[][] piecesOnBoard) {
		 this.piecesOnBoard = piecesOnBoard;
	}
	
	/**
	 * Constructor allowing custom board size
	 * @param size Board size
	 */
	public Board(int size) {
		this( new Piece[size][size] ); 
	}

		
	/**
	 * Checks board size
	 * @return Number of tiles on a board
	 */
	public int getSize() {
		return piecesOnBoard.length;
	}

	/**
	 * Takes a piece and puts it onto a tile on a board
	 * @param piece Piece to be placed
	 * @param position New position of a piece
	 * @throws GameException Exception thrown when piece cannot be placed on a given position
	 */
	public void placePiece(Piece piece, Position position) throws GameException
	{
		if ( isOccupied(position) ){
			throw new OnToPieceException("Invalid move! There's a piece on " + position.getX() +" "+ position.getY() +" already!");
			
		}
		this.piecesOnBoard[position.getX()][position.getY()] = piece ;
	}
	
	/**
	 * Retrieves a piece from a given position, removes it from that position and returns the piece
	 * @param position Tile on a board
	 * @return Piece on that position
	 * @throws GameException Exception thrown when given tile does not hold a piece
	 */
	public Piece getAndRemovePiece(Position position) throws GameException {
		
		if ( !isOccupied(position) ) {
			throw new NoPieceException("Invalid move! There's no piece on " + position.getX() +" "+ position.getY() + "!");
		}
		
		Piece removedPiece = this.piecesOnBoard[position.getX()][position.getY()] ; 
		
		this.piecesOnBoard[position.getX()][position.getY()] = null ; 
		
		return removedPiece ; 
	}
	
	/**
	 * Queries a tile to find a piece
	 * @param position Tile queried
	 * @return Piece object if found, null otherwise
	 */
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
	/**
	 * Outputs object properties to an OutputStream
	 * @param out OutputStream
	 */
	public void describe(OutputStream out) throws IOException {
		out.write(this.toString().getBytes()) ;  
	}


	
	@Override
	/**
	 * @return Returns object properties in a String
	 */
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

	/**
	 * Checks if a given tile is being occupied by a piece
	 * @param position Tile to be checked
	 * @return true if given tile holds a piece; false otherwise
	 */
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
 