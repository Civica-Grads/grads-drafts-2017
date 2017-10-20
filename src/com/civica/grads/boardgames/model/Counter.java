package com.civica.grads.boardgames.model;

import java.io.IOException;
import java.io.OutputStream;

import com.civica.grads.boardgames.enums.*;
import com.civica.grads.boardgames.interfaces.Describable;


public class Counter implements Describable {
	private final Colour colour ; 
	private CounterType type ; 
	private final int key ; 
	
	public Counter(Colour colour, CounterType type, int key) {
		this.colour = colour ; 
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


	public Colour getColour() {
		return colour;
	}


	@Override
	public void describe(OutputStream out) throws IOException {
		out.write(this.toString().getBytes()) ;  
	}


	@Override
	public String toString() {
		return "Counter [colour=" + colour + ", type=" + type + ", key=" + key + "]";
	}


	
}
