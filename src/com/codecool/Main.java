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
        try {
        readlist = loader.load();
        } catch(Exception e) {
            e.getMessage(); 
            }   

        try {
            Integer.valueOf(args[0]);
        } catch (Exception e) {
            for (int j = 0; j < readlist.size(); j++) {
                String[] arr = readlist.get(j);
                System.out.println(j+". "+arr[0]+","+arr[1]+","+arr[2]);
                arg++;
                }
            }
        
        if (args.length > 0) {
            while (count <= Integer.parseInt(args[0])) {
                Simulation sim = new Simulation();
                list.add(sim.getResult());
                sim.generateData(list);
                count++;
                }
            }
        
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                readlist.add(list.get(i).split(","));
                }
            }

        

        if (arg == 0) {
            for (int j = 0; j < readlist.size(); j++) {
                String[] arr = readlist.get(j);
                System.out.println(j+". "+arr[0]+","+arr[1]+","+arr[2]);
            }
        }
    }
}