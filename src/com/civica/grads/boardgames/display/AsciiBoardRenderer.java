package com.civica.grads.boardgames.display;

import java.io.PrintStream;
import com.civica.grads.boardgames.exceptions.RenderException;
import com.civica.grads.boardgames.interfaces.Renderer;
import com.civica.grads.boardgames.model.Board;

/**
 * 
 * @author localuser
 *
 */
public abstract class AsciiBoardRenderer implements Renderer {

	protected char[][] textBoard;
	protected int dimension;
	public final PrintStream out ;
	
    private static char UNICODE_LOWER_HALF_BLOCK = '\u2584' ; // Lower half block character.
    private static char UNICODE_UPPER_HALF_BLOCK = '\u2580' ; // Upper half block character.
    private static char UNICODE_FULL_BLOCK = '\u2588' ; // Full block character.
    private static int TILE_LENGTH = 5; // Character length of one tile
    private static int BORDER_LENGTH = 4; // Character spaces used up by border
    private static int OFFSET = 2; // offset of board from edge 
    private static int COEFF = 10; //How often the character pattern repeats 
    private static int ODD_RC_UL_CHARACTER_SHIFT = 4 ;// Odd row and column tile border(upper and left) j coordinate
    private static int ODD_RC_BR_CHARACTER_SHIFT = 8 ;// Odd row and column tile border(bottom and right) j coordinate
    private static int EVEN_RC_UL_CHARACTER_SHIFT = 3 ;// Even row and column tile border(upper and left) j coordinate
    private static int EVEN_RC_BR_CHARACTER_SHIFT = -1 ;// Even row and column tile border(bottom and right) j coordinate
    private static int INITIAL_INDEX = 6; // Starting index of tile border
    private static int ODD_SHIFT_START = -7;// Odd rows i coordinate
    private static int EVEN_SHIFT_START = -2;// Even rows i coordinate



	protected void determineBoardDisplaySize(int size) {
		dimension = (TILE_LENGTH*size)+BORDER_LENGTH;
		textBoard = new char[dimension][dimension];
	 }

	protected void fillEmptyBoard() {
		fillBoardBorder();
		fillBoardTiles();
	}
	/**
	 * Filling in border characters
	 */
	private void fillBoardBorder(){
		// Printing outer boarder.
		for(int i = 0 ; i < dimension ; i++) {
			for(int j = 0 ; j < dimension; j++) {
				textBoard[i][j] = ' ' ;
				//filling in first row of border characters
				if ((i == 0) ) {
					textBoard[i][j] = UNICODE_UPPER_HALF_BLOCK ; 
				}
				//filling in last row of border characters
				if ( i == dimension - 1)  {
					textBoard[i][j] =  UNICODE_LOWER_HALF_BLOCK ; 
				}
				//filling in first and last columns of border characters but not first row and last row
				if (((j == 0) || (j == dimension-1)) && (i != 0) && (i != dimension - 1)) {
					textBoard[i][j] = UNICODE_FULL_BLOCK; 
				} 
			}
		}
	}
	private boolean checkBlackCharacterColoumn(int index, int coef, int shift){
				boolean black =((index+shift)%coef)==0;
				return black;
	}
	private boolean checkBlackCharacterRow(int index, int coef, int shift){
		boolean black =((index+shift)%coef)<=(TILE_LENGTH-1);
		return black;
	}

	private void fillBoardTiles(){
		for(int i =OFFSET  ; i < dimension - OFFSET ; i++) {
			for(int j = 0 ; j < dimension - OFFSET ; j++) {
				if ((checkBlackCharacterColoumn(j, COEFF,ODD_RC_BR_CHARACTER_SHIFT) ||
					checkBlackCharacterColoumn(j, COEFF,ODD_RC_UL_CHARACTER_SHIFT)) && 
					checkBlackCharacterRow(i,COEFF, ODD_SHIFT_START)&& (i>INITIAL_INDEX)) {
						textBoard[j][i] = textBoard[i][j] =UNICODE_FULL_BLOCK ; 
				}
				if (((checkBlackCharacterColoumn(j, COEFF,EVEN_RC_BR_CHARACTER_SHIFT) ||
					checkBlackCharacterColoumn(j, COEFF,EVEN_RC_UL_CHARACTER_SHIFT))) && 
					checkBlackCharacterRow(i,COEFF, EVEN_SHIFT_START) && (j>INITIAL_INDEX)) {
                    	textBoard[j][i] = textBoard[i][j] = UNICODE_FULL_BLOCK ; 
                            
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
	public void render(Board board) throws RenderException {
		
		//FIXME No rendering
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

