package com.civica.grads.boardgames.model;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

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
	
	
	
}
