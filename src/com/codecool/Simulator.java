package com.codecool;

import java.util.Random;

public class Simulator {
    
    int green = 0;
    int[] blacks = {2,4,6,8,10,11,13,15,17,20,22,24,26,28,29,31,33,35};
    int[] reds = {1,3,5,7,9,12,14,16,18,21,23,25,27,28,30,32,34,36};
    int winnernum;
    String winnerCol;

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
        return winnerCol + ": "+winnernum;
    }

}