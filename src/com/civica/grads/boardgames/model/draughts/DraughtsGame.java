/**
 * Copyri
 */
package com.civica.grads.boardgames.model.draughts;

import com.civica.grads.boardgames.enums.Colour;
import com.civica.grads.boardgames.enums.CounterType;
import com.civica.grads.boardgames.exceptions.NoPieceException;
import com.civica.grads.boardgames.exceptions.GameException;
import com.civica.grads.boardgames.exceptions.GameSetupException;
import com.civica.grads.boardgames.interfaces.Move;
import com.civica.grads.boardgames.model.Counter;
import com.civica.grads.boardgames.model.Game;
import com.civica.grads.boardgames.model.MoveRecord;
import com.civica.grads.boardgames.model.Position;
import com.civica.grads.boardgames.model.player.Player;

public class DraughtsGame extends Game {

    /**
     * This is an incrementing key value.
     */
    private int uniqueCounterKey;

    /** This is the size of a Draughts board */
    public static final int BRAZILIAN_BOARD_SIZE = 8;
    public static final int INTRERNALIONAL_BOARD_SIZE = 10;
    public static final int CANADIAN_BOARD_SIZE = 12;

    public enum BoardType {

        BRAZILIAN(BRAZILIAN_BOARD_SIZE), INTERNATIONAL(INTRERNALIONAL_BOARD_SIZE), CANADIAN(CANADIAN_BOARD_SIZE);

        private final int size;

        private BoardType(int size) {
            this.size = size;
        }

        public int getBoardSize() {
            return this.size;
        }
    }

    /**
     * Constructor with the default board size
     * 
     * @param player
     *            Game players
     * @throws GameException 
     */
    public DraughtsGame(Player[] player) throws GameException {
        this(BoardType.INTERNATIONAL, player);
    }

    public DraughtsGame(BoardType boardType, Player[] player) throws GameException {
        this(boardType.getBoardSize(), player);
    }

    /**
     * Constructor with custom board size
     * 
     * @param size
     *            Board size
     * @param player
     *            Game players
     * @throws GameException 
     */
    DraughtsGame(int size, Player[] players) throws GameException {
        super(size, players);
        uniqueCounterKey = 0;

        // Bounds check for the number of players
        if ( players.length != 2 )
        {
            throw new GameSetupException("Number of players should be 2."); 
        }
        
    }

    /**
     * This method initially populates the board with counters, having a Counter
     * object on a set position an null if there isn't one. It loops from the
     * top left and adds a white counter on every other tile from the second one
     * (so odd numbered tile starting at 0). It then does the loop again from
     * the bottom right filling the bottom half of the board with black
     * counters. It leaves a space in the middle so counters can move.
     * @throws GameException 
     */
    @Override
    protected void initialiseBoardForGame() throws GameException {

        int boardSize = board.getSize();

        // true if tile should start with a counter on it
        boolean isStartTile;

        /*
         * This equation works out how many counters the game should have
         * depending on the size, according to standard draughts rules.
         */
        int initialTotalCounters = (boardSize - 2) * (boardSize / 2);
        int whiteCountersLeft = initialTotalCounters / 2;
        int blackCountersLeft = initialTotalCounters / 2;

        //This is the for loop for the white counters.
        for (int i = 0; i < boardSize/2 - 1; i++) {
            for (int j = 0; j < boardSize; j++) {

                /*
                 * Adds the current i and j values, then divides by 2 and if
                 * there's a remainder then it is odd. Tiles only get a counter
                 * if it's an odd value.
                 */
                isStartTile = (i + j) % 2 == 1;

                if (isStartTile) {
                	getBoard().placePiece(new Counter(Colour.WHITE, CounterType.NORMAL, uniqueCounterKey++), 
                			new Position(j, i));

                    whiteCountersLeft--;
                } else {
                    getBoard().placePiece(null , new Position(j, i));
                }
            }
            if (whiteCountersLeft <= 0) {
                break;
            }
        }

        //This is the for loop for the black counters
        for (int i = boardSize/2 + 1; i < boardSize - 1 ; i++) {
            for (int j = boardSize/2 + 1; j < boardSize - 1 ; j++) {

                /*
                 * Adds the current i and j values, then divides by 2 and if
                 * there's a remainder then it is odd. Tiles only get a counter
                 * if it's an odd value.
                 */
                isStartTile = (i + j) % 2 == 1;

                if (isStartTile) {
                	getBoard().placePiece(new Counter(Colour.BLACK, CounterType.NORMAL, uniqueCounterKey++), 
                			new Position(j, i));

                    blackCountersLeft--;
                } else {
                	getBoard().placePiece(null , new Position(j, i));
                }
            }
            if (blackCountersLeft <= 0) {
                break;
            }
        }
    }

    /**
     * Instantiates a counter Used for initializing the board
     * 
     * @param counter
     * @param colour
     */
    private void createNewCounterAndPlace(Counter counter, Colour colour) {
        counter = new Counter(colour, CounterType.NORMAL, uniqueCounterKey++);
    }

    // TODO: Either check valid move (R&P) before calling this or at the start!

    /**
     * Moves piece from its origin to a new position if the move is legal
     * Validation takes place elsewhere Hence, no guarantee that the piece will
     * actually move to new position
     * 
     * @param move
     *            Object implementing Move interface
     */
    public void applyMove(MoveRecord move) throws GameException {
        Position start = move.getPositionStart();
        Position end = move.getPositionFinish();

        board.placePiece(board.getAndRemovePiece(start), end);
    }

    public void removeCounter(Position position) {
        board.getBoard()[position.getX()][position.getY()] = null;
    }

    /**
     * This method checks the board size and throws an exception if the size is
     * inappropriate
     * 
     * @param size
     *            is of type int
     * @throws IllegalArgumentException
     *             if board size is wrong
     */
    protected void checkBoardSizeValue(int size) throws GameSetupException 
    {

        boolean found = false;
        for (BoardType type : BoardType.values()) {
            if (type.getBoardSize() == size) {
                found = true;
                break;
            }
        }

        if (!found) {
            throw new GameSetupException("Board size is incorrect.");
        }
    }

    /**
     * This method simply removes a piece from the board. If there is no piece
     * on the tile, throws an exception.
     * 
     * @Override
     */
    public void takePiece(Position position) throws NoPieceException {

        if (board.getBoard()[position.getY()][position.getX()] == null) {
            throw new NoPieceException("Trying to remove a piece from a tile where one does not exist.");
        } else {
            board.getBoard()[position.getY()][position.getX()] = null;
        }

        return;
    }

}
