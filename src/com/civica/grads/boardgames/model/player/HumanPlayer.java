package com.civica.grads.boardgames.model.player;

import com.civica.grads.boardgames.enums.PlayerType;
import com.civica.grads.boardgames.model.Board;
import com.civica.grads.boardgames.model.MoveRecord;

public class HumanPlayer extends Player {

	public HumanPlayer(String name) {
		super(name);
		type = PlayerType.HUMAN ; 
	}

	@Override
	public MoveRecord evaluate(Board board) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
