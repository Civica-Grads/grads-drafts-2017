package com.civica.grads.boardgames.display;

import java.io.PrintStream;
import java.util.ArrayList;

import org.junit.Ignore;

import com.civica.grads.boardgames.interfaces.Renderer;
import com.civica.grads.boardgames.model.Board;
import com.civica.grads.boardgames.model.BoardTile;
import com.civica.grads.boardgames.model.Counter;

public class AsciiBoardRenderer implements Renderer {

	protected char[][] textBoard;
	protected int dimension;
	public final PrintStream out ;
	


	protected void determineBoardDisplaySize(int size) {
		dimension = (2*size)+1;
	    
	}

	protected void fillEmptyBoard() {
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
				getOut().print(textBoard[i][j]);
			}
			getOut().println() ;  
		}
	}

	@Override
	@Ignore
	public void render(Board board) throws RenderException {
		
//		BoardTile[][] boardTiles = board.getTiles();
//		ArrayList<Counter> whiteCounters = board.getWhiteCounters() ; 
//		ArrayList<Counter> blackCounters = board.getBlackCounters() ;
//		
		
		
	
	}

	public AsciiBoardRenderer(PrintStream out) {
		super();
		this.out = out ;
	}

	public AsciiBoardRenderer(PrintStream out,Board board) {
		
		this(out);
		
		determineBoardDisplaySize(board.getSize()) ; 
		textBoard = new char[dimension][dimension] ; 
		fillEmptyBoard() ; 
	}

	protected final PrintStream getOut() {
		return out;
	}

	
}