package com.civica.grads.exercise3.model.draughts;

import java.io.IOException;
import java.io.OutputStream;

import com.civica.grads.exercise3.interfaces.Describable;

public class Move implements Describable {
	
	public Move() {
		
	}
	
	@Override
	public void describe(OutputStream out) throws IOException {
		out.write(this.toString().getBytes()) ;  
	}

	@Override
	public String toString() {
		return "Move []";
	}

	
}
