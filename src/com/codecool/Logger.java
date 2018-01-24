package com.codecool;

import java.util.Scanner;

public class Logger {

    private String message;
    private long start, end;
    private Statistics stat = new Statistics();
    private int number;
    private int[] numbers;
    private Simulation sim = new Simulation();
    private int simulationNumber;

    public void logTimeTaken(String message, long start, long end) {
        System.out.println(stat.simulationTime(message, start, end));
    }

    public void simulationInit(int number) {
        System.out.println("Starting to generate "+number+" simulations.");
    }

    public void finalStats(int[] numbers, int greencount, int blackcount, int redcount) {
        System.out.print("Would you like to see detailed occurrence of each number by color? [Y/N]: ");
        Scanner scan = new Scanner(System.in);
        String loweredscan = scan.nextLine().toLowerCase();
        switch (loweredscan) {
            case "y": 
            System.out.println();
            System.out.println(stat.numberOfNumbers(numbers, greencount, blackcount, redcount));
            break;
            default: System.exit(0);
        }
    }

    public void numberOfSims(int simulationNumber) {
        System.out.println("Number of simulations considered in the statistics: "+simulationNumber);
    }

    public void finalColors(int greencount, int blackcount, int redcount) {
        System.out.println(stat.numberOfColors(greencount, blackcount, redcount));
    }

    public void evenOddCount(int[] numbers){
        System.out.println(stat.numberOfEvenOdd(numbers));
    }
}