package com.codecool;

public class Main {
    public static void main(String[] args) {
        int green = 0;
        int[] blacks = {2,4,6,8,10,11,13,15,17,20,22,24,26,28,29,31,33,35};
        int[] reds = {1,3,5,7,9,12,14,16,18,21,23,25,27,28,30,32,34,36};
        int count = 1;
        int redcount = 0;
        int greencount = 0;
        int blackcount = 0;
        while (count <= Integer.parseInt(args[0])) {
            Simulator sim = new Simulator(0, blacks, reds);
            if (sim.getSim().contains("Black")) {
                blackcount++;
            } else if (sim.getSim().equals("Green: 0")) {
                greencount++;
            } else {
                redcount++;
            }
            count++;
        }
        System.out.println("Blacks: "+blackcount+"\nReds: "+redcount+"\nGreens: "+greencount);
    }
}