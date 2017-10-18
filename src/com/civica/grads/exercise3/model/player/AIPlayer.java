package com.civica.grads.exercise3.model.player;

import com.civica.grads.exercise3.enums.PlayerType;

public class AIPlayer extends Player {
	private int difficulty ; 
	
	public AIPlayer(String name, int difficulty) {
		// Allow us to decide the AI name - could remove this feature?
		super(name) ; 
		this.difficulty = difficulty ; 
		type = PlayerType.AI ; 
	}

	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	
	
	
}
