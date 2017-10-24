package com.civica.grads.boardgames.model;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.civica.grads.boardgames.enums.Colour;
import com.civica.grads.boardgames.enums.CounterType;
import com.civica.grads.boardgames.exceptions.MoveException;
import com.civica.grads.boardgames.model.draughts.MakeMoveLogicDraughts;

public class MakeMoveLogicDraughtsTest {

	@Test (expected = MoveException.class)
	public void CheckFoInvalidMoveOutsideOfBoardonCheckValidMoveTest() throws MoveException {
		
		
		//with 
		Board mockBoard = mock(Board.class);
		when(mockBoard.getSize()).thenReturn(10);
		
		// AND
		Position startPos = mock(Position.class);
		when(startPos.getX()).thenReturn(0);
		when(startPos.getY()).thenReturn(0);
		
		//AND 
		Position newPos = mock(Position.class);
		when(newPos.getX()).thenReturn(-1);
		when(newPos.getY()).thenReturn(0);
		
		MakeMoveLogicDraughts toTest = new MakeMoveLogicDraughts(mockBoard , startPos, newPos);
		
		toTest.checkForValidMove();

	}
	
	@Test (expected = MoveException.class)
	public void CheckFoInvalidMovedBy3onXand3onYCoordinateonCheckValidMoveTest() throws MoveException {
		
		
		//with 
		Board mockBoard = mock(Board.class);
		when(mockBoard.getSize()).thenReturn(10);
		
		// AND
		Position startPos = mock(Position.class);
		when(startPos.getX()).thenReturn(3);
		when(startPos.getY()).thenReturn(1);
		
		//AND 
		Position newPos = mock(Position.class);
		when(newPos.getX()).thenReturn(6);
		when(newPos.getY()).thenReturn(4);
		
		MakeMoveLogicDraughts toTest = new MakeMoveLogicDraughts(mockBoard , startPos, newPos);
		
		toTest.checkForValidMove();

	}
	
	@Test (expected = MoveException.class)
	public void CheckForInvalidisNonDiagnalMoveonCheckValidMoveTest() throws MoveException {
		
		
		//with 
		Board mockBoard = mock(Board.class);
		when(mockBoard.getSize()).thenReturn(10);
		
		// AND
		Position startPos = mock(Position.class);
		when(startPos.getX()).thenReturn(3);
		when(startPos.getY()).thenReturn(1);
		
		//AND 
		Position newPos = mock(Position.class);
		when(newPos.getX()).thenReturn(2);
		when(newPos.getY()).thenReturn(1);
		
		MakeMoveLogicDraughts toTest = new MakeMoveLogicDraughts(mockBoard , startPos, newPos);
		
		toTest.checkForValidMove();

	}

	
	@Test (expected = MoveException.class)
	public void CheckForInvalidisNonDiagnalMoveonCheckValidMoveTest2() throws MoveException {
		
		
		//with 
		Board mockBoard = mock(Board.class);
		when(mockBoard.getSize()).thenReturn(10);
		
		// AND
		Position startPos = mock(Position.class);
		when(startPos.getX()).thenReturn(9);
		when(startPos.getY()).thenReturn(1);
		
		//AND 
		Position newPos = mock(Position.class);
		when(newPos.getX()).thenReturn(2);
		when(newPos.getY()).thenReturn(1);
		
		MakeMoveLogicDraughts toTest = new MakeMoveLogicDraughts(mockBoard , startPos, newPos);
		
		toTest.checkForValidMove();

	}
	@Test (expected = MoveException.class)
	public void CheckForInvalidMoveDiagnolonCheckValidMoveTest() throws MoveException {
		
		
		//with 
		Board mockBoard = mock(Board.class);
		when(mockBoard.getSize()).thenReturn(10);
		
		// AND
		Position startPos = mock(Position.class);
		when(startPos.getX()).thenReturn(3);
		when(startPos.getY()).thenReturn(1);
		
		//AND 
		Position newPos = mock(Position.class);
		when(newPos.getX()).thenReturn(6);
		when(newPos.getY()).thenReturn(4);
		
		MakeMoveLogicDraughts toTest = new MakeMoveLogicDraughts(mockBoard , startPos, newPos);
		
		toTest.checkForValidMove();

	}
	
	@Test (expected = MoveException.class)
	public void CheckIllegalMoveUpofCheckValidMoveOnCheckValidMoveTest() throws MoveException {
		
		
		//with 
		Board mockBoard = mock(Board.class);
		when(mockBoard.getSize()).thenReturn(10);
		
		// AND
		Position startPos = mock(Position.class);
		when(startPos.getX()).thenReturn(4);
		when(startPos.getY()).thenReturn(1);
		
		//AND 
		Position newPos = mock(Position.class);
		when(newPos.getX()).thenReturn(4);
		when(newPos.getY()).thenReturn(2);
		
		MakeMoveLogicDraughts toTest = new MakeMoveLogicDraughts(mockBoard , startPos, newPos);
		
		toTest.checkForValidMove();

	}
	
	@Test (expected = MoveException.class)
	public void validMoveUpRightCheckIsValidMoveTest() throws MoveException {
		
		
		//with 
		Board mockBoard = mock(Board.class);
		when(mockBoard.getSize()).thenReturn(10);
		
		// AND
		Position startPos = mock(Position.class);
		when(startPos.getX()).thenReturn(4);
		when(startPos.getY()).thenReturn(1);
		
		
		
		//AND 
		Position newPos = mock(Position.class);
		when(newPos.getX()).thenReturn(5);
		when(newPos.getY()).thenReturn(0);
		
		MakeMoveLogicDraughts toTest = new MakeMoveLogicDraughts(mockBoard , startPos, newPos);
		
		toTest.checkForValidMove();

	}
	
	@Test (expected = MoveException.class)
	public void validMoveUpLeftCheckIsValidMoveTest() throws MoveException {
		
		
		//with 
		Board mockBoard = mock(Board.class);
		when(mockBoard.getSize()).thenReturn(10);
		
		// AND
		Position startPos = mock(Position.class);
		when(startPos.getX()).thenReturn(4);
		when(startPos.getY()).thenReturn(1);
		
		
		
		//AND 
		Position newPos = mock(Position.class);
		when(newPos.getX()).thenReturn(3);
		when(newPos.getY()).thenReturn(0);
		
		MakeMoveLogicDraughts toTest = new MakeMoveLogicDraughts(mockBoard , startPos, newPos);
		
		toTest.checkForValidMove();
		

	}
	
	@Test (expected = MoveException.class)
	public void validMoveDownLeftCheckIsValidMoveTest() throws MoveException {
		
		
		//with 
		Board mockBoard = mock(Board.class);
		when(mockBoard.getSize()).thenReturn(10);
		
		// AND
		Position startPos = mock(Position.class);
		when(startPos.getX()).thenReturn(4);
		when(startPos.getY()).thenReturn(1);
		
		
		
		//AND 
		Position newPos = mock(Position.class);
		when(newPos.getX()).thenReturn(3);
		when(newPos.getY()).thenReturn(2);
		
		MakeMoveLogicDraughts toTest = new MakeMoveLogicDraughts(mockBoard , startPos, newPos);
		
		toTest.checkForValidMove();
		

	}
	
	@Test (expected = MoveException.class)
	public void validMoveDownRightCheckIsValidMoveTest() throws MoveException {
		
		
		//with 
		Board mockBoard = mock(Board.class);
		when(mockBoard.getSize()).thenReturn(10);
		
		// AND
		Position startPos = mock(Position.class);
		when(startPos.getX()).thenReturn(4);
		when(startPos.getY()).thenReturn(1);
		
		
		
		//AND 
		Position newPos = mock(Position.class);
		when(newPos.getX()).thenReturn(5);
		when(newPos.getY()).thenReturn(2);
		
		MakeMoveLogicDraughts toTest = new MakeMoveLogicDraughts(mockBoard , startPos, newPos);
		
		toTest.checkForValidMove();

	}
	
	
	
	@Test
	public void checkIfcounterTakenValidTest(){
		//with 
		Board mockBoard = mock(Board.class);
		when(mockBoard.getSize()).thenReturn(10);

		// AND
		Position startPos = mock(Position.class);
		when(startPos.getX()).thenReturn(4);
		when(startPos.getY()).thenReturn(1);

		//AND 
		Position newPos = mock(Position.class);
		when(newPos.getX()).thenReturn(5);
		when(newPos.getY()).thenReturn(2);
		
		MakeMoveLogicDraughts toTest = new MakeMoveLogicDraughts(mockBoard , startPos, newPos);
		
		boolean actual = toTest.checkIfCounterTaken();
		boolean expected = true;
		
		assertEquals(actual, expected);
		
	}
	
	@Test
	public void checkIfcounterTakenInvalidTest(){
		
		//with 
		Board mockBoard = mock(Board.class);
		when(mockBoard.getSize()).thenReturn(10);

		// AND
		Position startPos = mock(Position.class);
		when(startPos.getX()).thenReturn(4);
		when(startPos.getY()).thenReturn(1);

		//AND 
		Position newPos = mock(Position.class);
		when(newPos.getX()).thenReturn(5);
		when(newPos.getY()).thenReturn(6);

		MakeMoveLogicDraughts toTest = new MakeMoveLogicDraughts(mockBoard , startPos, newPos);

		boolean actual = toTest.checkIfCounterTaken();
		boolean expected = false;

		assertEquals(actual, expected);
	}
	
	
	@Test
	public void checkcheckIfCounterTypeNeedChangingMethodWhenCounterNeedsChangingTest(){
		
		//with 
				Board mockBoard = mock(Board.class);
				when(mockBoard.getSize()).thenReturn(10);

				// AND
				Position startPos = mock(Position.class);
				when(startPos.getX()).thenReturn(4);
				when(startPos.getY()).thenReturn(1);

				//AND 
				Position newPos = mock(Position.class);
				when(newPos.getX()).thenReturn(6);
				when(newPos.getY()).thenReturn(3);

				MakeMoveLogicDraughts toTest = new MakeMoveLogicDraughts(mockBoard , startPos, newPos);

				boolean actual = toTest.checkIfCounterTypeNeedChanging();
				boolean expected = true;

				assertEquals(actual, expected);
		
	}
	
	@Test
	public void checkcheckIfCounterTypeNeedChangingMethodWhenCounterDoesNotNeedChangingTest(){
		//with 
		Board mockBoard = mock(Board.class);
		when(mockBoard.getSize()).thenReturn(10);

		// AND
		Position startPos = mock(Position.class);
		when(startPos.getX()).thenReturn(4);
		when(startPos.getY()).thenReturn(1);

		//AND 
		Position newPos = mock(Position.class);
		when(newPos.getX()).thenReturn(5);
		when(newPos.getY()).thenReturn(2);

		MakeMoveLogicDraughts toTest = new MakeMoveLogicDraughts(mockBoard , startPos, newPos);

		boolean actual = toTest.checkIfCounterTypeNeedChanging();
		boolean expected = false;

		assertEquals(actual, expected);
	}
	
	
	
	@Test
	public void checkcheckIfCounterTypeNeedChangingMethodWhenCounterMovceISWrongTest(){
		//with 
		Board mockBoard = mock(Board.class);
		when(mockBoard.getSize()).thenReturn(10);

		// AND
		Position startPos = mock(Position.class);
		when(startPos.getX()).thenReturn(4);
		when(startPos.getY()).thenReturn(1);

		//AND 
		Position newPos = mock(Position.class);
		when(newPos.getX()).thenReturn(9);
		when(newPos.getY()).thenReturn(1);

		MakeMoveLogicDraughts toTest = new MakeMoveLogicDraughts(mockBoard , startPos, newPos);

		boolean actual = toTest.checkIfCounterTypeNeedChanging();
		boolean expected = false;

		assertEquals(actual, expected);
	}
	
	
	@Test
	public void createMoveRecordtest(){
		//with 
		Board mockBoard = mock(Board.class);
		when(mockBoard.getSize()).thenReturn(10);
		
		Piece a = mock(Piece.class);

		// AND
		Position startPos = mock(Position.class);
		when(startPos.getX()).thenReturn(4);
		when(startPos.getY()).thenReturn(1);

		//AND 
		Position newPos = mock(Position.class);
		when(newPos.getX()).thenReturn(5);
		when(newPos.getY()).thenReturn(2);

		//WHEN


		MakeMoveLogicDraughts toTest = new MakeMoveLogicDraughts(mockBoard , startPos, newPos);

		when(mockBoard.getPiece(newPos)).thenReturn(a);
		when(a.getColour()).thenReturn(Colour.BLACK);
				
				
		MoveRecord expected = new MoveRecord(newPos, startPos, Colour.BLACK, CounterType.NORMAL, false);

		assertEquals(expected, toTest.createMoveRecord());
	}

	
	
}
