package com.codecool;

import java.util.ArrayList;

public class Statistics {

    ArrayList<String> list;
    long start, end;
    int[] numbers;

    public String allSimulation(ArrayList<String> list) {
        return "Number of all simulations considered in the statistics: "+Integer.toString(list.size());
    }

    public String simulationTime(long start, long end) {
        return "The time it took to run all the simulations: "+(end-start)+" ms.";
    }

    public String numberOfNumbers(int[] numbers) {
        return "Number of generated numbers: "
        +"\n0: "+numbers[0]
        +"\n1: "+numbers[1]
        +"\n2: "+numbers[2]
        +"\n3: "+numbers[3]
        +"\n4: "+numbers[4]
        +"\n5: "+numbers[5]
        +"\n6: "+numbers[6]
        +"\n7: "+numbers[7]
        +"\n8: "+numbers[8]
        +"\n9: "+numbers[9]
        +"\n10: "+numbers[10]
        +"\n11: "+numbers[11]
        +"\n12: "+numbers[12]
        +"\n13: "+numbers[13]
        +"\n14: "+numbers[14]
        +"\n15: "+numbers[15]
        +"\n16: "+numbers[16]
        +"\n17: "+numbers[17]
        +"\n18: "+numbers[18]
        +"\n19: "+numbers[19]
        +"\n20: "+numbers[20]
        +"\n21: "+numbers[21]
        +"\n22: "+numbers[22]
        +"\n23: "+numbers[23]
        +"\n24: "+numbers[24]
        +"\n25: "+numbers[25]
        +"\n26: "+numbers[26]
        +"\n27: "+numbers[27]
        +"\n28: "+numbers[28]
        +"\n29: "+numbers[29]
        +"\n30: "+numbers[30]
        +"\n31: "+numbers[31]
        +"\n32: "+numbers[32]
        +"\n33: "+numbers[33]
        +"\n34: "+numbers[34]
        +"\n35: "+numbers[35]
        +"\n36: "+numbers[36];
    }
}