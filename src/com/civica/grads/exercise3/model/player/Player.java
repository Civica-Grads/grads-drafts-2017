package com.civica.grads.exercise3.model.player;

import java.io.IOException;
import java.io.OutputStream;

import com.civica.grads.exercise3.enums.PlayerType;
import com.civica.grads.exercise3.interfaces.Describable;

public abstract class Player implements Describable {
	private String name ; 
	protected PlayerType type ; 
	
	public Player(String name) {
		this.name = name ; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PlayerType getType() {
		return type;
	}


	@Override
	public void describe(OutputStream out) throws IOException {
		out.write(this.toString().getBytes()) ;  
	}

	@Override
	public String toString() {
		return "Player [name=" + name + "]";
	}

}
