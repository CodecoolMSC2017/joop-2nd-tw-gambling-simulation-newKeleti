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
        return "Number of generated numbers: "
        +"\n--- Greens --- > "+greens
        +"\n0: "+numbers[0]
        +"\n--- Blacks --- > "+blacks
        +"\n2: "+numbers[2]
        +"\n4: "+numbers[4]
        +"\n6: "+numbers[6]
        +"\n8: "+numbers[8]
        +"\n10: "+numbers[10]
        +"\n11: "+numbers[11]
        +"\n13: "+numbers[13]
        +"\n15: "+numbers[15]
        +"\n17: "+numbers[17]
        +"\n20: "+numbers[20]
        +"\n22: "+numbers[22]
        +"\n24: "+numbers[24]
        +"\n26: "+numbers[26]
        +"\n28: "+numbers[28]
        +"\n29: "+numbers[29]
        +"\n31: "+numbers[31]
        +"\n33: "+numbers[33]
        +"\n35: "+numbers[35]
        +"\n--- Reds --- > " +reds
        +"\n1: "+numbers[1]
        +"\n3: "+numbers[3]
        +"\n5: "+numbers[5]
        +"\n7: "+numbers[7]
        +"\n9: "+numbers[9]
        +"\n12: "+numbers[12]
        +"\n14: "+numbers[14]
        +"\n16: "+numbers[16]
        +"\n18: "+numbers[18]
        +"\n19: "+numbers[19]
        +"\n21: "+numbers[21]
        +"\n23: "+numbers[23]
        +"\n25: "+numbers[25]
        +"\n27: "+numbers[27]
        +"\n30: "+numbers[30]
        +"\n32: "+numbers[32]
        +"\n34: "+numbers[34]
        +"\n36: "+numbers[36];
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
        return "Number of odds: "+oddcount+"\nNumber of evens: "+evencount;
    }
}