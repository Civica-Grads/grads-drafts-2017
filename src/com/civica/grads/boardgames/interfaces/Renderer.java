/**
 * 
 */
package com.civica.grads.boardgames.interfaces;

import com.civica.grads.boardgames.display.RenderException;
import com.civica.grads.boardgames.model.Board;

/**
 * @author Bruce.Mundin
 *
 */
public interface Renderer {
	
	void render(Board board) throws RenderException;

}
