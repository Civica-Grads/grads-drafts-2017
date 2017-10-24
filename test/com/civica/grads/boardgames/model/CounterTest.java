package com.civica.grads.boardgames.model;

import static org.junit.Assert.*;

import org.junit.Test;

import com.civica.grads.boardgames.enums.Colour;
import com.civica.grads.boardgames.enums.CounterType;
import com.civica.grads.boardgames.model.Counter;

public class CounterTest {
	
	Counter global= new Counter(Colour.BLACK, CounterType.NORMAL, 2);

	@Test
	public void outputToStringCounterTest() {
	
		String expected= "Counter [type=NORMAL, key=2]";

		assertEquals(expected,global.toString());
		
	}
	
	@Test
	public void getTypeCounterTest() {
		CounterType expected= CounterType.NORMAL;
		
		assertEquals(expected,global.getType());
		
	}
	
	@Test
	public void setTypeCounterTest() {
		CounterType expected = CounterType.KING;
		global.setType(CounterType.KING);
		
		assertEquals(expected, global.getType());
		
	}
	
	

}
