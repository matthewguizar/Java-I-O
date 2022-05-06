package com.devmountain;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) throws IOException {
        System.out.println("hi");

        //txt files
        File cases = new File("./data/txt/Case.txt");
        File cpus = new File("./data/txt/CPU.txt");
        File cpuCooler = new File ("./data/txt/GPU.txt");

        //csv files
        File motherboard = new File ("./data/csv/motherboard.csv");
        File psu = new File("./data/csv/psu.csv");
        File ram = new File ("./data/csv/ram.csv");
        File storage = new File ("./data/csv/storage.csv");
        openFileAndPrint(cases);

    }

    public static void openFileAndPrint (File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while((line = bufferedReader.readLine()) != null){
            String[] values = line.split("\\|");
            System.out.println(Arrays.toString(values));
        }

    }



}