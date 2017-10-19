package com.civica.grads.exercise3.model.draughts;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.civica.grads.exercise3.interfaces.Describable;
import com.civica.grads.exercise3.interfaces.Storable;

// FIXME Who's Move is this ?
// FIXME Which board does this belong to if any?
// FIXME How do I get the next move?
// FIXME Which square is this on?
// FIXME WHich piece is this?
public class Move implements Describable,Storable {
	
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

	@Override
	public void save(InputStream sourceIs) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void load(OutputStream sourceIs) throws IOException {
		// TODO Auto-generated method stub
		
	}

	
}
