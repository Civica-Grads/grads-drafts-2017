package com.civica.grads.boardgames.model.draughts;

import com.civica.grads.boardgames.model.Board;
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
	public void checkForValidMove() {
		
		
	}

	@Override
	public void checkIfCounterTaken() {
		// TODO Auto-generated method stub
		
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
