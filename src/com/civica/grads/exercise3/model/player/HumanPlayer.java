package com.civica.grads.exercise3.model.player;

import com.civica.grads.exercise3.enums.PlayerType;

public class HumanPlayer extends Player {

	public HumanPlayer(String name) {
		super(name);
		type = PlayerType.HUMAN ; 
	}
	

}
