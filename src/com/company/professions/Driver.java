package com.company.professions;

import java.time.LocalDate;
import java.time.Period;

public class Driver extends Person {

    private int experience;

    public Driver(String fullName, LocalDate birthday, int experience) {
        super(fullName, birthday);
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "experience=" + experience +
                ", fullName='" + fullName + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
