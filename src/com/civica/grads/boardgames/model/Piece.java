package com.civica.grads.boardgames.model;

import com.civica.grads.boardgames.enums.Colour;
import com.civica.grads.boardgames.enums.CounterType;

	public abstract class Piece {
		private final Colour colour ;
		private final CounterType type;
		
		public Piece(Colour colour, CounterType type){
			this.type=type;
			this.colour=colour;
			
		}
		
		public CounterType getType(){
			return type;
		}
		
		public Colour getColour() {
			return colour;
		}
}
