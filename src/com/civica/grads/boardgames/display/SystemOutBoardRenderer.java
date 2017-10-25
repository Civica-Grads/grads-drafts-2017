/**
 * 
 */
package com.civica.grads.boardgames.display;

import com.civica.grads.boardgames.exceptions.RenderException;
import com.civica.grads.boardgames.interfaces.Renderer;
import com.civica.grads.boardgames.model.Board;

/**
 * @author Bruce.Mundin
 *
 */
public class SystemOutBoardRenderer extends AsciiBoardRenderer  {
	public SystemOutBoardRenderer() {
		super(System.out);
	}
	

}
