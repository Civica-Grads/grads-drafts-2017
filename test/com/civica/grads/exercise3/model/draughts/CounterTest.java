package com.civica.grads.exercise3.model.draughts;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.civica.grads.exercise3.enums.Colour;
import com.civica.grads.exercise3.enums.CounterType;


public class CounterTest {
	
	@Test
	public void getSizeExpectedValue() {
		int[] position = new int[2] ; 
		position[0] = position[1] = 50 ; 
		
		Counter counter = new Counter(Colour.BLACK, CounterType.KING, position) ;
		
		assertEquals(counter.getPosition(), position) ; 
		
	}

}
