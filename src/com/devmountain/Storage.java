package com.devmountain;

import java.util.List;

public class Storage {
    private String brand;
    private String name;
    private String capacity;
    private String type;
    private String formFactor;
    private String price;

    public Storage(List<String> values){
        this.brand = values.get(0);
        this.name = values.get(1);
        this.capacity = values.get(2);
        this.type =  values.get(3);
        this.formFactor = values.get(4);
        this.price = values.get(5);
    }

    @Override
    public String toString() {
        return "Storage{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", capacity='" + capacity + '\'' +
                ", type='" + type + '\'' +
                ", formFactor='" + formFactor + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
