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

public abstract class GameTest {

	@Test
	public void whenTheGameIsCreatedItHasNoTurns()
	{
	// WITH
	Game game = createGame( new Player[2]);
	
	// THEN
	assertThat(game).isNotNull();
	assertThat(game.hasTurns()).as("Shouldn't be any turns").isFalse();
	assertThat(game.getTurns()).isNotNull().isEmpty();	
	}
	
	@Test
	public void canAddTurnsToAGame()
	{
	// WITH
	Game game = createGame( new Player[2]);
	TurnRecord turn = new TurnRecord();
	
	// WHEN
	game.addTurn(turn);

	// THEN
	assertThat(game.hasTurns()).as("No Turns.").isTrue();
	assertThat(game.getTurns()).isNotNull().hasSize(1);
	assertThat(game.getTurns()).contains(turn);
	
	
	}
	
	/*
	 * Checking that the contents of the Board objects are the same, as we cannot compare two objects.
	 * */
	@Test
	public void getBoardExpectedReturn() {
		Player[] players = new Player[2];
		Game game = createGame( players);
		
		int expected = new Board(8).getSize();
		int actual = game.getBoard().getSize();
		
		assertEquals(expected, actual);
	}
	
	
	private Game createGame(ArrayList<Player> players) {
		return createGame(players.toArray(new Player[0]));
	}
	abstract protected Game createGame(Player[] players);
	


	@Test
	public void getStartingPlayerCountersExpectedReturn() {
		Player[] players = new Player[2];
		Game game = createGame( players);
		
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
		Game game = createGame( players);
		
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
		Game game = createGame( players);
		
		ArrayList<MoveRecord> expected = new ArrayList<>();
		
		assertEquals(expected.size(), game.getNumberOfTurns());
		
	}
	
	@Test
	public void toStringExpectedReturn() throws IOException {
		
		// WITH
		Player player1 = mock(Player.class);
		Player player2 = mock(Player.class);
		when(player1.getName()).thenReturn("player-1");
		when(player2.getName()).thenReturn("player-2");
		ArrayList<Player> players = new ArrayList<Player>();
		players.add(player1);
		players.add(player2);

		Game game = createGame(players);
		OutputStream out = OutputStreamUtil.createOutputStream();
		
		// WHEN
		game.describe(out);
		String actualText = out.toString();
		
		// THEN
		assertThat(actualText)
			.as("Game Description")
				.isNotNull()
				.isNotEmpty()
			.as("Game Description, has game entry")
				.startsWith("Game [")
				.endsWith("]")
			.as("Game Description, has turns description")
				.contains("Turns [")
			.as("Game Description, has player description")
				.contains("Players [")
				.contains(player1.getName())
				.contains(player2.getName());
		
	}


	
}
