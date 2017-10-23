package com.civica.grads.boardgames.model;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.civica.grads.boardgames.exceptions.MoveException;
import com.civica.grads.boardgames.model.draughts.MakeMoveLogicDraughts;

public class MakeMoveLogicDraughtsTest {

	@Test (expected = MoveException.class)
	public void CheckFoValidMoveOutsideOfBoardtest() throws MoveException {
		
		
		//with 
		Board mockBoard = mock(Board.class);
		when(mockBoard.getBoard()).thenReturn(new Counter[10][10]);
		
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
	public void CheckFoValidMovedBy3onXand3onYCoordinateTest() throws MoveException {
		
		
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
	public void CheckFoValidisNonDiagnalTest() throws MoveException {
		
		
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
	public void CheckFoValidMoveDiagnolMoveTest() throws MoveException {
		
		
		//with 
		Board mockBoard = mock(Board.class);
		when(mockBoard.getSize()).thenReturn(10);
		
		// AND
		Position startPos = mock(Position.class);
		when(startPos.getX()).thenReturn(3);
		when(startPos.getY()).thenReturn(1);
		
		//AND 
		Position newPos = mock(Position.class);
		when(newPos.getX()).thenReturn(4);
		when(newPos.getY()).thenReturn(2);
		
		MakeMoveLogicDraughts toTest = new MakeMoveLogicDraughts(mockBoard , startPos, newPos);
		
		toTest.checkForValidMove();

	}
}
