package com.civica.grads.exercise3.model.draughts;

import java.io.IOException;

import com.civica.grads.exercise3.enums.Colour;
import com.civica.grads.exercise3.enums.CounterType;
import com.civica.grads.exercise3.model.draughts.BoardTile;

public class BoardTileTest {

	public static void main(String[] args) {
		BoardTile boardTile = new BoardTile(Colour.BLACK, true, Colour.WHITE) ;
		try {
			boardTile.describe(System.out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} ; 
	}

}
