package com.codecool;

import java.util.Random;

public class Simulator {
    
    protected int green;
    protected int[] blacks;
    protected int[] reds;
    protected int winnernum;
    protected String winnerCol;

    public Simulator(int green, int[] blacks, int[] reds) {
        Random rand = new Random();
        int ran = rand.nextInt(100);

        if (ran < 50) {
            ran = rand.nextInt(18);
            winnernum = blacks[ran];
            winnerCol = "Black";
        }
        else if (ran == 50) {
            winnernum = green;
            winnerCol = "Green";
        } else {
            ran = rand.nextInt(18);
            winnernum = reds[ran];
            winnerCol = "Red";
        }
    }

    public String getSim() {
        return winnerCol+","+winnernum;
    }

}