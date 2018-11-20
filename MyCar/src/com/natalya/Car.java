package com.natalya;

import java.util.logging.Logger;

public class Car {
    private String brand;
    private int year;
    private String colour;
    private int speedMax;
    private static Logger log = Logger.getLogger(Car.class.getName());

    public Car(String brand, int year, String colour, int speedMax) {
        this.brand = brand;
        this.year = year;
        this.colour = colour;
        this.speedMax = speedMax;
        log.info("Car конструктор");
    }

    public boolean equals(Object obj) {
        Car car = (Car) obj;
        this.brand = car.brand;
        this.year = car.year;
        this.colour = car.colour;
        this.speedMax = car.speedMax;
        return true; /* Переопределила метод equals. Теперь переопределенный метод equals
                       проверяет, являются ли два объекта равными */
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public String getColour() {
        return colour;
    }

    public int getSpeedMax() {
        return speedMax;
    }

    public void movement() {
        System.out.println("Едем вперед");
    }

    public void movement2() {
        System.out.println("Едем назад");
    }

    public void turn() {
        System.out.print("Поворот налево" + " ");
    }

    public void turn2() {
        System.out.println("Поворот направо");
    }

    public void signal() {
        System.out.println("Биип-Биип");
    }
}

