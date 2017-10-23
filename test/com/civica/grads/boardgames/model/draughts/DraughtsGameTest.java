package com.civica.grads.boardgames.model.draughts;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;
import static org.fest.assertions.api.Assertions.assertThat; // main one


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.civica.grads.boardgames.exceptions.NoPieceException;
import com.civica.grads.boardgames.interfaces.Move;
import com.civica.grads.boardgames.model.Board;
import com.civica.grads.boardgames.model.Counter;
import com.civica.grads.boardgames.model.Position;
import com.civica.grads.boardgames.model.player.*;

public class DraughtsGameTest {
	
	/**
	 * Test to check whether a counter is correctly removed when takePiece is called. 
	 */
	@Test
	public void takePieceCorretlyRemovesCounter() {
		// WITH
		Player[] players = {mock(Player.class), mock(Player.class)} ; 
		int size = 8 ; // One of the standard board sizes.
		
		DraughtsGame draughtsGame = new DraughtsGame(size, players) ; 
		
		Position takeLocation = mock(Position.class) ; 
		when(takeLocation.getX()).thenReturn(0) ; 
		when(takeLocation.getY()).thenReturn(1) ; 
	 
		
		// THEN - Check that the piece is actually there before taking it. 
		assertThat(draughtsGame.getBoard().getBoard()[takeLocation.getY()][takeLocation.getX()], instanceOf(Counter.class)) ; 
		
		// WHEN 
		try {
			draughtsGame.takePiece(takeLocation) ;
		} catch (NoPieceException e) {
			e.printStackTrace();
		} 
		
		// THEN
		assertNull(draughtsGame.getBoard().getBoard()[takeLocation.getY()][takeLocation.getX()]) ; 
	}
	
	/**
	 * Test to whether correct Exception is thrown when no piece on tile and takePiece called. 
	 */
	@Test
	public void takePieceThrowsCorrectException() {
		// WITH
		Player[] players = {mock(Player.class), mock(Player.class)} ; 
		int size = 8 ; // One of the standard board sizes.
		
		DraughtsGame draughtsGame = new DraughtsGame(size, players) ; 
		
		Position takeLocation = mock(Position.class) ; 
		when(takeLocation.getX()).thenReturn(0) ; 
		when(takeLocation.getY()).thenReturn(0) ; 
	 
		
		// THEN - Check that there is not a piece on the tile before trying to take it. 
		assertNull(draughtsGame.getBoard().getBoard()[takeLocation.getY()][takeLocation.getX()]) ; 
		
		try {
			// WHEN
			draughtsGame.takePiece(takeLocation) ;
		} catch (NoPieceException e) {
			// THEN
			assertThat(e, instanceOf(NoPieceException.class)) ; 
			assertThat(e.getMessage())
				.as("Should contain the correct Exception message.")
				.contains("Trying to remove a piece from a tile where one does not exist.") ; 
		} 
		
	}

}
