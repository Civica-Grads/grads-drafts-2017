package com.civica.grads.boardgames.exceptions;

public class GameSetupException extends GameException {

    /**
     * Default
     */
    private static final long serialVersionUID = 1L;

    public GameSetupException(String message) {
        super(message);
    }

    public GameSetupException(String message, Throwable cause) {
        super(message, cause);
    }

}
