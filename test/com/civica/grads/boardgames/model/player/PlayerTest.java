package com.civica.grads.boardgames.model.player;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;


public class PlayerTest {

		//WITH
		Player player = mock(Player.class);
		
	@Test
	public void outputToStringPlayerTest() {
		
				
		//WHEN
		when(player.toString()).thenReturn(" Player [name= Rose]");
		
		String expected = " Player [name= Rose]";
		
		assertEquals(expected, player.toString());
		
		}
	
	@Test
	public void getNameOfPlayerTest(){
		
		//WHEN
		when(player.getName()).thenReturn("Rose");
		
		String expected  = "Rose";
		
		assertEquals(expected, player.getName());
		
	}
	

}
