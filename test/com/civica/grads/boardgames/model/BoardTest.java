package com.civica.grads.boardgames.model;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

import com.civica.grads.boardgames.enums.Colour;
import com.civica.grads.boardgames.enums.CounterType;
import com.civica.grads.boardgames.exceptions.IllegalMoveException;
import com.civica.grads.boardgames.interfaces.Move;
import com.civica.grads.boardgames.enums.PlayerType;
import com.civica.grads.boardgames.model.Board;
import com.civica.grads.boardgames.model.BoardTile;
import com.civica.grads.boardgames.model.Counter;
import com.civica.grads.boardgames.model.draughts.DraughtsGame;
import com.civica.grads.boardgames.model.player.HumanPlayer;
import com.civica.grads.boardgames.model.player.Player;
import com.civica.grads.boardgames.exceptions.*;
import com.civica.grads.boardgames.model.Piece;


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
		
		ArrayList<Piece> expected = new ArrayList<>();
		ArrayList<Piece> actual = board.getWhiteCounters();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void getBlackCountersExpectedValue() {
		Board board = new Board(8);
		
		ArrayList<Piece> expected = new ArrayList<>();
		ArrayList<Piece> actual = board.getBlackCounters();
		
		assertEquals(expected, actual);
	}
	
	@Test(expected=RuntimeException.class) // expecting exception
	public void occupiedSpaceTest() {
		
		// cREATE A POPULATED 2 X 2 BOARD
		// Create a diagonal one space move
		// apply move to board
		//TODO: assess whether counter constructor is correct	
		Board board = new Board (2);
		
	}
	 
	 /**
	  * Checks that when a counter is moved to the right that an IllegalMoveException is thrown.
	  * 
	  * @author Ryan Cullen
	  */
	 @Test (expected = IllegalMoveException.class) 
	 public void checkInvalidMoveRightThrowsException() {
			fail("Broken Test");
			//FIXME Broken Test uncomment this code and it will be revealed.
//		//TESTS MOVING TO THE LEFT
//		 
//		//WITH
//		Position p1 = mock(Position.class);
//		when(p1.getX()).thenReturn(1);
//		when(p1.getY()).thenReturn(1);
//		
//		Position p2 = mock(Position.class);
//		when(p2.getX()).thenReturn(2);
//		when(p2.getY()).thenReturn(1);
//		
//		
//		Move move = mock(Move.class);
//		when(move.getPositionStart()).thenReturn(p1);
//		when(move.getPositionFinish()).thenReturn(p2);
//		
//		Board board = new Board(8);//TODO: replace with test data
//		
//		// WHEN
//		board.applyMove(move);
//		
//		// THEN
//		// Should have thrown an exception.
	}
	 
	 /**
	  * Checks that when a counter is moved up that an IllegalMoveException is thrown.
	  * 
	  * @author Ryan Cullen
	  */
	 @Test (expected = IllegalMoveException.class) 
	 public void checkInvalidMoveUpThrowsException() {
			fail("Broken Test");
			//FIXME Broken Test uncomment this code and it will be revealed.
//		//TESTS MOVING TO THE LEFT
//		 
//		//WITH
//		Position p1 = mock(Position.class);
//		when(p1.getX()).thenReturn(1);
//		when(p1.getY()).thenReturn(1);
//		
//		Position p2 = mock(Position.class);
//		when(p2.getX()).thenReturn(1);
//		when(p2.getY()).thenReturn(0);
//		
//		
//		Move move = mock(Move.class);
//		when(move.getPositionStart()).thenReturn(p1);
//		when(move.getPositionFinish()).thenReturn(p2);
//		
//		Board board = new Board(8);//TODO: replace with test data
//		
//		// WHEN
//		board.applyMove(move);
//		
//		// THEN
//		// Should have thrown an exception.
	}

		@Test
		public void shouldAllowDiagonalMove() { 
			fail("Broken Test");
			//FIXME Broken Test uncomment this code and it will be revealed.
//			
//			// WITH
//			Board board = new Board(8);
//			
//			Position p1 = mock(Position.class);
//			when(p1.getX()).thenReturn(0);
//			when(p1.getY()).thenReturn(0);
//			
//			Position p2 = mock(Position.class);
//			when(p2.getX()).thenReturn(1);
//			when(p2.getY()).thenReturn(1);
//			 
//			Move move = mock(Move.class);
//			when(move.getPositionStart()).thenReturn(p1);
//			when(move.getPositionFinish()).thenReturn(p2);
//			
//			
//			// WHEN
//			assertThat(board.isOccupied(0, 0)).as("Old Position is occupied").isTrue();
//			assertThat(board.isOccupied(1, 1)).as("New position is unoccupied").isFalse();
//			board.applyMove(move);
//			
//			// THEN
//			assertThat(board.isOccupied(0, 0)).as("Old Position is unoccupied").isFalse();
//			assertThat(board.isOccupied(1, 1)).as("New position is occupied").isTrue();
//
			
		}
		
		@Test
		public void shobadMoveThrowsAnException() { 
			fail("Broken Test");
			//FIXME Broken Test uncomment this code and it will be revealed.
//		Position p2 = mock(Position.class);
//		when(p2.getX()).thenReturn(1);
//		when(p2.getY()).thenReturn(0);
//		
//		
//		Move move = mock(Move.class);
//		when(move.getPositionStart()).thenReturn(p1);
//		when(move.getPositionFinish()).thenReturn(p2);
//		
//		Board board = new Board(8);//TODO: replace with test data
//		
//		// WHEN
//		board.applyMove(move);
//		
//		// THEN
//		// Should have thrown an exception.
	}
	
	/**
	 * Test that a valid move is recognised to be valid. 
	 * Define and apply a move that we know is valid, pass test if no Exception is thrown
	 */
	@Test
	public void validMoveAllowed() {
		fail("Broken Test");
		//FIXME Broken Test uncomment this code and it will be revealed.
//		
//		// WITH
//		Board board = new Board(8);
//		
//		Position p1 = mock(Position.class);
//		when(p1.getX()).thenReturn(0);
//		when(p1.getY()).thenReturn(0);
//		
//		Position p2 = mock(Position.class);
//		when(p2.getX()).thenReturn(1);
//		when(p2.getY()).thenReturn(1);
//		
//		Move move = mock(Move.class);
//		when(move.getPositionStart()).thenReturn(p1);
//		when(move.getPositionFinish()).thenReturn(p2);
//		
//		// WHEN
//		board.applyMove(move);
//		
//		// THEN
//		// should not throw a exception
		
	}
	 
	 /**
	  * Checks that when a counter is moved down that an IllegalMoveException is thrown.
	  * 
	  * @author Ryan Cullen
	  */
	 @Test (expected = IllegalMoveException.class) 
	 public void checkInvalidMoveDownThrowsException() {
			fail("Broken Test");
			//FIXME Broken Test uncomment this code and it will be revealed.
//		//TESTS MOVING TO THE LEFT
//		 
//		//WITH
//		Position p1 = mock(Position.class);
//		when(p1.getX()).thenReturn(1);
//		when(p1.getY()).thenReturn(1);
//		
//		Position p2 = mock(Position.class);
//		when(p2.getX()).thenReturn(1);
//		when(p2.getY()).thenReturn(2);
//		
//		
//		Move move = mock(Move.class);
//		when(move.getPositionStart()).thenReturn(p1);
//		when(move.getPositionFinish()).thenReturn(p2);
//		
//		Board board = new Board(8);//TODO: replace with test data
//		
//		// WHEN
//		board.applyMove(move);
//		
//		// THEN
//		// Should have thrown an exception.
	}
	
	@Test (expected = IllegalMoveException.class)
	/**
	 * Normal/King counter not taking piece
	 */
	public void invalidLongDiagonalMoveExceptionThrown1() {
		
		fail("Broken Test");
		//FIXME Broken Test uncomment this code and it will be revealed.

//		//WHEN
//				
//		Position p1 = mock(Position.class);
//		when(p1.getX()).thenReturn(1);
//		when(p1.getY()).thenReturn(1);
//		
//		Position p2 = mock(Position.class);
//		when(p2.getX()).thenReturn(3);
//		when(p2.getY()).thenReturn(3);
//		
//		MoveRecord move= new MoveRecord(p1, p2,
//				Colour.BLACK,CounterType.NORMAL,false);
//		
//		//WHEN
//		
//		Move.applyMove(move);
//		//THEN
			
	}
	
	@Test (expected = IllegalMoveException.class)
	/**
	 * Normal/King counter taking piece
	 */
	public void invalidLongDiagonalMoveExceptionThrown2() {
		
		fail("Broken Test");
		//FIXME Broken Test uncomment this code and it will be revealed.

//		//WHEN
//				
//		Position p1 = mock(Position.class);
//		when(p1.getX()).thenReturn(1);
//		when(p1.getY()).thenReturn(1);
//		
//		Position p2 = mock(Position.class);
//		when(p2.getX()).thenReturn(4);
//		when(p2.getY()).thenReturn(4);
//		
//		MoveRecord move= new MoveRecord(p1, p2,
//				Colour.BLACK,CounterType.NORMAL,true);
//		
//		//WHEN
//		
//		Move.applyMove(move);
//		//THEN
			
	}
	
}
	
	


