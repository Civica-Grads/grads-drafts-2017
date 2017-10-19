/**
 * 
 */
package com.civica.grads.boardgames.model.player.draughts;

import static org.junit.Assert.*;

import org.junit.Test;

import com.civica.grads.boardgames.model.Game;
import com.civica.grads.boardgames.model.GameTest;
import com.civica.grads.boardgames.model.player.Player;

/**
 * @author Bruce.Mundin
 *
 */
public class DraughtsGameTest extends GameTest{


	@Override
	protected Game createGame(Player[] players) {
		return new DraughtsGame(players);
	}

}
