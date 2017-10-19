/**
 * 
 */
package com.civica.grads.boardgames.display;

import com.civica.grads.boardgames.model.Board;

/**
 * @author Bruce.Mundin
 *
 */
public class SystemOutRenderer extends AsciiBoardRenderer  {
	public SystemOutRenderer(Board board) {
		super(System.out,board);
	}
	
	public static void main(String[] args) {
		Board board = new Board(8) ; 
		SystemOutRenderer test = new SystemOutRenderer(board) ; 
	
		test.displayTextBoard(); 
	}
}
