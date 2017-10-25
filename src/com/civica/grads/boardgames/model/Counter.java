package com.civica.grads.boardgames.model;

import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicInteger;

import com.civica.grads.boardgames.enums.Colour;
import com.civica.grads.boardgames.enums.*;
import com.civica.grads.boardgames.interfaces.Describable;


public class Counter extends Piece implements Describable {
	 
	private CounterType type ; 
	private final int key ; //Assign each counter a number (key) from 1 to (size-2)*size/2
	
	private static final AtomicInteger counterKeygen = new AtomicInteger();
	

    /**
     * Constructor
     * @param colour
     * @param type
     * @param key
     */
    public Counter(Colour colour) 
        {
        this(colour,CounterType.NORMAL,counterKeygen.getAndIncrement()); 
        }

    /**
     * Constructor
     * @param colour
     * @param type
     * @param key
     */
    public Counter(Colour colour, int key) 
        {
        this(colour,CounterType.NORMAL,key); 
        }
        
	/**
	 * Constructor
	 * @param colour
	 * @param type
	 * @param key
	 */
	public Counter(Colour colour, CounterType type, int key) {
		super(colour);
		this.type = type ; 
		this.key = key; 
	}

	/**
	 * Returns enum counter type
	 * @return NORMAL or KING
	 */
	public CounterType getType() {
		return type;
	}


	/**
	 * Assigns enum type to counter
	 * @param type NORMAL or KING
	 */
	public void setType(CounterType type) {
		this.type = type;
	}
	
	/**
	 * Retrieves counter ID
	 * @return key / ID
	 */
	public int getKey() {
		return key;
	}



	@Override
	public void describe(OutputStream out) throws IOException {
		out.write(this.toString().getBytes()) ;  
	}


	@Override
	/**
	 * Returns counter properties as a single string
	 */
	public String toString() {
		return "Counter [type=" + type + ", key=" + key + "]";
	}




	
}
