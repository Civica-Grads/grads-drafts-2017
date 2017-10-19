/**
 * 
 */
package com.civica.grads.exercise3.display;

import java.io.IOException;
import java.util.ArrayList;

import com.civica.grads.exercise3.interfaces.Renderer;
import com.civica.grads.exercise3.model.draughts.Board;
import com.civica.grads.exercise3.model.draughts.BoardTile;
import com.civica.grads.exercise3.model.draughts.Counter;

/**
 * @author Bruce.Mundin
 *
 */
public class SystemOutRenderer implements Renderer {
	private char[][] textBoard ; 
	private int dimension;
	
	public SystemOutRenderer(Board board) {
		determineBoardDisplaySize(board.getSize()) ; 
		textBoard = new char[dimension][dimension] ; 
		fillEmptyBoard() ; 
	}
	
	private void determineBoardDisplaySize(int size) {
		dimension = (2*size)+1;
	    
	}
	
	private void fillEmptyBoard(){
		for (int i=0; i<dimension; i++){
			if (i % 2 == 0) {
				for(int j = 0 ; j < dimension ; j++) {
					textBoard[i][j] = '-' ; 
				}
			}
			else {
				for (int j = 0 ; j < dimension ; j++) {
					if (j % 2 == 0) {
						textBoard[i][j] = '|' ; 
					}
					else {
						textBoard[i][j] = ' ' ; 
					}
				}
			}		
		}
	}
	
	public void displayTextBoard() {
		for (int i = 0 ; i < dimension ; i++) {
			for (int j = 0 ; j < dimension ; j++) {
				System.out.print(textBoard[i][j]);
			}
			System.out.println() ;  
		}
	}
	
	/* (non-Javadoc)
	 * @see com.civica.grads.exercise3.interfaces.Renderer#render(com.civica.grads.exercise3.model.draughts.Board)
	 */
	@Override
	public void render(Board board) throws RenderException {
		
		BoardTile[][] boardTiles = board.getTiles();
		ArrayList<Counter> whiteCounters = board.getWhiteCounters() ; 
		ArrayList<Counter> blackCounters = board.getBlackCounters() ;
		
		
		

	}

	
	public static void main(String[] args) {
		Board board = new Board(8) ; 
		SystemOutRenderer test = new SystemOutRenderer(board) ; 

		test.displayTextBoard(); 
	}
}
