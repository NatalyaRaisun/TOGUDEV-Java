package com.natalya;

import java.util.logging.Logger;

public class Driver extends AbstractAuto implements IMyInterface {
    private String name;
    private int age;
    private static Logger log = Logger.getLogger(Driver.class.getName());

    public Driver(String brand, int year, String colour, int speedMax, String name, int age) {
        super(brand, year, colour, speedMax);
        this.name = name;
        this.age = age;
        log.info("Driver конструктор");
    }

    @Override
    public void driveForward() {
        if (age >= 18) {
            System.out.println("Едем вперед " + "Машина едет");
        } else {
            System.out.println("СТОП!!! ДПС уже в пути");
        }
    }

    @Override
    public void driveBackward() {
        if (age >= 18) {
            System.out.println("Едем назад " + "Машина едет");
        } else {
            System.out.println("СТОП!!! ДПС уже в пути");
        }
    }

    @Override
    public void turnLeft() {
        System.out.print("Поворот налево" + " ");
    }

    @Override
    public void turnRight() {
        System.out.println("Поворот направо");
    }

    @Override
    public void signal() {
        System.out.println("beeep");
    }


    public String getName() {
        return name;
    }

        public int getAge() {
        return age;
    }
}
