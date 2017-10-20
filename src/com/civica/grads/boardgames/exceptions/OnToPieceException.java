/**
 * 
 */
package com.civica.grads.boardgames.exceptions;

/**
 * @author Luke.Smith
 *
 */
public class OnToPieceException extends IllegalMoveException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param message
	 * @param cause
	 */
	public OnToPieceException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public OnToPieceException(String message) {
		super(message);
	}
	
}
