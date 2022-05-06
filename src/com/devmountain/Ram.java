package com.devmountain;

public class Ram {
    private String brand;
    private String name;
    private String type;
    private String speed;
    private String modules;
    private String capacity;
    private String price;

    public Ram(String[] values) {
        this.brand = values[0];
        this.name = values[1];
        this.type = values[2];
        this.speed = values[3];
        this.modules = values[4];
        this.capacity = values[5];
        this.price = values[6];
    }

    @Override
    public String toString() {
        return "Ram{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", speed='" + speed + '\'' +
                ", modules='" + modules + '\'' +
                ", capacity='" + capacity + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
