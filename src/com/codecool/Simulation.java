package com.codecool;

import java.util.*;
import java.io.*;
import java.text.*;


public class Simulation {
    
    private int green = 0;
    private int[] blacks = {2,4,6,8,10,11,13,15,17,20,22,24,26,28,29,31,33,35};
    private int[] reds = {1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36};
    private String found;
    private ArrayList<String> list;
    
    public Simulation() {
        Simulator sim = new Simulator(green, blacks, reds);
        found = sim.getSim();
    }

    public String getResult() throws FileNotFoundException {
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(new Date());

        return timeStamp+","+found;
    }

    public void generateData(ArrayList<String> list) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("data/data.csv"));
            for (String str : list) {
                writer.write(str+"\n");
            }
            writer.close();
        } catch (IOException ex) {
            ex.getMessage();
        }
    }

    public ArrayList<String[]> load() throws IOException { 
        ArrayList<String[]> content = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("data/data.csv"))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                content.add(line.split(","));
                }
            } catch (FileNotFoundException e) {
                e.getMessage();
                }
        return content;
    }
}
