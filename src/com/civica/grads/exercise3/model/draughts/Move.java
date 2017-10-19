package com.civica.grads.exercise3.model.draughts;

import java.io.IOException;
import java.io.OutputStream;

import com.civica.grads.exercise3.interfaces.Describable;
import com.civica.grads.exercise3.model.player.Player;

public class Move implements Describable {
	private  Counter counter;
	private Player player;
	private int[] starting;
	private int[] afterMove;
	
	
	public Move(Counter counter, Player player, int[] starting, int[] afterMove) {
		
		this.player= player;
		this.counter= counter;
		this.starting= starting;
		this.afterMove= afterMove;						
		
	}
	
	
	public Counter getCounter() {
		return counter;
	}


	public Player getPlayer() {
		return player;
	}


	public int[] getStarting() {
		return starting;
	}


	public int[] getAfterMove() {
		return afterMove;
	}



	@Override
	public void describe(OutputStream out) throws IOException {
		out.write(this.toString().getBytes()) ;  
	}

	@Override
	public String toString() {
		return "Move []";
	}

	
}
