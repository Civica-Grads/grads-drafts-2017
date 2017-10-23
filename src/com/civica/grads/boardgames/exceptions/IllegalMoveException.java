/**
 * 
 */
package com.civica.grads.boardgames.exceptions;

/**
 * A move was attempted that breaks the rules of the game.
 * @author Bruce.Mundin
 *
 */
public class IllegalMoveException extends MoveException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param message
	 * @param cause
	 */
	public IllegalMoveException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public IllegalMoveException(String message) {
		super(message);
	}

}
