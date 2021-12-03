package com.company.professions;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    protected String fullName;
    protected String birthday;

    public Person(String fullName, LocalDate birthday) {
        this.fullName = fullName;
        this.birthday = birthday.format(FORMATTER);
    }

    public void showAge() {
        LocalDate date = LocalDate.parse(birthday, FORMATTER);
        int period = Period.between(date, LocalDate.now()).getYears();
        System.out.printf("%s: %d years old\n", fullName, period);
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + birthday +
                '}';
    }
}
