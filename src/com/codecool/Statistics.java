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
        return "Number of generated numbers: "
        +"\n--- Greens --- > "+greens+"\t"+(int)Math.round(greens / onepercent) + "%"
        +"\n0: "+numbers[0]+"\t\t\t"+(int)Math.round((numbers[0] / onepercent)) +"%"
        +"\n\n--- Blacks --- > "+blacks+"\t"+(int)Math.round(blacks / onepercent) + "%"
        +"\n2: "+numbers[2]+"\t\t\t"+(int)Math.round((numbers[2] / onepercent)) +"%"
        +"\n4: "+numbers[4]+"\t\t\t"+(int)Math.round((numbers[4] / onepercent)) +"%"
        +"\n6: "+numbers[6]+"\t\t\t"+(int)Math.round((numbers[6] / onepercent)) +"%"
        +"\n8: "+numbers[8]+"\t\t\t"+(int)Math.round((numbers[8] / onepercent)) +"%"
        +"\n10: "+numbers[10]+"\t\t\t"+(int)Math.round((numbers[10] / onepercent)) +"%"
        +"\n11: "+numbers[11]+"\t\t\t"+(int)Math.round((numbers[11] / onepercent)) +"%"
        +"\n13: "+numbers[13]+"\t\t\t"+(int)Math.round((numbers[13] / onepercent)) +"%"
        +"\n15: "+numbers[15]+"\t\t\t"+(int)Math.round((numbers[15] / onepercent)) +"%"
        +"\n17: "+numbers[17]+"\t\t\t"+(int)Math.round((numbers[17] / onepercent)) +"%"
        +"\n20: "+numbers[20]+"\t\t\t"+(int)Math.round((numbers[20] / onepercent)) +"%"
        +"\n22: "+numbers[22]+"\t\t\t"+(int)Math.round((numbers[22] / onepercent)) +"%"
        +"\n24: "+numbers[24]+"\t\t\t"+(int)Math.round((numbers[24] / onepercent)) +"%"
        +"\n26: "+numbers[26]+"\t\t\t"+(int)Math.round((numbers[26] / onepercent)) +"%"
        +"\n28: "+numbers[28]+"\t\t\t"+(int)Math.round((numbers[28] / onepercent)) +"%"
        +"\n29: "+numbers[29]+"\t\t\t"+(int)Math.round((numbers[29] / onepercent)) +"%"
        +"\n31: "+numbers[31]+"\t\t\t"+(int)Math.round((numbers[31] / onepercent)) +"%"
        +"\n33: "+numbers[33]+"\t\t\t"+(int)Math.round((numbers[33] / onepercent)) +"%"
        +"\n35: "+numbers[35]+"\t\t\t"+(int)Math.round((numbers[35] / onepercent)) +"%"
        +"\n\n--- Reds --- > " +reds+"\t"+(int)Math.round(reds / onepercent) + "%"
        +"\n1: "+numbers[1]+"\t\t\t"+(int)Math.round((numbers[1] / onepercent)) +"%"
        +"\n3: "+numbers[3]+"\t\t\t"+(int)Math.round((numbers[3] / onepercent)) +"%"
        +"\n5: "+numbers[5]+"\t\t\t"+(int)Math.round((numbers[5] / onepercent)) +"%"
        +"\n7: "+numbers[7]+"\t\t\t"+(int)Math.round((numbers[7] / onepercent)) +"%"
        +"\n9: "+numbers[9]+"\t\t\t"+(int)Math.round((numbers[9] / onepercent)) +"%"
        +"\n12: "+numbers[12]+"\t\t\t"+(int)Math.round((numbers[12] / onepercent)) +"%"
        +"\n14: "+numbers[14]+"\t\t\t"+(int)Math.round((numbers[14] / onepercent)) +"%"
        +"\n16: "+numbers[16]+"\t\t\t"+(int)Math.round((numbers[16] / onepercent)) +"%"
        +"\n18: "+numbers[18]+"\t\t\t"+(int)Math.round((numbers[18] / onepercent)) +"%"
        +"\n19: "+numbers[19]+"\t\t\t"+(int)Math.round((numbers[19] / onepercent)) +"%"
        +"\n21: "+numbers[21]+"\t\t\t"+(int)Math.round((numbers[21] / onepercent)) +"%"
        +"\n23: "+numbers[23]+"\t\t\t"+(int)Math.round((numbers[23] / onepercent)) +"%"
        +"\n25: "+numbers[25]+"\t\t\t"+(int)Math.round((numbers[25] / onepercent)) +"%"
        +"\n27: "+numbers[27]+"\t\t\t"+(int)Math.round((numbers[27] / onepercent)) +"%"
        +"\n30: "+numbers[30]+"\t\t\t"+(int)Math.round((numbers[30] / onepercent)) +"%"
        +"\n32: "+numbers[32]+"\t\t\t"+(int)Math.round((numbers[32] / onepercent)) +"%"
        +"\n34: "+numbers[34]+"\t\t\t"+(int)Math.round((numbers[34] / onepercent)) +"%"
        +"\n36: "+numbers[36]+"\t\t\t"+(int)Math.round((numbers[36] / onepercent)) +"%";
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