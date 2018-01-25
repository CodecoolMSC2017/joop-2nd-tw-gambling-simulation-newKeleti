package com.codecool;

public class Result {
    private int[] numbers;
    private int redcount,blackcount,greencount;
    private int firstDozenCount,secondDozenCount,thirdDozenCount;
    private int highCount,lowCount;
    public String getBestColor(int blackcount, int greencount,int redcount){
        int biggest = 0;
        String winner= "";
        if (blackcount>greencount && blackcount > redcount){
            biggest = blackcount;
            winner = "Black";
        }else if (greencount > blackcount && greencount > redcount){
            biggest = greencount;
            winner = "Green";
        }else{
            biggest = redcount;
            winner = "Red";
        }

        return "The most frequent color is: "+winner+" with "+biggest+" number of occurences.";
    }

    public String getBestNumber(int[] numbers){
        int biggest = 0;
        int finalres = 0;
        for(int i = 0; i< numbers.length;i++){
            if(numbers[i]>biggest){
                biggest=numbers[i];
                finalres = i;
            }
        }
        return "The most frequent number is: "+finalres+" with "+biggest+" number of occurences.";
    }

    public String getBestDozen(int firstDozenCount,int secondDozenCount,int thirdDozenCount){
        int biggest = 0;
        String winner= "";
        if (firstDozenCount>secondDozenCount && firstDozenCount > thirdDozenCount){
            biggest = firstDozenCount;
            winner= "First dozen";
        }else if (secondDozenCount > firstDozenCount && secondDozenCount > thirdDozenCount){
            biggest = secondDozenCount;
            winner= "Second dozen";
        }else{
            biggest = thirdDozenCount;
            winner= "Third dozen";
        }

        return "The most frequent dozen is: "+winner+" with "+biggest+" number of occurences.";
    }

    

    public String highOrLow(int lowCount,int highCount){
        int biggest = 0;
        String winner = "";
        if(lowCount>highCount){
            biggest = lowCount;
            winner= "Low section";
        }else{
            biggest= highCount;
            winner= "High section";
        }
        return"The most frequent section is "+winner+" with "+biggest+" number of occurences";
    }
}