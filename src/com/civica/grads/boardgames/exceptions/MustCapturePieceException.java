/**
 * 
 */
package com.civica.grads.boardgames.exceptions;

/**
 * @author Mike
 *
 */
public class MustCapturePieceException extends MoveException {
	
private static final long serialVersionUID = 1L;
	
	/**
	 * @param message
	 * @param cause
	 */
	public MustCapturePieceException(String message, Throwable cause) {
		super(message, cause);
	}
	
	/**
	 * @param message
	 */
	public MustCapturePieceException(String message) {
		super(message);
	}
}
