package com.civica.grads.boardgames.model.draughts;

import com.civica.grads.boardgames.enums.Colour;
import com.civica.grads.boardgames.enums.CounterType;
import com.civica.grads.boardgames.exceptions.MoveException;
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
	
	
	public MakeMoveLogicDraughts(Board board, Position current, Position newPosition) {
		this.board = board;
		this.current= current;
		this.newPosition = newPosition;
		this.boardSize = board.getSize();
		this.newPositionX = newPosition.getX();
		this.newPositionY = newPosition.getY();
		
	}

	@Override
	public void checkForValidMove() throws MoveException {
		
		
	}

	@Override
	public void checkIfCounterTaken() {
		// TODO Auto-generated method stub
		int xDelta = Math.abs(current.getX() - newPosition.getX());
		int yDelta = Math.abs(current.getY() - newPosition.getY());
		
		if(xDelta == 1 && yDelta == 1) {
			//TODO: set counter taken to false
		} else {
			//TODO: set counter taken to true
		}
		
	}

	@Override
	/**
	 * Sets counter type to KING if it reached the opposite end of the board
	 * returns whether change occurred or not
	 */
	public boolean checkIfCounterTypeNeedChanging() {
		boolean occurred = false;
		Counter counter = (Counter) board.getPiece(newPosition);
		int row = newPosition.getX();
			
		if (counter.getType() != CounterType.KING){
			// whites start on top, blacks on bottom
			if ((counter.getColour() == Colour.WHITE) && (row == ( boardSize - 1))){
				counter.setType(CounterType.KING);
				occurred = true;
			}
			if ((counter.getColour() == Colour.BLACK) && (row == 0)){
				counter.setType(CounterType.KING);
				occurred = true;
			}
		}
		return occurred;
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
