package com.civica.grads.exercise3.model.player;

import com.civica.grads.exercise3.enums.PlayerType;
import com.civica.grads.exercise3.model.draughts.Board;
import com.civica.grads.exercise3.model.draughts.Move;

public class HumanPlayer extends Player {

	public HumanPlayer(String name) {
		super(name);
		type = PlayerType.HUMAN ; 
	}

	@Override
	public Move evaluate(Board board) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
