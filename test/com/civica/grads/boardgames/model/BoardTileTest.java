package com.civica.grads.boardgames.model;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import com.civica.grads.boardgames.enums.Colour;
import com.civica.grads.boardgames.model.BoardTile;

public class BoardTileTest {

	@Test
	public void outputToStringBoardTileTest() {
		BoardTile tile= new BoardTile(Colour.WHITE,null, false);
		String expected= "BoardTile [colour=WHITE, position=null, occupied=false]";
		assertEquals(expected, tile.toString());
	}
	
	@Test
	public void isOccupiedFalseTest(){
		BoardTile tile= new BoardTile(Colour.BLACK, null, false);
		assertFalse(tile.isOccupied());
		
	}
	
	@Test
	public void isOccupiedTrueTest(){
		BoardTile tile= new BoardTile(Colour.BLACK, null, true);
		assertTrue(tile.isOccupied());
		
	}
	
	@Test
	public void getColourBoardTileTest(){
		BoardTile tile= new BoardTile(Colour.WHITE,null, true);
		Colour expected= Colour.WHITE;
		assertEquals(expected, tile.getColour());
		
	}
	


}
