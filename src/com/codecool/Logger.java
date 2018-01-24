package com.codecool;

import java.util.*;

public class Logger {

    private String message;
    private long start, end;
    private Statistics stat = new Statistics();
    private int number;
    private int[] numbers;
    private Simulation sim = new Simulation();
    private int simulationNumber;

    public void logTimeTaken(String message, long start, long end) {
        System.out.println(stat.simulationTime(message, start, end)+"\n");
    }

    public void simulationInit(int number) {
        System.out.println("Starting to generate "+number+" simulations.");
    }

    public void finalStats(int[] numbers, int greencount, int blackcount, int redcount) {
            System.out.println(stat.numberOfNumbers(numbers, greencount, blackcount, redcount)+"\n");
    }
    

    public void numberOfSims(int simulationNumber) {
        System.out.println("Number of simulations considered in the statistics: "+simulationNumber+"\n");
    }

    public void finalColors(int greencount, int blackcount, int redcount) {
        System.out.println(stat.numberOfColors(greencount, blackcount, redcount)+"\n");
    }

    public void evenOddCount(int[] numbers){
        System.out.println(stat.numberOfEvenOdd(numbers)+"\n");
    }

    
    public void handleMenu(int simulationNumber, int greencount, int blackcount, int redcount,int[] numbers) {
        String[] menupoints = {"Number of all simulations", "Number of colors","Number of Evens and Odds","Detailed Statistics By Colors"};
        int menuChoice = 0;
        Scanner scan = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("--- Main menu ---");
            for (int i = 0; i < menupoints.length; i++) {
                System.out.println("("+(i+1)+"). "+menupoints[i]);
            }
            System.out.println("(0). Exit");
            System.out.print("\nSelect statistic: ");

            try {
                menuChoice = Integer.parseInt(scan.nextLine());    
                switch (menuChoice) {
                    case 1: numberOfSims(simulationNumber);
                    break;
                    case 2: finalColors(greencount, blackcount, redcount);
                    break;
                    case 3: evenOddCount(numbers);
                    break;
                    case 4: finalStats(numbers, greencount, blackcount, redcount);
                    break;
                    case 0: System.exit(0);
                    break;
                    default: System.out.println("Please enter a valid menupoint.\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid menupoint.\n");
            }
        }
    }
}