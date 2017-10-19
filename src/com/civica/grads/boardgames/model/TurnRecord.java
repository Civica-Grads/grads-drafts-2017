package com.civica.grads.boardgames.model;

import java.util.ArrayList;

/**
 * 
 * @author team-mattdamon
 *
 */

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
	}
	
	public ArrayList<MoveRecord> getMoveRecordArrayList() {
		
		return moveRecords;
	}
	
}
