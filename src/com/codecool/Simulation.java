package com.codecool;

import java.util.*;
import java.io.*;
import java.text.*;


public class Simulation {
    
    protected int green = 0;
    protected int[] blacks = {2,4,6,8,10,11,13,15,17,20,22,24,26,28,29,31,33,35};
    protected int[] reds = {1,3,5,7,9,12,14,16,18,21,23,25,27,28,30,32,34,36};
    protected int redcount = 0;
    protected int greencount = 0;
    protected int blackcount = 0;
    protected String found;
    protected ArrayList<String> list = new ArrayList<String>();
    protected String timeStamp;
    
    public Simulation() {
        Simulator sim = new Simulator(0, blacks, reds);
        found = sim.getSim();
        if (found.contains("Black")) {
            blackcount++;
        } else if (found.equals("Green: 0")) {
            greencount++;
        } else {
            redcount++;
        }
    }

    public String getResult() throws FileNotFoundException {
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(new Date());

        return timeStamp+","+found;
    }

    public void generateData(ArrayList<String> list) {
        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream("data/data.csv"));
            for (String str : list) {
                pw.println(str);
            }
            pw.close();
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    public ArrayList<String[]> load() throws IOException { 
        String file = "data/data.csv";
        ArrayList<String[]> content = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                content.add(line.split(","));
                }
            } catch (FileNotFoundException e) {
                e.getMessage();
                }
        /*for(int i = 0; i < content.size(); i++) {
            String[] arr = content.get(i);
            System.out.println(arr[2]);
        }*/
        return content;
    }
}