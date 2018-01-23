package com.codecool;

import java.io.*;
import java.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        int count = 1;
        ArrayList<String[]> readlist = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
<<<<<<< Updated upstream
        Simulation loader = new Simulation();
        try{
        readlist = loader.load();
    }
    catch(Exception e){
        e.getMessage();
    }
        while (count <= Integer.parseInt(args[0])) {
            Simulation sim = new Simulation();
            list.add(sim.getResult());
            sim.generateData(list);
            count++;
=======
        if (args.length != 0) {
            try {
                Integer.valueOf(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("You can only enter numbers as arguments.");
                System.exit(0);
            }
            while (count <= Integer.parseInt(args[0])) {
                Simulation sim = new Simulation();
                list.add(sim.getResult());
                sim.generateData(list);
                count++;
            }
        } else {
            System.exit(0);
        }
>>>>>>> Stashed changes
    }
}
}