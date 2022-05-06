package com.devmountain;

public class Cpu {
    private String brand;
    private String level;
    private String name;
    private String cores;
    private String threads;
    private String coreClock;
    private String boostClock;
    private String tdp;
    private String integratedGraphics;
    private String chipset;
    private String price;

    public Cpu(String brand, String level, String name, String cores, String threads, String coreClock, String boostClock, String tdp, String integratedGraphics, String chipset, String price) {
        this.brand = brand;
        this.level = level;
        this.name = name;
        this.cores = cores;
        this.threads = threads;
        this.coreClock = coreClock;
        this.boostClock = boostClock;
        this.tdp = tdp;
        this.integratedGraphics = integratedGraphics;
        this.chipset = chipset;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCores() {
        return cores;
    }

    public void setCores(String cores) {
        this.cores = cores;
    }

    public String getThreads() {
        return threads;
    }

    public void setThreads(String threads) {
        this.threads = threads;
    }

    public String getCoreClock() {
        return coreClock;
    }

    public void setCoreClock(String coreClock) {
        this.coreClock = coreClock;
    }

    public String getBoostClock() {
        return boostClock;
    }

    public void setBoostClock(String boostClock) {
        this.boostClock = boostClock;
    }

    public String getTdp() {
        return tdp;
    }

    public void setTdp(String tdp) {
        this.tdp = tdp;
    }

    public String getIntegratedGraphics() {
        return integratedGraphics;
    }

    public void setIntegratedGraphics(String integratedGraphics) {
        this.integratedGraphics = integratedGraphics;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "brand='" + brand + '\'' +
                ", level='" + level + '\'' +
                ", name='" + name + '\'' +
                ", cores='" + cores + '\'' +
                ", threads='" + threads + '\'' +
                ", coreClock='" + coreClock + '\'' +
                ", boostClock='" + boostClock + '\'' +
                ", tdp='" + tdp + '\'' +
                ", integratedGraphics='" + integratedGraphics + '\'' +
                ", chipset='" + chipset + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
