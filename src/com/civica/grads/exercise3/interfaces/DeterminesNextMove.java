/**
 * 
 */
package com.civica.grads.exercise3.interfaces;

import com.civica.grads.exercise3.model.draughts.Board;
import com.civica.grads.exercise3.model.draughts.Move;

/**
 * This interface describes what happens when a board is evaluated.
 * @author Bruce.Mundin
 *
 */
public interface DeterminesNextMove {

	/**
	 * When the board needs to be evaluated to determine the next move, this method
	 * can be called.
	 * 
	 * @param board
	 * @return null when there is not a move.
	 */
	Move evaluate(Board board);
	
}
