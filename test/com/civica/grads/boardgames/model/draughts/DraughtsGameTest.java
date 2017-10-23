/**
 * 
 */
package com.civica.grads.boardgames.model.draughts;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import org.junit.Test;

import com.civica.grads.boardgames.exceptions.GameException;
import com.civica.grads.boardgames.model.Game;
import com.civica.grads.boardgames.model.GameTest;
import com.civica.grads.boardgames.model.Position;
import com.civica.grads.boardgames.model.player.Player;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.fest.assertions.api.Assertions.assertThat; // main one


import static org.mockito.Mockito.when;

import com.civica.grads.boardgames.exceptions.NoPieceException;
import com.civica.grads.boardgames.model.Counter;

/**
 * @author Bruce.Mundin
 *
 */
public class DraughtsGameTest extends GameTest {

	@Override
	protected Game createGame(Player[] players) {
		return new DraughtsGame(players);
	}

	@Test(expected=GameException.class)
	public void shouldNotAllowTooFewPlayers()
	{
	// WITH
	Player[] tooManyPlayers = {
			mock(Player.class)
	};
	DraughtsGame game = new DraughtsGame(tooManyPlayers);
	
	// WHEN
	// THEN	
	}

	
	@Test(expected=GameException.class)
	public void shouldNotAllowTooManyPlayers()
	{
	// WITH
	Player[] tooManyPlayers = {
			mock(Player.class),
			mock(Player.class),
			mock(Player.class),
	};
	DraughtsGame game = new DraughtsGame(tooManyPlayers);
	
	// WHEN
	// THEN	
	}


	/**
	 * Test to check whether a counter is correctly removed when takePiece is called. 
	 * @throws NoPieceException 
	 */
	@Test
	public void takePieceCorrectlyRemovesCounter() throws NoPieceException {
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
		draughtsGame.takePiece(takeLocation) ;
		
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
			fail("Exception not thrown.");
		} catch (NoPieceException e) {
			// THEN
			assertThat(e, instanceOf(NoPieceException.class)) ; 
			assertThat(e.getMessage())
				.as("Should contain the correct Exception message.")
				.contains("Trying to remove a piece from a tile where one does not exist.") ; 
		} 
		
	}

}
