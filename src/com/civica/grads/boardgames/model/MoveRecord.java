package com.civica.grads.boardgames.model;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.civica.grads.boardgames.enums.Colour;
import com.civica.grads.boardgames.enums.CounterType;
import com.civica.grads.boardgames.interfaces.Describable;
import com.civica.grads.boardgames.interfaces.Storable;

/** 
 *  
 * @author Team.Rose 
 *  
 * Need to distinguish between turn and move, turn = Move[]  
 *  
 * 
 */ 
//TODO : Add information on pieces taken within move, method to do so 
// FIXME Who's Move is this ?
// FIXME Which board does this belong to if any?
// FIXME How do I get the next move?
// FIXME Which square is this on?
// FIXME WHich piece is this?
public class MoveRecord implements Describable,Storable {
	
	private final Position positionStart;
	private final Position positionFinish;
	private final Colour player;
	private final CounterType counterType;
	private boolean counterTaken;
	
	

	
	/**
	 * @param positionStart
	 * @param positionFinish
	 * @param player
	 * @param counterType
	 */
	public MoveRecord(Position positionStart, Position positionFinish, Colour player, CounterType counterType, boolean counterTaken) {
		
		this.positionStart = positionStart;
		this.positionFinish = positionFinish;
		this.player = player;
		this.counterType = counterType;
		this.counterTaken = counterTaken;
		
	}
	
	

	public boolean isCounterTaken() {
		return counterTaken;
	}

	


	@Override
	public void describe(OutputStream out) throws IOException {
		out.write(this.toString().getBytes()) ;  
	}



	@Override
	public String toString() {
		return "Move [positionStart=" + positionStart + ", positionFinish=" + positionFinish + ", player=" + player
				+ ", counterType=" + counterType + "]";
	}

	@Override
	public void save(InputStream sourceIs) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void load(OutputStream sourceIs) throws IOException {
		// TODO Auto-generated method stub
		
	}

	
}
