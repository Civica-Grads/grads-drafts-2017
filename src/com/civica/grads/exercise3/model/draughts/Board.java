package com.civica.grads.exercise3.model.draughts;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

import com.civica.grads.exercise3.interfaces.Describable;

public class Board implements Describable {
	private final int size ; 
	private final BoardTile[][] tiles ; 
	private final ArrayList<Counter> whiteCounters = new ArrayList<Counter>() ; 
	private final ArrayList<Counter> blackCounters = new ArrayList<Counter>() ;
	
	public Board(int size) {
		this.size = size ; 
		tiles = new BoardTile[size][size] ;  
	}
	
	public int getSize() {
		return size;
	}

	public BoardTile[][] getTiles() {
		return tiles;
	}

	public ArrayList<Counter> getWhiteCounters() {
		return whiteCounters;
	}

	public ArrayList<Counter> getBlackCounters() {
		return blackCounters;
	}

	@Override
	public void describe(OutputStream out) throws IOException {
		out.write(this.toString().getBytes()) ;  
	}

	@Override
	public String toString() {
		return "Board [size=" + size + ", tiles=" + Arrays.toString(tiles) + ", whiteCounters=" + whiteCounters
				+ ", blackCounters=" + blackCounters + "]";
	}

	
	
}
 