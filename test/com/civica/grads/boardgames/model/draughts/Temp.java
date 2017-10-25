package com.civica.grads.boardgames.model.draughts;

import static org.mockito.Mockito.mock;

import com.civica.grads.boardgames.exceptions.GameSetupException;
import com.civica.grads.boardgames.model.player.Player;

public class Temp {

    public static void main(String[] args)  {
        
        System.out.println("Running");
        
        try {
            // WITH
            Player[] tooFewPlayers = {
                mock(Player.class),
                    mock(Player.class)
            };
            
            DraughtsGame game = new DraughtsGame(tooFewPlayers);
            
        } catch (GameSetupException ex) {
            // Log the error
            System.err.println("Bad thing happened at start up:"+ex.getMessage());
        } catch(Exception ex)
        {
            ex.printStackTrace();
        } finally
        {
            System.out.println("All done.");
        }
        
    }

}
