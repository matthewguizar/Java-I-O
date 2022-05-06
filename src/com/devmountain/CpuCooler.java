package com.devmountain;

public class CpuCooler {
    private String company;
    private String name;
    private String type;
    private String radiator;
    private String price;

    public CpuCooler(String company, String name, String type, String radiator, String price) {
        this.company = company;
        this.name = name;
        this.type = type;
        this.radiator = radiator;
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRadiator() {
        return radiator;
    }

    public void setRadiator(String radiator) {
        this.radiator = radiator;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CpuCooler{" +
                "company='" + company + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", radiator='" + radiator + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
