package com.civica.grads.exercise3.model.draughts;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

import com.civica.grads.exercise3.enums.*;
import com.civica.grads.exercise3.interfaces.Describable;


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
