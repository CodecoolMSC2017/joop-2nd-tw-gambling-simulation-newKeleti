package com.codecool;

import java.io.*;
import java.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        int count = 1;
        ArrayList<String> list = new ArrayList<>();

        while (count <= Integer.parseInt(args[0])) {
            Simulation sim = new Simulation();
            list.add(sim.getResult());
            sim.generateData(list);
            count++;
        }
    }
}