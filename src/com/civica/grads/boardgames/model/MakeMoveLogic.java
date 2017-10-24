package com.civica.grads.boardgames.model;

import com.civica.grads.boardgames.exceptions.MoveException;

public abstract class MakeMoveLogic {

	public MakeMoveLogic() {
		// TODO Auto-generated constructor stub
	}

	
	public abstract void checkForValidMove() throws MoveException;
	public abstract boolean checkIfCounterTaken();
	public abstract boolean checkIfCounterTypeNeedChanging();
	public abstract MoveRecord createMoveRecord();
	
}
