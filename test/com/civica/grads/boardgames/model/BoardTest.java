package com.civica.grads.boardgames.model;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.OutputStream;
import org.junit.Test;


import com.civica.grads.boardgames.exceptions.GameException;

import com.civica.grads.boardgames.model.Board;
import com.civica.grads.boardgames.model.Piece;
import com.civica.grads.boardgames.util.OutputStreamUtil;

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
	 * @throws GameException 
	 */
	@Test
	public void isOccupiedReturnsFalseWhenExpected() throws GameException {
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
	 * This test has a dependency on placePiece() ; 
	 * @throws GameException 
	 */
	@Test
	public void isOccupiedReturnsTrueWhenExpected() throws GameException {
		// WHERE
		int size = 8 ; 
		Board testBoard = new Board(size) ; 
		Position testTile = mock(Position.class) ; 
		when(testTile.getX()).thenReturn(1) ; 
		when(testTile.getY()).thenReturn(0) ; 
		Piece testPiece = mock(Piece.class) ; 
		
		// WHEN
		testBoard.placePiece(testPiece, testTile) ;
		
		// THEN
		assertNotNull(testBoard.getPiece(testTile)) ; 
		assertTrue(testBoard.isOccupied(testTile)) ;
	}
	
	/**
	 * Test that getPiece() returns an object of class Piece. 
	 * @throws GameException 
	 */
	@Test
	public void getPieceReturnsAPieceObject() throws GameException {
		// WHERE
		int size = 8 ; 
		Board testBoard = new Board(size) ; 
		Position testTile = mock(Position.class) ; 
		when(testTile.getX()).thenReturn(1) ; 
		when(testTile.getY()).thenReturn(0) ; 
		Piece testPiece = mock(Piece.class) ;

		// WHEN
		testBoard.placePiece(testPiece, testTile);

		// THEN
		assertNotNull(testBoard.getPiece(testTile)) ; 
		assertThat(testBoard.getPiece(testTile), instanceOf(Piece.class)) ; 
	}
	
	/**
	 * Test that getPiece() returns the correct Piece object. 
	 * This test has a dependency on placePiece() ; 
	 * @throws GameException 
	 */
	@Test
	public void getPieceReturnsCorrectPiece() throws GameException {
		// WHERE
		int size = 8 ; 
		Board testBoard = new Board(size) ; 
		Position testTile = mock(Position.class) ; 
		when(testTile.getX()).thenReturn(0) ; 
		when(testTile.getY()).thenReturn(0) ; 
		Piece testPiece = mock(Piece.class) ; 

		// WHEN
		testBoard.placePiece(testPiece, testTile);

		// THEN
		assert(testBoard.getPiece(testTile) == testPiece) ; 
		assertEquals(testBoard.getPiece(testTile), testPiece) ;
	}
	
	/**
	 * Test that placePiece() throws correct Exception when no piece on specified tile. 
	 * This test has a dependency on placePiece(). 
	 * @throws GameException
	 */
	@Test
	public void placePieceThrowsCorrectException() throws GameException {
		// WITH
		int size = 8 ; 
		Board testBoard = new Board(size) ; 
		Piece testPiece = null ; 
		Position testTile = mock(Position.class) ; 
		when(testTile.getX()).thenReturn(1) ; 
		when(testTile.getY()).thenReturn(0) ; 
		Piece mockPiece = mock(Piece.class) ; 
		
		// WHEN
		testBoard.placePiece(mockPiece, testTile);
		
		// THEN
		try {
			testBoard.placePiece(testPiece, testTile) ;
			fail("Exception not thrown.");
		} catch (GameException e) {
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
	
	/**
	 * Test to check whether getAndRemovePiece() throws the correct Exception. 
	 */
	@Test
	public void getAndRemovePieceThrowsCorrectException() {
		// WITH
		int size = 8 ; 
		Board testBoard = new Board(size) ; 
		Piece returnPiece = null ; 
		Position testTile = mock(Position.class) ; 
		when(testTile.getX()).thenReturn(0) ; 
		when(testTile.getY()).thenReturn(0) ; 
		
		
		try {
			// WHEN
			returnPiece = testBoard.getAndRemovePiece(testTile) ;
			fail("Exception not thrown.");
		} catch (GameException e) {
			// THEN
			assertThat(e, instanceOf(GameException.class)) ; 
			assertThat(e.getMessage())
				.as("Should contain the correct GameException message.")
				.contains("Invalid move! There's no piece on " + testTile.getX() + " " + testTile.getY() + "!") ; 
		} 
	}
	
	/**
	 * Test to check whether getAndRemovePiece() throws the correct Exception. 
	 * This test has dependencies on placePiece() and getPiece(). 
	 * @throws GameException
	 */
	@Test
	public void getAndRemovePieceReturnsCorrectPiece() throws GameException {
		// WITH
		int size = 8 ; 
		Board testBoard = new Board(size) ; 
		Position testTile = mock(Position.class) ; 
		when(testTile.getX()).thenReturn(0) ; 
		when(testTile.getY()).thenReturn(0) ; 
		Piece pieceToPlace = mock(Piece.class) ; 
		
		// WHEN 
		testBoard.placePiece(pieceToPlace, testTile) ; 
		Piece testPiece = testBoard.getPiece(testTile) ; 
		Piece returnPiece = testBoard.getAndRemovePiece(testTile) ; 
		
		// THEN
		assert(testPiece == returnPiece) ; 
		assertEquals(testPiece, returnPiece) ;  
	}
	
	/**
	 * Test to check whether getAndRemovePiece() throws the correct Exception. 
	 * This test has dependencies on placePiece() and getPiece().
	 */
	@Test
	public void getAndRemovePieceSetsPieceToNull() throws GameException {
		// WITH
		int size = 8 ; 
		Board testBoard = new Board(size) ; 
		Position testTile = mock(Position.class) ; 
		when(testTile.getX()).thenReturn(0) ; 
		when(testTile.getY()).thenReturn(0) ; 
		Piece pieceToPlace = mock(Piece.class) ; 
		
		// WHEN 
		testBoard.placePiece(pieceToPlace, testTile) ; 
		Piece returnPiece = testBoard.getAndRemovePiece(testTile) ; 
		
		// THEN
		assertNull(testBoard.getPiece(testTile)) ; 
	}
	
	/**
	 * Test that toString() returns the expected string.
	 */
	@Test
	public void toStringExpectedReturn() throws IOException {
		
		// WITH
		int size = 8 ; 
		Board testBoard = new Board(size) ; 
		OutputStream out = OutputStreamUtil.createOutputStream();
		
		// WHEN
		testBoard.describe(out);
		String actualText = out.toString();
				
		// THEN
		assertThat(actualText)
			.as("Board Description")
				.isNotNull()
				.isNotEmpty()
			.as("Board Description, has board entry")
				.startsWith("Board [")
				.endsWith("]")
			.as("Game Description, has countersOnBoard description")
				.contains("countersOnBoard = [") ; 
	}

}
