/**
 * 
 */
package com.civica.grads.boardgames.exceptions;

/**
 * A base exception for Games
 * @author Bruce.Mundin
 *
 */
public abstract class GameException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	protected GameException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	protected GameException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	protected GameException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	protected GameException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
