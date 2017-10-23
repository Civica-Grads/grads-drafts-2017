/**
 * 
 */
package com.civica.grads.boardgames.exceptions;

/**
 * @author Mike
 * For when a player cannot perform a legal move with any of their pieces
 * Should result with game over
 *
 */
public class NoMovePossibleException extends MoveException {
	
private static final long serialVersionUID = 1L;
	
	/**
	 * @param message
	 * @param cause
	 */
	public NoMovePossibleException(String message, Throwable cause) {
		super(message, cause);
	}
	
	/**
	 * @param message
	 */
	public NoMovePossibleException(String message) {
		super(message);
	}
}
