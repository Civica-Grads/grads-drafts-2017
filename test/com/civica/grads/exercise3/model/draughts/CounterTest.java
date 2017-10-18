package com.civica.grads.exercise3.model.draughts;

import static org.junit.Assert.*;

import org.junit.Test;

import com.civica.grads.exercise3.enums.Colour;
import com.civica.grads.exercise3.enums.CounterType;

public class CounterTest {
	
	Counter global= new Counter(Colour.BLACK, CounterType.NORMAL, null);

	@Test
	public void outputToStringCounterTest() {
		Counter one= new Counter(Colour.BLACK, CounterType.NORMAL, null);
		String expected= "Counter [colour=BLACK, type=NORMAL, position=null]";

		assertEquals(expected,one.toString());
		
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
