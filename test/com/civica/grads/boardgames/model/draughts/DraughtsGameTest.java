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

import static org.mockito.Mockito.when;

import com.civica.grads.boardgames.interfaces.Move;
import com.civica.grads.boardgames.model.Position;
import com.civica.grads.boardgames.model.Board;
import com.civica.grads.boardgames.model.player.*;

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
	 * Test that a valid move is recognised to be valid. 
	 * Define and apply a move that we know is valid, pass test if no Exception is thrown
	 */
	@Test
	public void validMoveAllowed() {
		
		// WITH
		
		// create an array of players
		HumanPlayer humanPlayerWhite = new HumanPlayer("playerWhite");
		HumanPlayer humanPlayerBlack = new HumanPlayer("playerBlack");
		HumanPlayer humanPlayers[] = {humanPlayerWhite, humanPlayerBlack};
		
		// create draughts game with the two players in the array
		DraughtsGame draughtsGame = new DraughtsGame(8,	humanPlayers);
		
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
		draughtsGame.applyMove(move);
		
		// THEN 
		// should not throw a exception
		
	}
	
	/* Test that when we try to perform a valid more, the move is actually performed
	 * 
	 * @Test
	 * public void isValidMovePerformed() {
	 * 
	 * create an array of players
	 * HumanPlayer humanPlayerWhite = new HumanPlayer("playerWhite");
	 * HumanPlayer humanPlayerBlack = new HumanPlayer("playerBlack");
	 * HumanPlayer humanPlayers[] = {humanPlayerWhite, humanPlayerBlack};
	 *  
	 * create draughts game with the two players in the array
	 * DraughtsGame draughtsGame = new DraughtsGame(8,	humanPlayers);
	 * 
	 * create move game logic class (to validate move later on)
	 * 
	 * initialise counters on board
	 * draughtsGame.initialiseBoardForGame();
	 * 
	 * check
	 * 	board.getBoard()[start][start] != null
	 * 	board.getBoard()[end][end] == null
	 * 	
	 * if(move is valid)
	 * 	draughtsGame.applyMove(move);
	 * 
	 * check
	 * 	board.getBoard()[start][start] == null
	 * 	board.getBoard()[end][end] != null
	 * 
	 * }
	 */
	
	// TODO: This needs to be checked! Use getRow(), getColumn() ? Check positions are correct.
	@Test
	public void isValidMovePerformed() {
		
		// WITH
		
		// create an array of players
		HumanPlayer humanPlayerWhite = new HumanPlayer("playerWhite");
		HumanPlayer humanPlayerBlack = new HumanPlayer("playerBlack");
		HumanPlayer humanPlayers[] = {humanPlayerWhite, humanPlayerBlack};
				
		// create draughts game with the two players in the array
		DraughtsGame draughtsGame = new DraughtsGame(8,	humanPlayers);
		
		// TODO: create move game logic class (to validate move later on)
		
		draughtsGame.initialiseBoardForGame();
		
		// mock start position, end position and move
		Position startPosition = mock(Position.class);
		when(startPosition.getX()).thenReturn(1);
		when(startPosition.getY()).thenReturn(0);
		
		Position endPosition = mock(Position.class);
		when(endPosition.getX()).thenReturn(0);
		when(endPosition.getY()).thenReturn(1);
		
		Move move = mock(Move.class);
		when(move.getPositionStart()).thenReturn(startPosition);
		when(move.getPositionFinish()).thenReturn(endPosition);
		
		boolean counterAtStart, counterAtEnd;
		
		// check there is a counter that can move into an empty position
		// TODO: this will be checked by the validate move function anyway?
		counterAtStart = draughtsGame.getBoard().isOccupied(startPosition.getX(), startPosition.getY());
		counterAtEnd = draughtsGame.getBoard().isOccupied(endPosition.getX(), endPosition.getY());
		
		// if valid then apply move
		if(counterAtStart && !counterAtEnd /* && move is valid */) {
			draughtsGame.applyMove(move);
		} else {
			fail("Move is invalid");
		}
		
		counterAtStart = draughtsGame.getBoard().isOccupied(startPosition.getX(), startPosition.getY());
		counterAtEnd = draughtsGame.getBoard().isOccupied(endPosition.getX(), endPosition.getY());
		
		// check that there is now a counter at end, and no counter at start
		assertEquals(0, counterAtStart);
		assertEquals(1, counterAtEnd);
	}
}
