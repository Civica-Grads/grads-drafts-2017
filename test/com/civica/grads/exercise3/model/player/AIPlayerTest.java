package com.civica.grads.exercise3.model.player;

import static org.junit.Assert.*;

import org.junit.Test;

import com.civica.grads.exercise3.enums.Difficulty;
import com.civica.grads.exercise3.enums.PlayerType;

public class AIPlayerTest {
	/** 
	 * Testing name works for AI player
	 */
	@Test
	public void playerNameAsExpected() {
		String name = "hamxa";
		
		Player player = new AIPlayer(name, Difficulty.EASY);
		
		assertEquals(name,player.getName());
	}
	/**
	 * Testing difficulty of AI
	 */
	@Test
	public void playerDifficultyAsExpected(){
		String name = "hamxa";
		AIPlayer player = new AIPlayer(name,Difficulty.EASY);
		assertEquals(Difficulty.EASY,player.getDifficulty());
	}
	/**
	 * Testing Type of AI
	 */
	@Test
	public void playerTypeAsExpected(){
		String name = "hamxa";
		Player player = new AIPlayer(name, Difficulty.EASY);
		assertEquals(PlayerType.AI,player.getType());
	}


}
