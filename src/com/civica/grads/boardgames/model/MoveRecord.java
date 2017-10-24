package com.civica.grads.boardgames.model;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.civica.grads.boardgames.enums.Colour;
import com.civica.grads.boardgames.enums.CounterType;
import com.civica.grads.boardgames.interfaces.Describable;
import com.civica.grads.boardgames.interfaces.Move;
import com.civica.grads.boardgames.interfaces.Storable;

/** 
 *  
 * @author Team.Rose 
 *  
 * Need to distinguish between turn and move, turn = Move[]  
 *  
 * 
 */ 




public class MoveRecord implements Describable,Storable, Move {
	
	private final Position positionStart;
	private final Position positionFinish;
	private final Colour player;
	private final CounterType counterType;
	private boolean counterTaken;
	private static int totalMoveRecords;
	private int moveRecordID;

	
	

	
	/* (non-Javadoc)
	 * @see com.civica.grads.boardgames.model.Move#getPositionStart()
	 */
	@Override
	public final Position getPositionStart() {
		return positionStart;
	}



	/* (non-Javadoc)
	 * @see com.civica.grads.boardgames.model.Move#getPositionFinish()
	 */
	@Override
	public final Position getPositionFinish() {
		return positionFinish;
	}



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
		moveRecordID = totalMoveRecords++;
	
		
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






	public static int getTotalMoveRecords() {
		return totalMoveRecords;
	}






	public int getMoveRecordID() {
		return moveRecordID;
	}





	
}
