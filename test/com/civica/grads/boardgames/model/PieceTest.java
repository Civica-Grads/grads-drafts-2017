package com.civica.grads.boardgames.model;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.civica.grads.boardgames.enums.Colour;



public class PieceTest {

	@Test
	public void getPieceColourTest() {		
		
		//WITH
		Piece piece= mock(Piece.class);
		
		//WHEN
		when(piece.getColour()).thenReturn(Colour.WHITE);
		
		
		Colour expected = Colour.WHITE;
		assertEquals(expected, piece.getColour());
		
	}


}
