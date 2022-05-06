package com.devmountain;

public class Gpu {
    private String brand;
    private String name;
    private String memory;
    private String baseClock;
    private String boostClock;
    private String price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getBaseClock() {
        return baseClock;
    }

    public void setBaseClock(String baseClock) {
        this.baseClock = baseClock;
    }

    public String getBoostClock() {
        return boostClock;
    }

    public void setBoostClock(String boostClock) {
        this.boostClock = boostClock;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Gpu{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", memory='" + memory + '\'' +
                ", baseClock='" + baseClock + '\'' +
                ", boostClock='" + boostClock + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
