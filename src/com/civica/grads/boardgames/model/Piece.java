package com.civica.grads.boardgames.model;

import com.civica.grads.boardgames.enums.Colour;

public abstract class Piece<CounterType> {
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
		// TODO Auto-generated method stub

	}
}
