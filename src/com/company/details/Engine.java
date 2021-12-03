package com.company.details;

public class Engine {

    private double power;
    private String manufacturer;

    public double getPower() {
        return power;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Engine(double power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
