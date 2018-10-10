package edu.up.cs301.pig;

import edu.up.cs301.game.infoMsg.GameState;

public class PigGameState extends GameState {
    private int id;
    private int score0;
    private int score1;
    private int runTotal;
    private int dieVal;

    public PigGameState()
    {
        id = 0;
        score0 = 0;
        score1 = 0;
        runTotal = 0;
        dieVal = 0;
    }

    public PigGameState(PigGameState p)
    {
        id = p.getId();
        score0 = p.getScore0();
        score1 = p.getScore1();
        runTotal = p.getRunTotal();
        dieVal = p.getDieVal();
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore0()
    {
        return score0;
    }

    public void setScore0(int s) {
        this.score0 = s;
    }

    public int getScore1()
    {
        return score1;
    }

    public void setScore1(int s) {
        this.score1 = s;
    }

    public int getRunTotal() {
        return runTotal;
    }

    public void setRunTotal(int r) {
        this.runTotal = r;
    }

    public int getDieVal() {
        return dieVal;
    }

    public void setDieVal(int d) {
        this.dieVal = d;
    }
}
