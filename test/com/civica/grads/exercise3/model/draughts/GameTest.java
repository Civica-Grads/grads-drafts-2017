package com.civica.grads.exercise3.model.draughts;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.civica.grads.exercise3.model.player.Player;

public class GameTest {

	/*
	 * Checking two objects?
	 * 
	@Test
	public void getBoardExpectedReturn() {
		Player[] players = new Player[2];
		Game game = new Game(8, players);
		
		Board expected = new Board(8);
		Board actual = game.getBoard();
		
		//assertTrue(expected.equals(actual));
		//assertThat(actual, samePropertyValuesAs(expected));
		assertEquals(expected, actual);
	}
	*/
	
	@Test
	public void getStartingPlayerCountersExpectedReturn() {
		Player[] players = new Player[2];
		Game game = new Game(8, players);
		
		int expected = 24;
		int actual = game.getStartingPlayerCounters();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void getPlayerExpectedReturn() {
		Player[] players = new Player[2];
		Game game = new Game(8, players);
		
		Player[] expected = new Player[2];
		Player[] actual = game.getPlayer();
		
		assertArrayEquals(expected, actual);
	}
	
	/*
	 *  compare two array lists?
	@Test
	public void getMovesExpectedReturn() {
		//ArrayList<Move> moves = new ArrayList<>();
		Player[] players = new Player[2];
		Game game = new Game(8, players);
		
		ArrayList<Move> expected = new ArrayList<>();
		ArrayList<Move> actual = game.getMoves();
		
		assertArrayEquals(expected, actual);
		
	}
	*/
}
