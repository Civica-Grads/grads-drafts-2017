/**
 * 
 */
package com.civica.grads.boardgames.display;

import com.civica.grads.boardgames.model.Board;

/**
 * @author Bruce.Mundin
 *
 */
public class SystemOutRendererChess extends AsciiBoardRenderer  {
	public SystemOutRendererChess(Board board) {
		super(System.out,board);
	}
	
	public static void main(String[] args) {
		Board board = new Board(8) ; 
		SystemOutRendererChess test = new SystemOutRendererChess(board) ; 
	
		test.displayTextBoard(); 
	}
}
