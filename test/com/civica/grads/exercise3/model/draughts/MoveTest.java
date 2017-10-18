package com.civica.grads.exercise3.model.draughts;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoveTest {

	@Test
	public void toStringExpectedValue() {
		Move move = new Move();
		
		String expected = "Move []";
		String actual = move.toString();
		
		assertEquals(expected, actual);
	}

}
