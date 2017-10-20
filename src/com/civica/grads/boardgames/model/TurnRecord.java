package com.civica.grads.boardgames.model;

import java.util.ArrayList;

/**
 * TurnRecord class that holds an ArrayList of MoveRecord objects
 * 
 * @author team-mattdamon, david getter
 * 
 */

//TODO : Add information on pieces taken within move, method to do so 
//FIXME Which board does this belong to if any?
public class TurnRecord {
	
	private ArrayList<MoveRecord> moveRecords;
	private int countersTakenThisTurn;
	
	public TurnRecord() {
		
		moveRecords = new ArrayList<>();
		countersTakenThisTurn = 0;
	}

	public int getCountersTakenThisTurn() {
		
		return countersTakenThisTurn;
	}

	public void setCountersTakenThisTurn(int countersTakenThisTurn) {
		
		this.countersTakenThisTurn = countersTakenThisTurn;
	}
	
	public void addMoveRecord(MoveRecord moveRecord) {
		
		moveRecords.add(moveRecord);
		
		// if counter taken then increment countersTakenThisTurn
		if(moveRecord.isCounterTaken()) {
			countersTakenThisTurn++;
		}
	}
	
	public ArrayList<MoveRecord> getMoveRecordArrayList() {
		
		return moveRecords;
	}
	
}
