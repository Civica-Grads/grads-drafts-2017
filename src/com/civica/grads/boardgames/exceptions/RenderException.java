/**
 * 
 */
package com.civica.grads.boardgames.exceptions;

/**
 * @author Bruce.Mundin
 *
 */
public class RenderException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param message
	 * @param cause
	 */
	public RenderException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public RenderException(String message) {
		super(message);
	}

}
