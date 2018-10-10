package edu.up.cs301.pig;

import edu.up.cs301.game.GamePlayer;
import edu.up.cs301.game.LocalGame;
import edu.up.cs301.game.actionMsg.GameAction;
import edu.up.cs301.game.infoMsg.GameState;

import android.util.Log;

/**
 * class PigLocalGame controls the play of the game
 *
 * @author Andrew M. Nuxoll, modified by Steven R. Vegdahl
 * @version February 2016
 */
public class PigLocalGame extends LocalGame {
    private int turn;
    private int p0;
    private int p1;
    private int rt;
    private int die;
    /**
     * This ctor creates a new game state
     */
    public PigLocalGame() {
        PigGameState pg = new PigGameState();
        turn = 0;
        p0 = pg.getScore0();
        p1 = pg.getScore1();
        rt = pg.getRunTotal();
        die = pg.getDieVal();
    }

    /**
     * can the player with the given id take an action right now?
     */
    @Override
    protected boolean canMove(int playerIdx) {
        if(playerIdx == turn){
            return true;
        }
        return false;
    }

    /**
     * This method is called when a new action arrives from a player
     *
     * @return true if the action was taken or false if the action was invalid/illegal.
     */
    @Override
    protected boolean makeMove(GameAction action) {
        /**stub**/
        return false;
    }//makeMove

    /**
     * send the updated state to a given player
     */
    @Override
    protected void sendUpdatedStateTo(GamePlayer p) {
        //TODO  You will implement this method
    }//sendUpdatedSate

    /**
     * Check if the game is over
     *
     * @return
     * 		a message that tells who has won the game, or null if the
     * 		game is not over
     */
    @Override
    protected String checkIfGameOver() {
        if(p0 == 100) {
            return "Player 1 wins";
        }
        else if(p1 == 100) {
            return "Player 2 wins";
        }
        else {
            return null;
        }
    }

}// class PigLocalGame
