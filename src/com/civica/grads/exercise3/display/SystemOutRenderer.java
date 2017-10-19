/**
 * 
 */
package com.civica.grads.exercise3.display;

import com.civica.grads.exercise3.model.draughts.Board;

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
