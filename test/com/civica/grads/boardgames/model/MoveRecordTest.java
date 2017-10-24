package com.civica.grads.boardgames.model;

import static org.junit.Assert.*;

import org.junit.Test;

import com.civica.grads.boardgames.enums.Colour;
import com.civica.grads.boardgames.enums.CounterType;
import com.civica.grads.boardgames.model.MoveRecord;

public class MoveRecordTest {

	@Test
	public void toStringExpectedValue() {
//		MoveRecord move = new MoveRecord();
//		
//		String expected = "Move []";
//		String actual = move.toString();
//		
//		assertEquals(expected, actual);
	}
	
	
	/*
	 * Tests that getPositionStart() returns the correct position object
	 */
	@Test
	public void getPositionStartExpectedReturn() {
	/*
	MoveRecord(Position positionStart,
				Position positionFinish,
				Colour player, 
				counterType, 
				boolean counterTaken);
	*/
	
		// create start and end positions
		Position startPosition = new Position(1, 1);
		Position finishPosition = new Position(1, 1);
	
		// no counter taken during move
		boolean counterTaken = false;
	
		// create a moveRecord
		MoveRecord moveRecord = new MoveRecord(startPosition,
												finishPosition,
												Colour.WHITE,
												CounterType.NORMAL, 
												counterTaken);
	
		assertEquals(startPosition, moveRecord.getPositionStart());
	}
	
	/*
	 * Tests that getPositionFinish() returns the correct position object
	 */
	@Test
	public void getPositionFinishExpectedReturn() {
		
		// create start and end positions
		Position startPosition = new Position(0, 0);
		Position finishPosition = new Position(1, 1);
		
		// no counter taken during turn
		boolean counterTaken = false;
		
		// create a moveRecord
		MoveRecord moveRecord = new MoveRecord(startPosition,
												finishPosition,
												Colour.WHITE,
												CounterType.NORMAL, 
												counterTaken);
		
		assertEquals(finishPosition, moveRecord.getPositionFinish());
	}
	
	/*
	 * Tests that isCounterTaken() returns the correct value
	 */
	@Test
	public void isCounterTakenExpectedReturn() {
		
		// create start and end positions
		Position startPosition = new Position(0, 0);
		Position finishPosition = new Position(1, 1);
				
		// no counter taken during turn
		boolean counterTaken = false;
				
		// create a moveRecord
		MoveRecord moveRecord = new MoveRecord(startPosition,
												finishPosition,
												Colour.WHITE,
												CounterType.NORMAL, 
												counterTaken);
		
		boolean expected = false;
		
		assertEquals(expected, moveRecord.isCounterTaken());
	}
	
	/*
	 * Tests that toString() returns the expected string
	 */
	@Test
	public void toStringExpectedReturn() {
		
		// create start and end positions
		Position startPosition = new Position(0, 0);
		Position finishPosition = new Position(1, 1);
						
		// no counter taken during turn
		boolean counterTaken = false;
						
		// create a moveRecord
		MoveRecord moveRecord = new MoveRecord(startPosition,
												finishPosition,
												Colour.WHITE,
												CounterType.NORMAL, 
												counterTaken);
		
		String expected = "Move [positionStart=" + startPosition +
						", positionFinish=" + finishPosition + 
						", player=" + Colour.WHITE +
						", counterType=" + CounterType.NORMAL + "]";
		
		String actual = moveRecord.toString();
		
		assertEquals(expected, actual);
	}
}
