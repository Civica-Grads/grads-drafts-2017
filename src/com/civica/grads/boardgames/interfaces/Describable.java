package com.civica.grads.boardgames.interfaces;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Describes the class as being one that will send information about its self to the outputstream.
 * @author Bruce.Mundin
 *
 */
public interface Describable {

	/**
	 * Sends a description of the class to the output stream.
	 * @param out where the data goes.
	 * @throws IOException
	 */
	void describe(OutputStream out) throws IOException;
	
}
