package com.civica.grads.boardgames.model;

import java.io.IOException;
import java.io.OutputStream;
import com.civica.grads.boardgames.enums.Colour;
import com.civica.grads.boardgames.enums.*;
import com.civica.grads.boardgames.interfaces.Describable;


public class Counter extends Piece implements Describable {
	 
	private CounterType type ; 
	private final int key ; //Assign each counter a number (key) from 1 to (size-2)*size/2
	
	public Counter(Colour colour, CounterType type, int key) {
		super(colour);
		this.type = type ; 
		this.key = key; 
	}


	public CounterType getType() {
		return type;
	}


	public void setType(CounterType type) {
		this.type = type;
	}
	

	public int getKey() {
		return key;
	}



	@Override
	public void describe(OutputStream out) throws IOException {
		out.write(this.toString().getBytes()) ;  
	}


	@Override
	public String toString() {
		return "Counter [type=" + type + ", key=" + key + "]";
	}



	
}
