package com.civica.grads.boardgames.model.player;

import static org.junit.Assert.*;

import org.junit.Test;

import com.civica.grads.boardgames.enums.Difficulty;
import com.civica.grads.boardgames.enums.PlayerType;
import com.civica.grads.boardgames.model.player.AIPlayer;
import com.civica.grads.boardgames.model.player.Player;

public abstract class AIPlayerTest {
	
	protected abstract AIPlayer createPlayer(String name, Difficulty easy);
	
	/** 
	 * Testing name works for AI player
	 */
	@Test
	public void playerNameAsExpected() {
		String name = "hamxa";
		
		Player player = createPlayer(name,Difficulty.EASY);
		
		assertEquals(name,player.getName());
	}
	/**
	 * Testing difficulty of AI
	 */
	@Test
	public void playerDifficultyAsExpected(){
		String name = "hamxa";
		AIPlayer player = createPlayer(name,Difficulty.EASY);
		assertEquals(Difficulty.EASY,player.getDifficulty());
	}
	
	/**
	 * Testing Type of AI
	 */
	@Test
	public void playerTypeAsExpected(){
		String name = "hamxa";
		Player player = createPlayer(name, Difficulty.EASY);
		assertEquals(PlayerType.AI,player.getType());
	}


}
