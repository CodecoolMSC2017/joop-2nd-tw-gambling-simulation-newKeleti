package com.codecool;

import java.util.ArrayList;
import java.text.DecimalFormat;

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

    private static DecimalFormat df2 = new DecimalFormat("##.##");

    public String numberOfNumbers(int[] numbers, int greens, int blacks, int reds) {
        float sums = (greens+blacks+reds);
        double onepercent = sums/ 100;
        String finalString = "";
        int[] blackarray = {2,4,6,8,10,11,13,15,17,20,22,24,26,28,29,31,33,35};
        int[] redarray = {1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36};
        int count = 0;

        finalString += "Number of generated numbers: ";
        finalString += "\n--- Greens --- > "+greens+"\t"+df2.format(greens / onepercent)+ "%";
        finalString += "\n0: "+numbers[0]+"\t\t\t"+df2.format(numbers[0] / onepercent) + "%";


        finalString += "\n\n--- Blacks --- > "+blacks+"\t"+df2.format(blacks / onepercent) + "%";
        for (int i = 0; i < numbers.length; i++) {
            if (count == blackarray.length) {
                count = 0;
            }
            if (i == blackarray[count]) {
                finalString += "\n"+i+". "+numbers[i]+"\t\t\t"+df2.format(numbers[i] / onepercent) +"%";
                count++;
            }
        }

        count = 0;
        finalString += "\n\n--- Reds --- > "+reds+"\t"+df2.format(reds / onepercent) + "%";
        for (int i = 0; i < numbers.length; i++) {
            if (count == redarray.length) {
                count = 0;
            }
            if (i == redarray[count]) {
                finalString += "\n"+i+". "+numbers[i]+"\t\t\t"+df2.format(numbers[i] / onepercent) +"%";
                count++;
            }
        }
        return finalString;
    }
    

    public String numberOfColors(int greens, int blacks, int reds) {
        float sums = (greens+blacks+reds);
        double onepercent = sums/ 100;
        double greenpercent= greens / onepercent;
        double blackpercent= blacks / onepercent;
        double redpercent= reds / onepercent;
        return "Number of generated numbers by colors:"
        +"\nGreens: "+greens+" which is "+df2.format(greenpercent)+"%"
        +"\nBlacks: "+blacks+" which is "+df2.format(blackpercent)+"%"
        +"\nReds: "+reds+" which is "+df2.format(redpercent)+"%";
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
        return "Number of odds: "+oddcount+" which is "+df2.format(oddcount/onepercent)+"%"
        +"\nNumber of evens: "+evencount+" which is "+df2.format(evencount/onepercent)+"%";
    }

    public String numberOfDozens(int[] numbers){
        int firstDozenCount=0;
        int secondDozenCount=0;
        int thirdDozenCount=0;
        for(int i = 1;i < 12;i++){
            firstDozenCount += numbers[i];
        }
        for(int i = 13;i < 24;i++){
            secondDozenCount += numbers[i];
        }
        for(int i = 25;i < 36;i++){
            thirdDozenCount += numbers[i];
        }
        float sumofnums = (firstDozenCount+secondDozenCount+thirdDozenCount);
        double onepercent = sumofnums / 100;
        return "Number of numbers in the First Dozen section: "+firstDozenCount+" which is "+df2.format(firstDozenCount/onepercent)+"%"+"\nNumber of numbers in the Second Dozen section: "+secondDozenCount+" which is "+df2.format(secondDozenCount/onepercent)+"%"+"\nNumber of numbers in the Third Dozen section: "+thirdDozenCount+" which is "+df2.format(thirdDozenCount/onepercent)+"%";
    }

    public String highsAndLows(int[] numbers){
        int highCount = 0;
        int lowCount = 0;
        for(int i = 1; i<18;i++){
            lowCount+=numbers[i];
        }
        for(int i = 19; i<36;i++){
            highCount+=numbers[i];
        }
        float sumofnums = (lowCount+highCount);
        double onepercent = sumofnums / 100;
        return "Number of numbers in the Low section: "+lowCount+" which is "+df2.format(lowCount/onepercent)+"%"+"\nNumber of numbers in the hight section: "+highCount+" which is "+df2.format(highCount/onepercent)+"%";
    }
}