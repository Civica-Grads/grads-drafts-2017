package com.civica.grads.exercise3.model.player;

import com.civica.grads.exercise3.enums.Difficulty;
import com.civica.grads.exercise3.enums.PlayerType;
import com.civica.grads.exercise3.model.draughts.Board;
import com.civica.grads.exercise3.model.draughts.Move;

public class AIPlayer extends Player {
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
	public Move evaluate(Board board) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
