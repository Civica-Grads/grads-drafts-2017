package com.civica.grads.boardgames.display;

import com.civica.grads.boardgames.enums.Colour;
import com.civica.grads.boardgames.model.Board;
import com.civica.grads.boardgames.model.Counter;
import com.civica.grads.boardgames.model.Piece;

public class AsciiBoardRendererTest {

	public static Board createIniitialBoard() {
		
		Colour b = Colour.BLACK;
		Colour w = Colour.WHITE;
		int i = 0;
		
		Piece[][] startBoard = {
				{null, new Counter(w, i++), null, new Counter(w, i++), null, new Counter(w, i++), null, new Counter(w, i++)}, 
				{new Counter(w, i++), null, new Counter(w, i++), null, new Counter(w, i++), null, new Counter(w, i++), null}, 
				{null, new Counter(w, i++), null, new Counter(w, i++), null, new Counter(w, i++), null, new Counter(w, i++)}, 
				{null, null,null, null,null, null,null, null},
				{null, null,null, null,null, null,null, null}, 
				{new Counter(b, i++), null,new Counter(b, i++), null,new Counter(b, i++), null,new Counter(b, i++), null},
				{null, new Counter(b, i++), null,new Counter(b, i++), null,new Counter(b, i++), null,new Counter(b, i++)}, 
				{new Counter(b, i++), null,new Counter(b, i++), null,new Counter(b, i++), null,new Counter(b, i++), null}
								
		};
		
		Board start = new Board(startBoard);
		
		return start;
		
		
	}
	
}
