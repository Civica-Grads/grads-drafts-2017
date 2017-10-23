package com.civica.grads.boardgames.model;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.civica.grads.boardgames.exceptions.IllegalMoveException;
import com.civica.grads.boardgames.interfaces.Move;

public class MakeMoveLogicDraughtsTest {
	
	/**
	 * This is a class to test the validity of the make move logic and to check invalid moves are caught
	 * 
	 * @author Ed Strode-Willis 
	 */
	
	
	/**
	 * This checks whether a normal counter can move forward and left when there is a space there for it to do so. Normal counter at (1,1)
	 * 
	 * @author Ed Strode-Willis
	 * 
	 */
	
	@Test 
	public void checkNormalCountersMovesFrontLeftInAValidWay(){
		//WITH
		//A board with a counter at position (1,1) and nothing at (0,0) or (0,1)
		//Initial
		Counter counter1 = mock(Counter.class);
		
		Position p1= mock(Position.class);
		when(p1.getX()).thenReturn(1);
		when(p1.getY()).thenReturn(1);
		when(counter1.getPosition()).thenReturn(p1);
		
		Position p2=mock(Position.class);
		when(p2.getX()).thenReturn(0);
		when(p2.getY()).thenReturn(0);
		when(counter1.getPosition()).thenReturn(p2);
		
		Move move = mock(Move.class);
		when(move.getPositionStart()).thenReturn(p1);
		when(move.getPositionFinish().thenReturn(p2));
		
	
		//WHEN
		//The counter at (1,1) is asked to move to (0,0)
		
		
		//THEN
		//After the move is applied the counter should be at (0,0) and no longer at (1,1)
	
		
	}
	
	
	/**
	  * Checks that when a counter is moved to the left that an IllegalMoveException is thrown.
	  * 
	  * @author Ryan Cullen
	  */
	 @Test (expected = IllegalMoveException.class) 
	 public void checkInvalidMoveLeftThrowsException() {
		//TESTS MOVING TO THE LEFT
		 
		//WITH
		Position p1 = mock(Position.class);
		when(p1.getX()).thenReturn(1);
		when(p1.getY()).thenReturn(1);
		
		Position p2 = mock(Position.class);
		when(p2.getX()).thenReturn(0);
		when(p2.getY()).thenReturn(1);
		
		
		Move move = mock(Move.class);
		when(move.getPositionStart()).thenReturn(p1);
		when(move.getPositionFinish()).thenReturn(p2);
		
		Board board = new Board(8);//TODO: replace with test data
		
		// WHEN
		board.applyMove(move);
		
		// THEN
		// Should have thrown an exception.
	}

}
