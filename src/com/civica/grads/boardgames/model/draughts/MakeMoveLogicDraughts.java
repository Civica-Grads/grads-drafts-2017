package com.civica.grads.boardgames.model.draughts;

import com.civica.grads.boardgames.enums.CounterType;
import com.civica.grads.boardgames.exceptions.MoveException;
import com.civica.grads.boardgames.model.Board;
import com.civica.grads.boardgames.model.MakeMoveLogic;
import com.civica.grads.boardgames.model.MoveRecord;
import com.civica.grads.boardgames.model.Position;

public class MakeMoveLogicDraughts extends MakeMoveLogic {

	private Board board ;
	private Position current;
	private Position newPosition;
	private int boardSize; 
	private int newPositionX;
	private int newPositionY;
	private boolean pieceTaken = false;
	
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
		
		if(xDelta == 2 && yDelta == 2) {
			this.pieceTaken = true;
			//TODO: set counter taken to false
		} else { 
			this.pieceTaken = false;
			//TODO: set counter taken to true
		}
		
	}

	@Override
	public boolean checkIfCounterTypeNeedChanging() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public MoveRecord createMoveRecord() {
		// TODO Auto-generated method stub
		MoveRecord moveRecord = new MoveRecord(current, newPosition, board.getPiece(current).getColour(), board.getPiece(current).getType(), pieceTaken);
		return moveRecord;
		
		
	}

	
	public int getNewPositionX() {
		return newPositionX;
	}


	public int getNewPositionY() {
		return newPositionY;
	}


	public boolean isPieceTaken() {
		return pieceTaken;
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
