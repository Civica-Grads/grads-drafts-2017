package com.civica.grads.boardgames.model;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

import com.civica.grads.boardgames.enums.Colour;
import com.civica.grads.boardgames.enums.CounterType;
import com.civica.grads.boardgames.exceptions.GameException;
import com.civica.grads.boardgames.exceptions.IllegalMoveException;
import com.civica.grads.boardgames.exceptions.NoPieceException;
import com.civica.grads.boardgames.interfaces.Move;
import com.civica.grads.boardgames.model.Board;
import com.civica.grads.boardgames.model.BoardTile;
import com.civica.grads.boardgames.model.Piece;

/**
 * 
 * @author Luke.Smith
 *
 */
public class BoardTest {
	
	/**
	 * Test that the correct size of the board is returned. 
	 */
	@Test
	public void getSizeExpectedValue() {
		// WHERE
		int size = 8 ; 
		Board board = new Board(size) ;
		
		// WHEN
		int expected = size ;
		int actual = board.getSize() ;
		
		// THEN
		assertEquals(expected, actual) ;
	}
	
	/**
	 * Test that isOccupied() returns false when no piece on a board tile.
	 */
	@Test
	public void isOccupiedReturnsFalseWhenExpected() {
		// WHERE
		int size = 8 ; 
		Board testBoard = new Board(size) ; 
		Position testTile = mock(Position.class) ; 
		when(testTile.getX()).thenReturn(0) ; 
		when(testTile.getY()).thenReturn(0) ; 
		
		// WHEN
		assertNull(testBoard.getPiece(testTile)) ; 
		
		// THEN
		assertFalse(testBoard.isOccupied(testTile)) ;
		
	}
	
	/**
	 * Test that isOccupied() returns true when there is a piece on a board tile.
	 */
	@Test
	public void isOccupiedReturnsTrueWhenExpected() {
		// WHERE
		int size = 8 ; 
		Board testBoard = new Board(size) ; 
		Position testTile = mock(Position.class) ; 
		when(testTile.getX()).thenReturn(1) ; 
		when(testTile.getY()).thenReturn(0) ; 
		
		// WHEN
		assertNotNull(testBoard.getPiece(testTile)) ; 
		
		// THEN
		assertTrue(testBoard.isOccupied(testTile)) ;
	}
	
	/**
	 * 
	 */
	@Test
	public void getPieceReturnsCorrectPiece() {
		
	}
	
	/**
	 * Test that placePiece() throws correct exception when no piece on specified tile. 
	 */
	@Test
	public void placePieceThrowsCorrectException() {
		// WITH
		int size = 8 ; 
		Board testBoard = new Board(size) ; 
		Piece testPiece = null ; 
		Position testTile = mock(Position.class) ; 
		when(testTile.getX()).thenReturn(1) ; 
		when(testTile.getY()).thenReturn(0) ; 
		
		
		try {
			// WHEN
			testBoard.placePiece(testPiece, testTile) ;
			fail("Exception not thrown.");
		} catch (GameException e) {
			// THEN
			assertThat(e, instanceOf(GameException.class)) ; 
			assertThat(e.getMessage())
				.as("Should contain the correct GameException message.")
				.contains("Invalid move! There's a piece on " + testTile.getX() +" "+ testTile.getY() +" already!") ; 
		} 
	}
	
	/**
	 * Test to check whether a counter is correctly removed when takePiece is called. 
	 * Note that this test relies on getPiece(). 
	 * @throws GameException 
	 */
	@Test
	public void placePiecePlacesCorrectPiece() throws GameException {
		// WITH
		int size = 8 ; 
		Board testBoard = new Board(size) ; 
		Piece testPiece = mock(Piece.class) ; 
		Position testTile = mock(Position.class) ; 
		when(testTile.getX()).thenReturn(0) ; 
		when(testTile.getY()).thenReturn(0) ;
		
		// WHEN
		testBoard.placePiece(testPiece, testTile);
		
		// THEN
		assert(testPiece == testBoard.getPiece(testTile)) ; 
		assertEquals(testPiece, testBoard.getPiece(testTile)) ; 
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
