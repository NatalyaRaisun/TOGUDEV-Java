package com.natalya;

import java.util.logging.Logger;

public class SportCar extends Driver {
        private static Logger log = Logger.getLogger(SportCar.class.getName());

    public SportCar(String brand, int year, String colour, int speedMax, String name, int age) {
        super(brand, year, colour, speedMax, name, age);
        log.info("Bus конструктор");
    }

    public void speed() {
        if (getSpeedMax() > 350) {
            System.out.println("Я самый быстрый");
        } else {
            System.out.println("Ну такое :(");
        }
    }

    public void people(){
        System.out.println("Все смотрят только на меня!!!");
    }
}
