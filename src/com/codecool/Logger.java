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
    private Result res = new Result();

    public void logTimeTaken(String message, long start, long end) {
        System.out.println(stat.simulationTime(message, start, end)+"\n");
    }

    public void simulationInit(int number) {
        System.out.println("Starting to generate "+number+" simulations.");
    }

    public void finalStats(int[] numbers, int greencount, int blackcount, int redcount) {
            System.out.println(stat.numberOfNumbers(numbers, greencount, blackcount, redcount)+"\n");
            System.out.println("Betting on a single number gives you an 35-1 payout (pays your original bet PLUS 35 units)"+"\n");
    }
    

    public void numberOfSims(int simulationNumber) {
        System.out.println("Number of simulations considered in the statistics: "+simulationNumber+"\n");
    }

    public void finalColors(int greencount, int blackcount, int redcount) {
        System.out.println(stat.numberOfColors(greencount, blackcount, redcount)+"\n");
        System.out.println("Betting on colors gives you an 1:1 payout (pays your original bet PLUS 1 unit)"+"\n");
    }

    public void evenOddCount(int[] numbers){
        System.out.println(stat.numberOfEvenOdd(numbers)+"\n");
        System.out.println("Betting on Even or Odd numbers gives you an 1-1 payout (pays your original bet PLUS 1 unit)"+"\n");
    }

    public void dozenCounts(int[] numbers){
        System.out.println(stat.numberOfDozens(numbers,0,0,0)+"\n");
        System.out.println("Betting on the Dozen Zones gives you an 2-1 payout (pays your original bet PLUS 2 units)"+"\n");
    }

    public void highAndLow(int[] numbers){
        System.out.println(stat.highsAndLows(numbers,0,0)+"\n");
        System.out.println("Betting on the High or Low section gives you 1-1 payout (pays your original bet PLUS 1 unit)"+"\n");
    }

    public void columnCount(int[] numbers){
        System.out.println(stat.columns(numbers,0,0,0)+"\n");
        System.out.println("Betting on any of the columns will give you an 2-1 payout (pays your original bet PLUS 2 units)"+"\n");
    }

    public void splitCount(int[] numbers) {
        System.out.println(stat.splits(numbers)+"\n");
        System.out.println("Betting on any split will give you an 17-1 payout (pays your original bet PLUS 17 units)"+"\n");
    }

    public void bestColor(int blackcount, int greencount,int redcount){
        System.out.println(res.getBestColor(blackcount, greencount, redcount));
    }

    public void bestNumber(int[] numbers){
        System.out.println(res.getBestNumber(numbers));
    }

    public void bestDozen(int firstDozenCount,int secondDozenCount,int thirdDozenCount){
        System.out.println(res.getBestDozen(firstDozenCount, secondDozenCount, thirdDozenCount));
    }

    public void bestSection(int highCount,int lowCount){
        System.out.println(res.highOrLow(lowCount, highCount));
    }

    public void handleStatMenu(int simulationNumber, int greencount, int blackcount, int redcount,int[] numbers) {
        String[] menupoints = {"Number of all simulations", "Number of colors","Number of Evens and Odds","Detailed Statistics By Colors","Dozen zones statistics","Numbers in the Low and High areas","Column bet statistics", "Split statistics"};
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
                    case 5: dozenCounts(numbers);
                    break;
                    case 6: highAndLow(numbers);
                    break;
                    case 7: columnCount(numbers);
                    break;
                    case 8: splitCount(numbers);
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

    public void handleMainMenu(int simulationNumber, int greencount, int blackcount, int redcount,int[] numbers){
        String[] menupoints = {"Statistics","Results"};
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
                switch (menuChoice){
                    case 1: handleStatMenu((greencount+blackcount+redcount), greencount, blackcount, redcount,numbers);
                    break;
                    case 2:handleResultMenu(greencount, blackcount, redcount, numbers);
                    break;
                    case 0: System.exit(0);
                    break;
                }
    }catch(NumberFormatException e){
        System.out.println("Please enter a valid menupoint.\n");
            }   

        }
    
    }

    public void handleResultMenu(int greencount, int blackcount, int redcount,int[] numbers) {
        String[] menupoints = {"Best color to bet", "Best number to bet","Best dozen to bet","Best Zone to bet",};
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
                    case 1: bestColor(blackcount, greencount, redcount);
                    break;
                    case 2: bestNumber(numbers);
                    break;
                    case 3:
                    stat.numberOfDozens(numbers,0,0,0);
                    int firstDozenCount = stat.getFirstDozen();
                    int secondDozenCount = stat.getSecondDozen();
                    int thirdDozenCount = stat.getThirdDozen(); 
                    bestDozen(firstDozenCount, secondDozenCount, thirdDozenCount);
                    break;
                    case 4: 
                    stat.highsAndLows(numbers,0,0);
                    int highCount = stat.getHighCount();
                    int lowCount = stat.getLowCount();
                    bestSection(highCount, lowCount);
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