package com.civica.grads.boardgames.model;

import static org.fest.assertions.api.Assertions.assertThat; // main one
import static org.mockito.Mockito.*;

import java.util.ArrayList;

import org.junit.Test;

import com.civica.grads.boardgames.exceptions.GameSetupException;
import com.civica.grads.boardgames.model.Game;
import com.civica.grads.boardgames.model.player.Player;

public abstract class BaseTestForGames {

    /**
     * Implement this in a child class to create an instance of the concrete class to test.
     * @param players
     * @return
     * @throws GameSetupException 
     */
    protected abstract Game createGame(Player[] players) throws GameSetupException; 
    
    
	/**
	 * Check whether getPlayer() returns the correct Player array.
	 * @throws GameSetupException 
	 */
	@Test
	public void getPlayerReturnsExpectedPlayers() throws GameSetupException {
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
	 * Check whether getTurns() returns the correct Turn array.
	 * @throws GameSetupException 
	 */
	@Test
	public void getTurnsReturnsExpectedTurns() throws GameSetupException {
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
