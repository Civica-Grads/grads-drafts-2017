/**
 * 
 */
package com.civica.grads.boardgames.model.player.draughts;

import static org.junit.Assert.*;

import org.junit.Test;

import com.civica.grads.boardgames.enums.Difficulty;
import com.civica.grads.boardgames.model.player.AIPlayer;
import com.civica.grads.boardgames.model.player.AIPlayerTest;

/**
 * @author Bruce.Mundin
 *
 */
public class DraughtsAIPlayerTest extends AIPlayerTest {



	@Override
	protected AIPlayer createPlayer(String name, Difficulty easy) {
		return new DraughtsAIPlayer(name,easy);
	}

}
