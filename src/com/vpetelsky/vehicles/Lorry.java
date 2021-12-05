package com.vpetelsky.vehicles;

import com.vpetelsky.details.Engine;
import com.vpetelsky.professions.Driver;

public class Lorry extends Car {

    private final int loadCapacity;

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public Lorry(String model, String carClass, double weight, Driver driver, Engine engine, int loadCapacity) {
        super(model, carClass, weight, driver, engine);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "model='" + model + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                ", capacity=" + loadCapacity +
                '}';
    }
}
