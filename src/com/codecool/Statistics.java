package com.codecool;

import java.util.ArrayList;

public class Statistics {

    private ArrayList<String> list;
    private long start, end;
    private int[] numbers;
    private String message;
    private int blacks, reds, greens;

    public String allSimulation(ArrayList<String> list) {
        return "Number of all simulations considered in the statistics: "+Integer.toString(list.size());
    }

    public String simulationTime(String message, long start, long end) {
        return message+" "+(end-start)+" ms.";
    }

    public String numberOfNumbers(int[] numbers, int greens, int blacks, int reds) {
        float sums = (greens+blacks+reds);
        double onepercent = sums/ 100;
        String finalStr = "";
        finalStr += "Number of generated numbers: ";
        finalStr += "\n--- Greens --- > "+greens+"\t"+(int)Math.round(greens / onepercent) + "%";
        finalStr += "\n0: "+numbers[0]+"\t\t\t"+(int)Math.round((numbers[0] / onepercent)) + "%";
        finalStr += "\n\n--- Blacks --- > "+blacks+"\t"+(int)Math.round(blacks / onepercent) + "%";
        for (int i = 1; i < numbers.length; i+=2) {
            finalStr += "\n"+i+": "+numbers[i]+"\t\t\t"+(int)Math.round((numbers[i] / onepercent)) +"%";
        }
        finalStr += "\n\n--- Reds --- > " +reds+"\t"+(int)Math.round(reds / onepercent) + "%";
        for (int i = 2; i < numbers.length; i+=2) {
            finalStr += "\n"+i+": "+numbers[i]+"\t\t\t"+(int)Math.round((numbers[i] / onepercent)) +"%";
        }
        return finalStr;
    }

    public String numberOfColors(int greens, int blacks, int reds) {
        float sums = (greens+blacks+reds);
        double onepercent = sums/ 100;
        double greenpercent= greens / onepercent;
        double blackpercent= blacks / onepercent;
        double redpercent= reds / onepercent;
        return "Number of generated numbers by colors:"
        +"\nGreens: "+greens+" which is "+(int)Math.round(greenpercent)+"%"
        +"\nBlacks: "+blacks+" which is "+(int)Math.round(blackpercent)+"%"
        +"\nReds: "+reds+" which is "+(int)Math.round(redpercent)+"%";
    }

    public String numberOfEvenOdd(int[] numbers){
        int evencount = 0;
        int oddcount = 0;
        for (int i = 1; i <numbers.length; i++){
            if (i%2==0){
                evencount+=numbers[i];
            }else{
            oddcount+=numbers[i];
        }
    }
        float sums = (evencount + oddcount);
        double onepercent = sums / 100;
        return "Number of odds: "+oddcount+" which is "+(int)Math.round(oddcount/onepercent)+"%"
        +"\nNumber of evens: "+evencount+" which is "+(int)Math.round(evencount/onepercent)+"%";
    }
}