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

    public String columns(int[]numbers){
        int firstColumnCount=0;
        int secondColumnCount=0;
        int thirdColumnCount=0;
        for(int i = 1;i< 34; i+=3){
            firstColumnCount+=numbers[i];
        }
        for(int i = 2;i< 35; i+=3){
            secondColumnCount+=numbers[i];
        }
        for(int i = 3;i< 36; i+=3){
            thirdColumnCount+=numbers[i];
        }
        float sumofnums = (firstColumnCount+secondColumnCount+thirdColumnCount);
        double onepercent = sumofnums / 100;
        return "Number of numbers in the first column section: "+firstColumnCount+" which is "+df2.format(firstColumnCount/onepercent)+"%"+"\nNumber of numbers in the second column section: "+secondColumnCount+" which is "+df2.format(secondColumnCount/onepercent)+"%"+"\nNumber of numbers in the third column section: "+thirdColumnCount+" which is "+df2.format(thirdColumnCount/onepercent)+"%";
    }

    public String splits(int[] numbers) {
        int count = 1;
        int[][] occnum = new int[12][3];
        ArrayList <Integer> splitResults = new ArrayList<>();

        count = 1;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 3; j++) {
                occnum[i][j] = numbers[count];
                count++;
            }
        }

        int best = 0;
        int firstnumber = 0;
        int secondnumber = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 3; j++) {
                try {
                    splitResults.add(occnum[i][j] + occnum[i][j+1]);
                    if (occnum[i][j] + occnum[i][j+1] > best) {
                        best = occnum[i][j] + occnum[i][j+1];
                        for (int k = 0; k < numbers.length; k++) {
                            if (numbers[k] == occnum[i][j]) {
                                firstnumber = k;
                                secondnumber = k + 1;
                            }
                        }
                    }
                } catch (IndexOutOfBoundsException e) {
                    e.getMessage();
                }
                
                try {
                    splitResults.add(occnum[i][j] + occnum[i+1][j]);
                    if (occnum[i][j] + occnum[i+1][j] > best) {
                        best = occnum[i][j] + occnum[i+1][j];
                        for (int k = 0; k < numbers.length; k++) {
                            if (numbers[k] == occnum[i][j]) {
                                firstnumber = k;
                                secondnumber = k + 3;
                            }
                        }
                    } 
                } catch (IndexOutOfBoundsException e) {
                    e.getMessage();
                }
            }
        }

        String finalResult = "╔═══════════════════════════════════════╗";
        finalResult += "\n║\t --- DETAILED SPLITS --- \t║";

        count = 0;
        for (int i = 0; i < splitResults.size(); i++) {
            try {
                String strToAdd = "["+(i+1)+":"+(i+2)+"] --> "+splitResults.get(i)+"["+(i+1)+":"+(i+4)+"] --> "+splitResults.get(i+1);
                if (i == 0) {
                    finalResult += "\n╠═══════════════════╦═══════════════════╣";
                } else {
                    finalResult += "\n╠═══════════════════╬═══════════════════╣";
                }
                switch (strToAdd.length()) {
                    case 24: 
                    finalResult += "\n║   ["+(i+1)+":"+(i+2)+"] --> "+splitResults.get(count)+"    ║";
                    if (i == 34) {
                        finalResult += "\t\t\t║";
                        break;
                    }
                    finalResult += "\t["+(i+1)+":"+(i+4)+"] --> "+splitResults.get(count+1)+"    ║";
                    break;
                    case 25:
                    finalResult += "\n║   ["+(i+1)+":"+(i+2)+"] --> "+splitResults.get(count)+"    ║";
                        if (i == 34) {
                        finalResult += "\t\t\t║";
                        break;
                    }
                    finalResult += "\t["+(i+1)+":"+(i+4)+"] --> "+splitResults.get(count+1)+"   ║";
                    break;
                    case 26:
                    finalResult += "\n║   ["+(i+1)+":"+(i+2)+"] --> "+splitResults.get(count)+"   ║";
                        if (i == 34) {
                        finalResult += "\t\t\t║";
                        break;
                    }
                    finalResult += "\t["+(i+1)+":"+(i+4)+"] --> "+splitResults.get(count+1)+"   ║";
                    break;
                    case 28:
                    finalResult += "\n║   ["+(i+1)+":"+(i+2)+"] --> "+splitResults.get(count)+"  ║";
                        if (i == 34) {
                        finalResult += "\t\t\t║";
                        break;
                    }
                    finalResult += "\t["+(i+1)+":"+(i+4)+"] --> "+splitResults.get(count+1)+"  ║";
                    break;
                }
                count++;
                if (i == 34) {
                    break;
                }
                
            } catch (IndexOutOfBoundsException e) {
                e.getMessage();
            }
        }
        finalResult += "\n╚═══════════════════╩═══════════════════╝\n";
        finalResult += "\nBest split: "+firstnumber+", "+secondnumber+" which occurred "+best+" times.";
        return finalResult;
    }
}