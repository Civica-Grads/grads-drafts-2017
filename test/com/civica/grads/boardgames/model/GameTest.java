package com.civica.grads.boardgames.model;

import static org.fest.assertions.api.Assertions.assertThat; // main one
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

import org.junit.Test;

import com.civica.grads.boardgames.model.Board;
import com.civica.grads.boardgames.model.Game;
import com.civica.grads.boardgames.model.MoveRecord;
import com.civica.grads.boardgames.model.player.Player;
import com.civica.grads.boardgames.util.OutputStreamUtil;

public class GameTest {

	/**
	 * Check whether getPlayer() returns the correct Player array.
	 */
	@Test
	public void getPlayerReturnsExpectedPlayers() {
		// WITH
		Player[] players = {mock(Player.class), mock(Player.class)} ; 		
		Game game = mock(Game.class) ; 
		
		// WHEN
		when(game.getPlayer()).thenReturn(players) ;
		
		// THEN
		assert(game.getPlayer() == players) ; 
		assertEquals(game.getPlayer()[1], players[1]) ;
		assertEquals(game.getPlayer()[2], players[2]) ;		
	}
	
	/**
	 * Check whether getTurns() returns the correct Turn array.
	 */
	@Test
	public void getTurnsReturnsExpectedTurns() {
		// WITH
		TurnRecord turnOne = mock(TurnRecord.class) ; 
		TurnRecord turnTwo = mock(TurnRecord.class) ; 
		ArrayList<TurnRecord> turns = new ArrayList<TurnRecord>() ; 
		turns.add(turnOne) ; 
		turns.add(turnTwo) ; 
		
		Game game = mock(Game.class) ; 
		
		// WHEN
		when(game.getTurns()).thenReturn(turns) ;
		
		// THEN
		assert(game.getTurns() == turns) ; 
		assertEquals(game.getTurns().get(1), turns.get(1)) ;
		assertEquals(game.getTurns().get(2), turns.get(2)) ;		
	}


	
}
