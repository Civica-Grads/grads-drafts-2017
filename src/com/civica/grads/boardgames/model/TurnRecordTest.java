package com.civica.grads.boardgames.model;

import static org.junit.Assert.*;

import org.junit.Test;

import com.civica.grads.boardgames.enums.Colour;
import com.civica.grads.boardgames.enums.CounterType;

public class TurnRecordTest {

	@Test
	public void testAddMoveRecord() {
		Position positionStart = new Position(1,1);
		Position positionFinish = new Position(2,2);
		MoveRecord expected = new MoveRecord(positionStart, positionFinish, Colour.WHITE, CounterType.NORMAL, false);
		TurnRecord turnRecord = new TurnRecord();
		turnRecord.addMoveRecord(expected);
		MoveRecord actual = turnRecord.getMoveRecordArrayList().get(0);
		// expected = turn record with the move record
		assertEquals(expected, actual);
		
		
	}

}
