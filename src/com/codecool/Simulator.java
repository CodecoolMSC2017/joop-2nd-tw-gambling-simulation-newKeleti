package com.codecool;

import java.util.Random;

public class Simulator {
    
    private int green;
    private int[] blacks;
    private int[] reds;
    private int winnernum;
    private String winnerCol;

    public Simulator(int green, int[] blacks, int[] reds) {
        Random rand = new Random();
        int ran = rand.nextInt(38);

        if (ran > 0 && ran < 17) {
            ran = rand.nextInt(18);
            winnernum = blacks[ran];
            winnerCol = "Black";
        }
        else if (ran == 0) {
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