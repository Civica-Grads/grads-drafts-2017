package com.civica.grads.boardgames.model;

import com.civica.grads.boardgames.enums.Colour;
import com.civica.grads.boardgames.enums.CounterType;

	public abstract class Piece {
		private final Colour colour ;
		private CounterType counterType;
		
        public Piece(Colour colour){
			this.colour=colour;
			
		}
		
		
		public Colour getColour() {
			return colour;
		}


		public CounterType getCounterType() {
			return counterType;
		}


		public void setCounterType(CounterType counterType) {
			this.counterType = counterType;
		}
		
}
