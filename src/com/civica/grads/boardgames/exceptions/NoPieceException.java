/**
 * 
 */
package com.civica.grads.boardgames.exceptions;

/**
 * An attempt to move an empty square.
 * @author Luke.Smith
 *
 */
public class NoPieceException extends MoveException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param message
	 * @param cause
	 */
	public NoPieceException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public NoPieceException(String message) {
		super(message);
	}

}
