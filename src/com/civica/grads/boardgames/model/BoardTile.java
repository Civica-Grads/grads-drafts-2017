package com.civica.grads.boardgames.model;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

import com.civica.grads.boardgames.enums.*;
import com.civica.grads.boardgames.interfaces.Describable;


public class BoardTile implements Describable {
	private final Colour colour; 
	private final int position[][] ; 
	private boolean occupied ; 
	
	public BoardTile(Colour colour, int[][] position, boolean occupied) {
		this.colour = colour ; 
		this.position = position ; 
		this.occupied = occupied ; 
	}
	
	
	public boolean isOccupied() {
		return occupied;
	}



	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}



	public Colour getColour() {
		return colour;
	}



	public int[][] getPosition() {
		return position;
	}



	@Override
	public void describe(OutputStream out) throws IOException {
		out.write(this.toString().getBytes()) ;  
	}

	@Override
	public String toString() {
		return "BoardTile [colour=" + colour + ", position=" + Arrays.toString(position) + ", occupied=" + occupied
				+ "]";
	}
	
	
}
