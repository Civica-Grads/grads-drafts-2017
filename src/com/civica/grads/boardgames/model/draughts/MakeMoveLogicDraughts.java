package com.civica.grads.boardgames.model.draughts;

import com.civica.grads.boardgames.enums.Colour;
import com.civica.grads.boardgames.enums.CounterType;
import com.civica.grads.boardgames.exceptions.IllegalMoveException;
import com.civica.grads.boardgames.exceptions.MoveException;
import com.civica.grads.boardgames.exceptions.NoPieceException;
import com.civica.grads.boardgames.exceptions.OffBoardException;
import com.civica.grads.boardgames.exceptions.OnToPieceException;
import com.civica.grads.boardgames.model.Board;
import com.civica.grads.boardgames.model.Counter;
import com.civica.grads.boardgames.model.MakeMoveLogic;
import com.civica.grads.boardgames.model.Position;

public class MakeMoveLogicDraughts extends MakeMoveLogic {

	private Board board ;
	private Position current;
	private Position newPosition;
	private int boardSize; 
	private int newPositionX;
	private int newPositionY;
	private int currentX;
	private int currentY;
	
	
	public MakeMoveLogicDraughts(Board board, Position current, Position newPosition) {
		this.board = board;
		this.current= current;
		this.newPosition = newPosition;
		this.boardSize = board.getSize();
		this.newPositionX = newPosition.getX();
		this.newPositionY = newPosition.getY();
		this.currentX = current.getX();
		this.currentY = current.getY();
		
	}

	@Override
	public void checkForValidMove() throws MoveException {
		
		//Variables for multiple use by the validity checks.
		Counter startPiece = (Counter) board.getPiece(current);
		Counter newPositionPiece = (Counter) board.getPiece(newPosition);
		Counter middlePiece = (Counter) board.getPiece(new Position(
				(currentX+newPositionX)/2, (currentY+newPositionY)/2));
		
		CounterType startType = startPiece.getType();
		Colour startColour = startPiece.getColour();
		
		//If start piece doesn't exist, throw exception.
		if (startPiece.equals(null)) {
			throw new NoPieceException("NoPieceException: Start position does not contain a Counter.");
		//If end piece contains a counter, throw exception.
		} else if (!newPositionPiece.equals(null)) {
			throw new OnToPieceException("NoPieceException: End position already contains a Counter.");
		//If start position is not on the board, throw exception.
		} else if (currentX > board.getSize()-1
				|| currentX < 0
				|| currentY > board.getSize()-1
				|| currentY < 0) {
			throw new OffBoardException("OffBoardException: Start position is not on the board.");
		//If end position is not on the board, throw exception.
		} else if (newPositionX > board.getSize()-1
				|| newPositionX < 0
				|| newPositionY > board.getSize()-1
				|| newPositionY < 0) {
			throw new OffBoardException("OffBoardException: End position is not on the board.");
				}
		
		/* Checks if the move is valid for a normal counter, if not it throws an exception.
		   Checks that normal can only move forward, and if it moves by 2 it takes a piece.*/
		if (startType.equals(CounterType.NORMAL)) {
			if (Math.abs(newPositionX - currentX) == 1 
					&& newPositionY - currentY == 1) { //valid
				//Move is going forward by one so is valid, carry on.
			} else if ((Math.abs(newPositionX - currentX) == 2) 
					&& (newPositionY - currentY == 2)
					&& !middlePiece.getColour().equals(startColour)) {
				//Move is moving by two and taking an opponent's piece, valid so carry on.
			} else {
				throw new IllegalMoveException("IllegalMoveException: Move was not performed "
						+ "in a valid direction or number of spaces.");
			}
			
			//King can move forward and backwards, so Y value can be negative or positive.
		} else if (startType.equals(CounterType.KING)) {
			if (Math.abs(newPositionX - currentX) == 1 
					&& Math.abs(newPositionY - currentY) == 1) { //valid
				//Move is going forward/backward by one so is valid, carry on.
			} else if ((Math.abs(newPositionX - currentX) == 2) 
					&& (Math.abs(newPositionY - currentY) == 2)
					&& !middlePiece.getColour().equals(startColour)) {
				//Move is moving by two and taking an opponent's piece, valid so carry on.
			} else {
				throw new IllegalMoveException("IllegalMoveException: Move was not performed "
						+ "in a valid direction or number of spaces.");
			}
		}
	}

	@Override
	public boolean checkIfCounterTaken() {
		// TODO Auto-generated method stub
		int xDelta = Math.abs(current.getX() - newPosition.getX());
		int yDelta = Math.abs(current.getY() - newPosition.getY());
		
		if(xDelta == 1 && yDelta == 1) {
			return false;
		} else {
			return true;
		}
		
	}

	@Override
	public void checkIfCounterTypeNeedChanging() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createMoveRecord() {
		// TODO Auto-generated method stub
		
	}

	
	public boolean outSideBoard(){
		if(this.newPosition.getX() > boardSize || this.newPosition.getX()<= -1){
			return false;
		}else if(this.newPosition.getY() > boardSize || this.newPosition.getY()<= -1){
			return false;
		}else{
			return true;
		}
	}
	
	
			
	
}
