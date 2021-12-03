package com.company;

import com.company.vehicles.*;
import com.company.details.*;
import com.company.professions.*;

import java.time.LocalDate;

/*
1)  Автомобили. Создать класс Car в пакете vehicles , Engine в пакете details и Driver в пакете professions.
Класс Driver содержит поля - ФИО, стаж вождения.
Класс Engine содержит поля - мощность, производитель.
Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine.
Методы start(), stop(), turnRight(), turnLeft(), которые выводят на печать: "Поехали", "Останавливаемся",
"Поворот направо" или "Поворот налево". А также метод toString(), который выводит полную информацию об автомобиле,
ее водителе и моторе.

Создать производный от Car класс - Lorry (грузовик), характеризуемый также грузоподъемностью кузова. Создать
производный от Car класс - SportCar, характеризуемый также предельной скоростью. Пусть класс Driver расширяет
класс Person.

2*) В класс Person вместо поля возраст добавить поле дата рождения как строка типа "18.12.1985"

- добавить метод который выводит количество полных лет на данным момент.
*/
public class Main {

    public static void main(String[] args) {
        Driver driver = new Driver("Ivanov Ivan Ivanovych",
                LocalDate.of(1985, 12, 18),
                10
        );
        driver.showAge();
        Engine engine = new Engine(1.4, "Volkswagen");
        Car car = new Car("Volkswagen", "C", 1.5, driver, engine);
        System.out.println(car);
        drive(car);
        Engine truckEngine = new Engine(3.0, "MAN");
        Lorry lorry = new Lorry("MAN", "D", 3.5, driver, truckEngine, 10);
        System.out.println(lorry);
        drive(lorry);
        Engine sportEngine = new Engine(6.0, "Lamborgini");
        SportCar sportCar = new SportCar("Lamborgini", "S", 1.4, driver, sportEngine, 280);
        System.out.println(sportCar);
        drive(sportCar);
    }

    private static void drive(Car car) {
        car.start();
        car.turnRight();
        car.turnLeft();
        car.stop();
    }
}
