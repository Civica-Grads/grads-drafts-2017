package com.civica.grads.boardgames.model;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

import com.civica.grads.boardgames.exceptions.MoveException;
import com.civica.grads.boardgames.interfaces.Move;
import com.civica.grads.boardgames.model.Board;
import com.civica.grads.boardgames.model.BoardTile;
import com.civica.grads.boardgames.model.Counter;


public class BoardTest {
	
	//FIXME: This test fails
	@Test
	public void toStringOutputExpectedText() {
		
		Board board = new Board(8);
		String expected = "Board [size=8, tiles=[[Lcom.civica.grads.exercise3.model.draughts.BoardTile;@6e5e91e4,"
				+ " [Lcom.civica.grads.exercise3.model.draughts.BoardTile;@2cdf8d8a, "
				+ "[Lcom.civica.grads.exercise3.model.draughts.BoardTile;@30946e09, "
				+ "[Lcom.civica.grads.exercise3.model.draughts.BoardTile;@5cb0d902, "
				+ "[Lcom.civica.grads.exercise3.model.draughts.BoardTile;@46fbb2c1,"
				+ " [Lcom.civica.grads.exercise3.model.draughts.BoardTile;@1698c449,"
				+ " [Lcom.civica.grads.exercise3.model.draughts.BoardTile;@5ef04b5,"
				+ " [Lcom.civica.grads.exercise3.model.draughts.BoardTile;@5f4da5c3],"
				+ " whiteCounters=[], blackCounters=[]]";
		String actual = board.toString();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void getSizeExpectedValue() {
		Board board = new Board(8);
		
		int expected = 8;
		int actual = board.getSize();
		
		assertEquals(expected, actual);
	}
	
	@Test
	@Ignore
	public void getTilesExpectedValue() {
//		Board board = new Board(8);
//		
//		BoardTile[][] expected = new BoardTile[8][8];
//		BoardTile[][] actual = board.getTiles();
//		
//		
//		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void getWhiteCountersExpectedValue() {
		Board board = new Board(8);
		
		ArrayList<Counter> expected = new ArrayList<>();
		ArrayList<Counter> actual = board.getWhiteCounters();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void getBlackCountersExpectedValue() {
		Board board = new Board(8);
		
		ArrayList<Counter> expected = new ArrayList<>();
		ArrayList<Counter> actual = board.getBlackCounters();
		
		assertEquals(expected, actual);
	}
	
	 @Test (expected = MoveException.class) 
	 public void invalidHorizontalMoveDenied() {
		
		//WITH
		Position p1 = mock(Position.class);
		when(p1.getX()).thenReturn(0);
		when(p1.getY()).thenReturn(0);
		
		Position p2 = mock(Position.class);
		when(p2.getX()).thenReturn(0);
		when(p2.getY()).thenReturn(0);
		
		
		Move move = mock(Move.class);
		when(move.getPositionStart()).thenReturn(p1);
		when(move.getPositionFinish()).thenReturn(p2);
		
		Board board = new Board(8);//TODO: replace with test data
		
		// WHEN
		board.applyMove(move);
		
		// THEN
		// Should have thrown an exception.
	}
	
	@Test
	public void validMoveAllowed() {
		
		// WITH
		Board board = new Board(8);
		
		Position p1 = mock(Position.class);
		when(p1.getX()).thenReturn(0);
		when(p1.getY()).thenReturn(0);
		
		Position p2 = mock(Position.class);
		when(p2.getX()).thenReturn(1);
		when(p2.getY()).thenReturn(1);
		
		Move move = mock(Move.class);
		when(move.getPositionStart()).thenReturn(p1);
		when(move.getPositionFinish()).thenReturn(p2);
		
		
		// WHEN
		
		// THEN
		
		/* TODO: finish test
		
		// if move is valid
		if() {
			board.applyMove(move);
		}
		
		Position expected;
				
		Position actual;
		
		assertEquals(expected, actual);
		
		*
		 *  if(move is valid) {
		 *  	do move
		 *  }
		 *  
		 *  expected = counter is at final position
		 *  
		 *  actual = where is counter
		 *  
		 *  assertEquals(expected, actual)
		 *
		*/
		
	}

}
