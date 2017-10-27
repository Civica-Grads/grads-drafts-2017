package com.civica.grads.boardgames.model;

import com.civica.grads.boardgames.enums.Colour;
import com.civica.grads.boardgames.enums.CounterType;

public abstract class Piece {
	private final Colour colour;
	private CounterType type;

	/**
	 * @return the type
	 */
	public CounterType getType() {
		return type;
	}

	public Piece(Colour colour, CounterType type) {
		this.colour = colour;
		this.type = type;

	}

	public Colour getColour() {
		return colour;
	}

	public void setType(CounterType type) {
		this.type = type ;
	}
}
