package com.civica.grads.boardgames.display;

import java.io.PrintStream;
import java.util.ArrayList;

import org.junit.Ignore;

import com.civica.grads.boardgames.interfaces.Renderer;
import com.civica.grads.boardgames.model.Board;
import com.civica.grads.boardgames.model.BoardTile;
import com.civica.grads.boardgames.model.Counter;

public abstract class AsciiBoardRenderer implements Renderer {

	protected char[][] textBoard;
	protected int dimension;
	public final PrintStream out ;
	


	protected void determineBoardDisplaySize(int size) {
		dimension = (5*size)+4;
		textBoard = new char[dimension][dimension];
	 }

	protected void fillEmptyBoard() {
		fillBoardBorder();
		fillBoardTiles();
	}

	private void fillBoardBorder(){
		// Printing outer boarder.
		for(int i = 0 ; i < dimension ; i++) {
			for(int j = 0 ; j < dimension; j++) {
				textBoard[i][j] = ' ' ;
				if ((i == 0) ) {
					textBoard[i][j] = '▄' ; 
				}
				if ( i == dimension - 1)  {
					textBoard[i][j] = '▀' ; 
				}
				if (((j == 0) || (j == dimension-1)) && (i != 0) && (i != dimension - 1)) {
					textBoard[i][j] = '█' ; 
				} 
			}
		}
	}
	private void fillBoardTiles(){
		for(int i =2  ; i < dimension - 2 ; i++) {
			for(int j = 0 ; j < dimension - 2 ; j++) {
				if ( (((j+8)%10 == 0)||((j+4)%10 ==0)) && ((i-7)%10 <=4) && (i>6)) {
                    textBoard[j][i] = '█' ; 
				}
				if ( (((j+3)%10 == 0)||((j-1)%10 ==0)) && ((i-2)%10 <=4) && (j>6)) {
                    textBoard[j][i] = '█' ; 
                
				}
				if ( (((j+8)%10 == 0)||((j+4)%10 ==0)) && ((i-7)%10 <=4) && (i>6)) {
                    textBoard[i][j] = '█' ; 
				}
				if ( (((j+3)%10 == 0)||((j-1)%10 ==0)) && ((i-2)%10 <=4) && (j>6)) {
                    textBoard[i][j] = '█' ; 
                
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

	public AsciiBoardRenderer(PrintStream out, Board board) {
		
		this(out);
		
		determineBoardDisplaySize(board.getSize()) ; 
		textBoard = new char[dimension][dimension] ; 
		fillEmptyBoard() ; 
	}

	protected final PrintStream getOut() {
		return out;
	}

}

