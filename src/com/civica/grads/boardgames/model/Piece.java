package com.civica.grads.boardgames.model;

import com.civica.grads.boardgames.enums.Colour;

	public abstract class Piece {
		private final Colour colour ;
		
		
		public Piece(Colour colour){
			this.colour=colour;
			
		}
		
		
		public Colour getColour() {
			return colour;
		}
}
