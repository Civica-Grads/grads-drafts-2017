package com.civica.grads.exercise3.model.draughts;

import java.io.IOException;
import java.io.OutputStream;

import com.civica.grads.exercise3.interfaces.Describable;
import com.civica.grads.exercise3.model.player.Player;


/**
 * 
 * @author Team.Rose
 * 
 * Need to distinguish between turn and move, turn = Move[] 
 * 
 *
 */

//TODO: Create new class position and turnRecord + simplify

//TODO : Add information on pieces taken within move, method to do so

//TODO: MoveRecord change 
public class Move implements Describable {
	private  Counter counter;
	private Player player;

	
	public MoveRecord(Position positionStart, Position positionFinish, Colour player, CounterType counterType, )
	
	
	public Move(Counter counter, Player player, int[] starting, int[] afterMove) {
		
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
