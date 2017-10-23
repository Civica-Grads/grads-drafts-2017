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

}
