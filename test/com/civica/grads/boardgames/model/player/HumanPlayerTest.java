package com.civica.grads.boardgames.model.player;

import static org.junit.Assert.*;

import org.junit.Test;

import com.civica.grads.boardgames.enums.PlayerType;
import com.civica.grads.boardgames.model.player.HumanPlayer;
import com.civica.grads.boardgames.model.player.Player;

public class HumanPlayerTest {
	/**
	 * Testing name of Human
	 */
	@Test
	public void playerNameAsExpected() {
		String name = "hamxa";
		Player player = new HumanPlayer(name);
		assertEquals(name,player.getName());
	}
	/**
	 * Testing Type of Human
	 */
	@Test
	public void playerTypeAsExpected(){
		String name = "hamxa";
		Player player = new HumanPlayer(name);
		assertEquals(PlayerType.HUMAN,player.getType());
	}

}
