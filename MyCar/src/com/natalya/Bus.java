package com.natalya;

import java.util.logging.Logger;

public class Bus extends Driver {
    private int numberOfPass;
    private static Logger log = Logger.getLogger(Bus.class.getName());

    public Bus(String brand, int year, String colour, int speedMax, String name, int age, int numberOfPass) {
        super(brand, year, colour, speedMax, name, age);
        this.numberOfPass = numberOfPass;
        log.info("Bus конструктор");
    }

    public final int getNumberOfPass() {
        return numberOfPass;
    }

    public final void passengers() {
        if (numberOfPass > 50) {
            System.out.println("ПЕРЕВЕС!!! Автобус не может ехать");
        } else {
            System.out.println("Автобус едет");
        }
    }

    @Override
    public final void signal() {
        System.out.println("Тууу-Тууу");
    }
}
