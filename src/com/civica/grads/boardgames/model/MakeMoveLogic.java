package com.civica.grads.boardgames.model;

import com.civica.grads.boardgames.exceptions.GameException;
import com.civica.grads.boardgames.exceptions.MoveException;

public interface MakeMoveLogic {


	public void checkForValidMove() throws MoveException, GameException;
	public boolean checkIfCounterTaken();
	public boolean checkIfCounterTypeNeedChanging();
	public MoveRecord createMoveRecord();
	
}
