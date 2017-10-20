/**
 * 
 */
package com.civica.grads.boardgames.exceptions;

/**
 * @author Luke.Smith
 *
 */
public class OnToPieceException extends MoveException {

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
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public OnToPieceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
