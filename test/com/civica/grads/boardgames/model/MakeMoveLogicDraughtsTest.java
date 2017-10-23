package com.civica.grads.boardgames.model;

import static org.junit.Assert.*;

import org.junit.Test;

import com.civica.grads.boardgames.enums.Colour;
import com.civica.grads.boardgames.enums.CounterType;

public class MakeMoveLogicDraughtsTest {

	@Test
	public void CheckFoValidMoveOutsideOfBoardtest() {
		
		
		Board b = new Board( 10);
		
		Counter a = new Counter(Colour.BLACK, CounterType.NORMAL, new Position(1,1));
		
	}

}
