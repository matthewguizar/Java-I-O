package com.devmountain;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public static List<Case> seedCases(File file) throws IOException {
        List<Case> caseList = new ArrayList<>();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while((line = bufferedReader.readLine()) != null);
        String[] values = line.split("\\|");
        String brand = values[0];
        String name = values[1];
        String type = values[2];
        String color = values[3];
        String price = values[4];

        Case pcCase = new Case (brand, name, type, color, price);
        caseList.add(pcCase);
      return caseList;
    }

    public static List<Cpu> seedCpus(File file) throws IOException {
        List<Cpu> cpuList = new ArrayList<>();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while((line = bufferedReader.readLine()) != null);
        String[] values = line.split("\\|");
        String brand = values[0];
        String level = values[1];
        String name = values[2];
        String cores = values[3];
        String threads = values[4];
        String coreClock = values[5];
        String boostClock = values[6];
        String tdp = values[7];
        String integratedGraphics = values[8];
        String chipset = values[9];
        String price = values[10];

        Cpu cpus = new Cpu(brand, level, name, cores, threads, coreClock, boostClock, tdp, integratedGraphics, chipset, price);
        cpuList.add(cpus);
        return cpuList;

    }

    public static List<CpuCooler> seedCoolers(File file) throws IOException {
        List<CpuCooler> coolersList = new ArrayList<>();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while((line = bufferedReader.readLine()) !=null);
        String[] values = line.split("\\|");
        String company = values[0];
        String name = values[1];
        String type = values[2];
        String radiator = values[3];
        String price = values[4];
        CpuCooler cpuCoolers = new CpuCooler(company, name, type, radiator, price);
        coolersList.add(cpuCoolers);
        return coolersList;
    }




}