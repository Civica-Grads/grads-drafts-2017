package com.civica.grads.exercise3.model.draughts;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.civica.grads.exercise3.model.player.Player;

public class GameTest {

	/*
	 * Checking that the contents of the Board objects are the same, as we cannot compare two objects.
	 * */
	@Test
	public void getBoardExpectedReturn() {
		Player[] players = new Player[2];
		Game game = new Game(8, players);
		
		int expected = new Board(8).getSize();
		int actual = game.getBoard().getSize();
		
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void getStartingPlayerCountersExpectedReturn() {
		Player[] players = new Player[2];
		Game game = new Game(8, players);
		
		int expected = 24;
		int actual = game.getStartingPlayerCounters();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * @author team-mattdamon
	 * 
	 * Tests that the getPlayer method returns the expected value.
	 */
	@Test
	public void getPlayerExpectedReturn() {
		Player[] players = new Player[2];
		Game game = new Game(8, players);
		
		Player[] expected = new Player[2];
		Player[] actual = game.getPlayer();
		
		assertArrayEquals(expected, actual);
	}
	
	/**
	 *  Can't compare two ArrayList objects or the type of objects it holds due to type erasure, so we compare the size
	 *  to make sure it made the ArrayList correctly.
	 *  */
	@Test
	public void getMovesExpectedReturn() {
		//ArrayList<Move> moves = new ArrayList<>();
		Player[] players = new Player[2];
		Game game = new Game(8, players);
		
		ArrayList<Move> expected = new ArrayList<>();
		ArrayList<Move> actual = game.getMoves();
		
		assertEquals(expected.size(), actual.size());
		
	}
	
	@Test
	public void toStringExpectedReturn() {
		Player[] players = new Player[2];
		Game game = new Game(8, players);
		
		String expected = "Game [board=Board [size=8, tiles=[[Lcom.civica.grads.exercise3.model."
				+ "draughts.BoardTile;@6e5e91e4, [Lcom.civica.grads.exercise3.model.draughts.BoardTile;@2cdf8d8a,"
				+ " [Lcom.civica.grads.exercise3.model.draughts.BoardTile;@30946e09, [Lcom.civica.grads.exercise3"
				+ ".model.draughts.BoardTile;@5cb0d902, [Lcom.civica.grads.exercise3.model.draughts.BoardTile;@46fbb2c1"
				+ ", [Lcom.civica.grads.exercise3.model.draughts.BoardTile;@1698c449, [Lcom.civica.grads.exercise3."
				+ "model.draughts.BoardTile;@5ef04b5, [Lcom.civica.grads.exercise3.model.draughts.BoardTile;@5f4da5c3],"
				+ " whiteCounters=[], blackCounters=[]], startingPlayerCounters=24, player=[null, null], moves=[]]";
		String actual = game.toString();
		
		assertEquals(expected, actual);
	}
	
}
