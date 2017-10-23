/**
 * 
 */
package com.civica.grads.boardgames.exceptions;

/**
 * Something went wrong when a move occured.
 * @author Luke.Smith
 *
 */
public abstract class MoveException extends GameException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * @param message
	 * @param cause
	 */
	public MoveException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public MoveException(String message) {
		super(message);
	}

}
