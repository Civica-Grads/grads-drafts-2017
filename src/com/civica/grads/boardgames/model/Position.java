/**
 * 
 */
package com.civica.grads.boardgames.model;

import java.io.IOException;
import java.io.OutputStream;

import com.civica.grads.boardgames.interfaces.Describable;

/**
 * @author Bruce.Mundin
 *
 */
public class Position implements Describable {
	
	private int x;
	private int y;
	
	public Position(int x, int y) {
		
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "Position [x=" + x + ", y=" + y + "]";
	}

	@Override
	public void describe(OutputStream out) throws IOException {
		
		out.write(this.toString().getBytes());
	}
	
	
	
}
