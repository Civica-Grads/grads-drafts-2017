/**
 * 
 */
package com.civica.grads.boardgames.interfaces;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;

/**
 * @author Bruce.Mundin
 *
 */
public interface Storable extends Serializable{

	void save(InputStream sourceIs) throws IOException;
	void load(OutputStream sourceIs) throws IOException;
	
}
