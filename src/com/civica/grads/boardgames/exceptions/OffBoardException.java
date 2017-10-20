/**
 * 
 */
package com.civica.grads.boardgames.exceptions;

/**
 * @author Luke.Smith
 *
 */
public class OffBoardException extends MoveException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param message
	 * @param cause
	 */
	public OffBoardException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public OffBoardException(String message) {
		super(message);
	}

}
