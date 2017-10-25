package com.civica.grads.boardgames.model;

import com.civica.grads.boardgames.exceptions.MoveException;

public interface MakeMoveLogic {


	public void checkForValidMove() throws MoveException;
	public boolean checkIfCounterTaken();
	public boolean checkIfCounterTypeNeedChanging();
	public MoveRecord createMoveRecord();
	
}
