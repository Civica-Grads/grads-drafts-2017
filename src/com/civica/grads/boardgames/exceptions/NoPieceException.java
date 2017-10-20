/**
 * 
 */
package com.civica.grads.boardgames.exceptions;

/**
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
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public NoPieceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
