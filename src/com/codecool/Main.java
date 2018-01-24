package com.codecool;

import java.io.*;
import java.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        int count = 1, happen = 0;
        ArrayList<String[]> readlist = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        Simulation loader = new Simulation();
        Simulation defaultCSV = new Simulation();
        long start = 0;
        long end = 0;
        int[] numbers = new int[37];
        Logger logger = new Logger();
        int blackcount = 0, redcount = 0, greencount = 0;


        try {
            start = System.currentTimeMillis();
            readlist = loader.load();
            } catch(Exception e) {
                e.getMessage();
                }
            end = System.currentTimeMillis();
            logger.logTimeTaken("Time it took to read data from file:", start, end);

        for (int i = 0; i < readlist.size(); i++) {
            String[] read = readlist.get(i);
            String joined = String.join(",", read);
            list.add(joined);
        }
   
        if (args.length > 0) {
            logger.simulationInit(Integer.parseInt(args[0]));
            start = System.currentTimeMillis();
            while (count <= Integer.parseInt(args[0])) {
                Simulation sim = new Simulation();
                list.add(sim.getResult());
                count++;
                happen++;
                }
            end = System.currentTimeMillis();
            logger.logTimeTaken("Time it took to generate simulations:", start, end);
            }

        if (list.size() > 0) {
            start = System.currentTimeMillis();
            for (int i = 0; i < list.size(); i++) {
                readlist.add(list.get(i).split(","));
            }
            if (happen > 0) {
                for (int i = 0; i < list.size(); i++) {
                    defaultCSV.generateData(list);
                }
            }
            end = System.currentTimeMillis();
            logger.logTimeTaken("Time took to write data to file:", start, end);
            }


        for (int i = 0; i < list.size(); i++) {
            String[] splitted = list.get(i).split(",");
            int current = Integer.parseInt(splitted[2]);
            numbers[current]++;
            if (splitted[1].equals("Black")) {
                blackcount++;
            } else if (splitted[1].equals("Green")) {
                greencount++;
            } else {
                redcount++;
            }
        }
        logger.numberOfSims((greencount+blackcount+redcount));
        logger.finalColors(greencount, blackcount, redcount);
        logger.evenOddCount(numbers);
        logger.finalStats(numbers, greencount, blackcount, redcount);
    }
}
