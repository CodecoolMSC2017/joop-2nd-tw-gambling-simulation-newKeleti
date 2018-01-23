package com.codecool;

import java.io.*;
import java.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        int count = 1;
        ArrayList<String[]> readlist = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        Simulation loader = new Simulation();
        Simulation defaultCSV = new Simulation();
        int arg = 0;
        long start = 0;
        long end = 0;
        int[] numbers = new int[37];
        try {
        readlist = loader.load();
        } catch(Exception e) {
            e.getMessage(); 
            }   

        for (int i = 0; i < readlist.size(); i++) {
            String[] read = readlist.get(i);
            String joined = String.join(",", read);
            list.add(joined);
        }

        try {
            Integer.valueOf(args[0]);
        } catch (Exception e) {
            /*for (int j = 0; j < readlist.size(); j++) {
                String[] arr = readlist.get(j);
                System.out.println((j+1)+". "+arr[0]+","+arr[1]+","+arr[2]);
                arg++;
            }*/
            }
        
        if (args.length > 0) {
                start = System.currentTimeMillis();
            while (count <= Integer.parseInt(args[0])) {
                Simulation sim = new Simulation();
                list.add(sim.getResult());
                count++;
                }
                end = System.currentTimeMillis();
            }
    
        
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                readlist.add(list.get(i).split(","));
                }
            }


        for (int i = 0; i < list.size(); i++) {
            defaultCSV.generateData(list);
        }

        for (int i = 0; i < list.size(); i++) {
            String[] splitted = list.get(i).split(",");
            int current = Integer.parseInt(splitted[2]);
            //System.out.println(current);
            numbers[current]++;
        }

        
        /*if (arg == 0) {
            for (int j = 0; j < list.size(); j++) {
                System.out.println((j+1)+". "+list.get(j));
            }
        }*/
        
        Statistics stat = new Statistics();
        System.out.println(stat.numberOfNumbers(numbers));
        System.out.println(stat.simulationTime(start, end));
        System.out.println(stat.allSimulation(list));
    }
}
