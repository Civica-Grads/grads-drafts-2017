package com.civica.grads.exercise3.model.draughts;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;


public class BoardTest {
	
	@Test
	@Ignore
	public void toStringOutputExpectedText() {
		
		Board board = new Board(8);
		String expected = "";
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

}
