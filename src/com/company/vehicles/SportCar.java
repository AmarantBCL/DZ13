package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car {

    private int maxSpeed;

    public SportCar(String model, String carClass, double weight, Driver driver, Engine engine, int maxSpeed) {
        super(model, carClass, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "model='" + model + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
