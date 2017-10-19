package com.civica.grads.boardgames.model;

import static org.junit.Assert.*;

import org.junit.Test;

import com.civica.grads.boardgames.model.Move;

public class MoveTest {

	@Test
	public void toStringExpectedValue() {
		Move move = new Move();
		
		String expected = "Move []";
		String actual = move.toString();
		
		assertEquals(expected, actual);
	}

}
