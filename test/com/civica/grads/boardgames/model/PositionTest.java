package com.civica.grads.boardgames.model;

import static org.junit.Assert.*;

import org.junit.Test;



public class PositionTest {
	Position global= new Position(2,1);
	
	@Test
	public void outputToStringPositionTest() {
		
		String expected=  "Position [x=2, y=1]";;
		assertEquals(expected,global.toString());
		
	}	
	
	@Test
	public void getXCoordinateOfPositionTest(){
		int expected= 2;
		
		assertEquals(expected,global.getX());
	}
	
	@Test
	public void getYCoordinateOfPositionTest(){
		int expected= 1;
		
		assertEquals(expected,global.getY());
	}

}
