/**
 * 
 */
package com.civica.grads.boardgames.exceptions;

/**
 * @author Mike
 * For when a player has an opportunity to capture a piece, 
 * but chooses a different move, which does not take any pieces
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
