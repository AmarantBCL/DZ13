package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {

    private float capacity;

    public Lorry(String model, String carClass, double weight, Driver driver, Engine engine, float capacity) {
        super(model, carClass, weight, driver, engine);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "model='" + model + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                ", capacity=" + capacity +
                '}';
    }
}
