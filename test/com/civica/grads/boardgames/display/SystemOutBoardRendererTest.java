/**
 * 
 */
package com.civica.grads.boardgames.display;

import static org.junit.Assert.*;

import com.civica.grads.boardgames.exceptions.RenderException;
import com.civica.grads.boardgames.interfaces.Renderer;
import com.civica.grads.boardgames.model.Board;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Bruce.Mundin
 *
 */
public class SystemOutBoardRendererTest {

 

    @Test
    public void test() throws RenderException {
        Board board = new Board(8) ; 
        Renderer renderer = new SystemOutBoardRenderer() ; 
    
        renderer.render(board); 
    }

}
