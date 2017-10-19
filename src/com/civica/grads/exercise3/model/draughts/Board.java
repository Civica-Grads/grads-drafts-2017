package com.civica.grads.exercise3.model.draughts;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

import com.civica.grads.exercise3.interfaces.Describable;

public class Board implements Describable {

	private Counter[][] array;
	

	public Board(Counter[][] array) {
		this.array=array ; 
		 
	}
	
	public Counter[][] getArray() {
		return array;
	}
	
	public boolean isOccupied(int x, int y) {
		if(this.array[x][y].equals(null)){
			return false;
		}else{
			return true;
		}
	}

	
	@Override
	public void describe(OutputStream out) throws IOException {
		out.write(this.toString().getBytes()) ;  
	}




	@Override
	public String toString() {
		return "Board [array=" + Arrays.toString(array) + "]";
	}








	
	
}
 