package com.civica.grads.boardgames.model;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.civica.grads.boardgames.model.Board;
import com.civica.grads.boardgames.model.BoardTile;
import com.civica.grads.boardgames.model.Counter;


public class BoardTest {
	
	//FIXME: This test fails
	@Test
	public void toStringOutputExpectedText() {
		
		Board board = new Board(8);
		String expected = "Board [size=8, tiles=[[Lcom.civica.grads.exercise3.model.draughts.BoardTile;@6e5e91e4,"
				+ " [Lcom.civica.grads.exercise3.model.draughts.BoardTile;@2cdf8d8a, "
				+ "[Lcom.civica.grads.exercise3.model.draughts.BoardTile;@30946e09, "
				+ "[Lcom.civica.grads.exercise3.model.draughts.BoardTile;@5cb0d902, "
				+ "[Lcom.civica.grads.exercise3.model.draughts.BoardTile;@46fbb2c1,"
				+ " [Lcom.civica.grads.exercise3.model.draughts.BoardTile;@1698c449,"
				+ " [Lcom.civica.grads.exercise3.model.draughts.BoardTile;@5ef04b5,"
				+ " [Lcom.civica.grads.exercise3.model.draughts.BoardTile;@5f4da5c3],"
				+ " whiteCounters=[], blackCounters=[]]";
		String actual = board.toString();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void getSizeExpectedValue() {
		Board board = new Board(8);
		
		int expected = 8;
		int actual = board.getSize();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void getTilesExpectedValue() {
		Board board = new Board(8);
		
		BoardTile[][] expected = new BoardTile[8][8];
		BoardTile[][] actual = board.getTiles();
		
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void getWhiteCountersExpectedValue() {
		Board board = new Board(8);
		
		ArrayList<Counter> expected = new ArrayList<>();
		ArrayList<Counter> actual = board.getWhiteCounters();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void getBlackCountersExpectedValue() {
		Board board = new Board(8);
		
		ArrayList<Counter> expected = new ArrayList<>();
		ArrayList<Counter> actual = board.getBlackCounters();
		
		assertEquals(expected, actual);
	}

}
