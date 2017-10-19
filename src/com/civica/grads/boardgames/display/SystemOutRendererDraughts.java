/**
 * 
 */
package com.civica.grads.boardgames.display;

import java.io.PrintStream;

import com.civica.grads.boardgames.model.Board;

/**
 * @author Bruce.Mundin
 *
 */
public class SystemOutRendererDraughts extends AsciiBoardRenderer  {
	public SystemOutRendererDraughts(PrintStream out, Board board) {
		super(System.out, board);
	}
	
	public static void main(String[] args) {
		Board board = new Board(8) ; 
		SystemOutRendererDraughts test = new SystemOutRendererDraughts(System.out, board) ; 
	
		test.displayTextBoard(); 
	}
}
