package com.civica.grads.boardgames.model;

import static org.fest.assertions.api.Assertions.assertThat; // main one
import static org.mockito.Mockito.*;

import java.util.ArrayList;

import org.junit.Test;

import com.civica.grads.boardgames.exceptions.GameException;
import com.civica.grads.boardgames.exceptions.GameSetupException;
import com.civica.grads.boardgames.model.Game;
import com.civica.grads.boardgames.model.player.Player;

public abstract class BaseTestForGames {

    /**
     * Implement this in a child class to create an instance of the concrete class to test.
     * @param players
     * @return
     * @throws GameSetupException 
     * @throws GameException 
     */
    protected abstract Game createGame(Player[] players) throws GameSetupException, GameException; 
    
    
	/**
	 * Check whether getPlayer() returns the correct Player array.
	 * @throws GameException 
	 */
	@Test
	public void getPlayerReturnsExpectedPlayers() throws GameException {
		// WITH
		Player[] players = {mock(Player.class), mock(Player.class)} ; 		
		
		// WHEN
        Game game = createGame(players) ; 
		
		// THEN
		assertThat(game.getPlayer())
		    .isNotNull()
		    .isNotEmpty()
		    .hasSize(2)
		    .contains(players[0], players[1]) ;		
	}
	
	
	/**
	 * Check whether hasTurns() returns true when expected.
	 * @throws GameException 
	 */
	@Test
	public void hasTurnsReturnsTrueWhenExpected() throws GameException {
		
		// WITH 
		Player[] players = {mock(Player.class), mock(Player.class)} ;       
		TurnRecord turnOne = mock(TurnRecord.class); 
		ArrayList<TurnRecord> turns = new ArrayList<TurnRecord>();
		turns.add(turnOne) ; 
		
		Game game = createGame(players) ;
		
		// WHEN 
		game.addTurns(turns);
		
		// THEN
		assertThat(game.hasTurns()).isTrue();
	}
	
	/**
	 * Check whether hasTurns() returns false when expected.
	 * @throws GameException 
	 */
	@Test
	public void hasTurnsReturnsFalseWhenExpected() throws GameException {
		
		// WITH 
		Player[] players = {mock(Player.class), mock(Player.class)} ;       
		ArrayList<TurnRecord> turns = new ArrayList<TurnRecord>();
		
		Game game = createGame(players) ;
		
		// WHEN 
		game.addTurns(turns);
		
		// THEN
		assertThat(game.hasTurns()).isFalse();
	}
	
	/**
	 * Check whether getTurns() returns the correct Turn array.
	 * @throws GameException 
	 */
	@Test
	public void getTurnsReturnsExpectedTurns() throws GameException {
		// WITH
        Player[] players = {mock(Player.class), mock(Player.class)} ;       
		TurnRecord turnOne = mock(TurnRecord.class) ; 
		TurnRecord turnTwo = mock(TurnRecord.class) ; 
		ArrayList<TurnRecord> turns = new ArrayList<TurnRecord>() ; 
		turns.add(turnOne) ; 
		turns.add(turnTwo) ; 
		
		Game game = createGame(players) ; 
        assertThat(game.hasTurns()).isFalse();
		
		// WHEN
		game.addTurns(turns);
		
		// THEN
		assertThat(game.hasTurns()).isTrue();
		assertThat(game.getTurns())
		    .hasSize(2)
		    .contains(turnOne,turnTwo);
		

	}


	
}
