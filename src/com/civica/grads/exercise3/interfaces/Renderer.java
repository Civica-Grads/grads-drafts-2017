/**
 * 
 */
package com.civica.grads.exercise3.interfaces;

import com.civica.grads.exercise3.display.RenderException;
import com.civica.grads.exercise3.model.draughts.Board;

/**
 * @author Bruce.Mundin
 *
 */
public interface Renderer {
	
	void render(Board board) throws RenderException;

}
