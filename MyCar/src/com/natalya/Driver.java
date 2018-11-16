package com.natalya;

import java.util.logging.Logger;

public class Driver extends Car{
    private String name;
    private int age;
    private static Logger log = Logger.getLogger(Driver.class.getName());

    public Driver(String brand, int year, String colour, int speedMax, String name, int age) {
        super(brand, year, colour, speedMax);
        this.name = name;
        this.age = age;
        log.info("Driver конструктор");
    }

    public String getName() {
        return name;
    }

    @Override
    public void movement() {
        if (age >= 18) {
            System.out.println("Едем вперед "+"Машина едет");
        } else {
            System.out.println("СТОП!!! ДПС уже в пути");
        }
    }

    @Override
    public void movement2() {
        if (age >= 18) {
            System.out.println("Едем назад "+"Машина едет");
        } else {
            System.out.println("СТОП!!! ДПС уже в пути");
        }
    }

    public int getAge() {
        return age;


    }
}
