package com.civica.grads.boardgames.model.player;

import java.io.IOException;
import java.io.OutputStream;

import com.civica.grads.boardgames.enums.PlayerType;
import com.civica.grads.boardgames.interfaces.Describable;
import com.civica.grads.boardgames.interfaces.DeterminesNextMove;

//TODO: Change Player to an interface and create a private abtract.
public abstract class Player implements Describable,DeterminesNextMove {
	private String name ; 
	protected PlayerType type ; //FIXME Isn't this a final?
	
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
