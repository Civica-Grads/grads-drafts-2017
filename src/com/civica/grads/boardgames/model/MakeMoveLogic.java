package com.civica.grads.boardgames.model;

public abstract class MakeMoveLogic {

	public MakeMoveLogic() {
		// TODO Auto-generated constructor stub
	}

	
	public abstract void checkForValidMove();
	public abstract void checkIfCounterTaken();
	public abstract void checkIfCounterTypeNeedChanging();
	public abstract void createMoveRecord();
	
	
}
