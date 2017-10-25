/**
 * 
 */
package com.civica.grads.boardgames.display;

import com.civica.grads.boardgames.exceptions.GameSetupException;
import com.civica.grads.boardgames.exceptions.RenderException;
import com.civica.grads.boardgames.interfaces.Renderer;
import com.civica.grads.boardgames.model.Board;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/**
 * @author Bruce.Mundin
 *
 */
public class StringBufferBoardRenderer implements Renderer
{
    private final ByteArrayOutputStream baos = new ByteArrayOutputStream();
    private final Renderer parentRenderer ;
    
    public StringBufferBoardRenderer() throws GameSetupException {
        
        try {
            PrintStream ps = new PrintStream(baos, true, "utf-8");
            this.parentRenderer = new AsciiBoardRenderer(ps);
        } catch (UnsupportedEncodingException ex) {
            throw new GameSetupException("Unable to set up the rendered.",ex);
        }

    }

    @Override
    public void render(Board board) throws RenderException {
        this.parentRenderer.render(board);
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        String content = asString();
        return "StringBufferBoardRenderer [" + content + "]";
    }

    public String asString() {
        return new String(baos.toByteArray(), StandardCharsets.UTF_8);
    }
    
    
    
}
