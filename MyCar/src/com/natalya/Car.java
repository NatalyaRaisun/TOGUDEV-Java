package com.natalya;

import java.util.logging.Logger;

public class Car {
    private String carBrand;
    private int carYear;
    private static Logger log = Logger.getLogger(Car.class.getName());

    public Car(String carBrand, int carYear) {
        this.carBrand = carBrand;
        this.carYear = carYear;
        log.info("Car конструктор");
    }

    public boolean equals(Object obj) {
        Car car = (Car) obj;
        this.carBrand = car.carBrand;
        this.carYear = car.carYear;
        return true; /* Переопределила метод equals. Теперь переопределенный метод equals
                       проверяет, являются ли два объекта равными */
    }
}


