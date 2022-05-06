package com.devmountain;

public class Motherboard {
    private String brand;
    private String name;
    private String socket;
    private String ramSlots;
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

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getRamSlots() {
        return ramSlots;
    }

    public void setRamSlots(String ramSlots) {
        this.ramSlots = ramSlots;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", socket='" + socket + '\'' +
                ", ramSlots='" + ramSlots + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
