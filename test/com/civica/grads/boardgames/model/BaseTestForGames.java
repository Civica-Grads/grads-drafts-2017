package com.civica.grads.boardgames.model;

import static org.fest.assertions.api.Assertions.assertThat; // main one
import static org.mockito.Mockito.*;

import java.util.ArrayList;

import org.junit.Test;

import com.civica.grads.boardgames.model.Game;
import com.civica.grads.boardgames.model.player.Player;

public abstract class BaseTestForGames {

    protected abstract Game createGame(Player[] players); 
    
    
	/**
	 * Check whether getPlayer() returns the correct Player array.
	 */
	@Test
	public void getPlayerReturnsExpectedPlayers() {
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
	 */
	@Test
	public void getTurnsReturnsExpectedTurns() {
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
