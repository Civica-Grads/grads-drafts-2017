/**
 * 
 */
package com.civica.grads.exercise3.display;

import java.io.IOException;

import com.civica.grads.exercise3.interfaces.Renderer;
import com.civica.grads.exercise3.model.draughts.Board;

/**
 * @author Bruce.Mundin
 *
 */
public class SystemOutRenderer implements Renderer {

	/* (non-Javadoc)
	 * @see com.civica.grads.exercise3.interfaces.Renderer#render(com.civica.grads.exercise3.model.draughts.Board)
	 */
	@Override
	public void render(Board board) throws RenderException {
		
		try {
			board.describe(System.out);
		} catch (IOException ex) {
			
			throw new RenderException("Problem while rendering",ex);
			
		}
		
		
		

	}

}
