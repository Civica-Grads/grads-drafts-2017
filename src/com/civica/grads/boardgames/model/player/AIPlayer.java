package com.civica.grads.boardgames.model.player;

import com.civica.grads.boardgames.enums.Difficulty;
import com.civica.grads.boardgames.enums.PlayerType;
import com.civica.grads.boardgames.model.Board;
import com.civica.grads.boardgames.model.MoveRecord;

public abstract class AIPlayer extends Player {
	private Difficulty difficulty ; 
	
	public AIPlayer(String name, Difficulty difficulty) {
		// Allow us to decide the AI name - could remove this feature?
		super(name) ; 
		this.difficulty = difficulty ; 
		type = PlayerType.AI ; 
	}

	public Difficulty getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(Difficulty difficulty) {
		this.difficulty = difficulty;
	}

	@Override
	public MoveRecord evaluate(Board board) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
