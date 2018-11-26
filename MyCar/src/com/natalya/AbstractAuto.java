package com.natalya;

import java.util.logging.Logger;

public abstract class AbstractAuto {

    private String brand;
    private int year;
    private String colour;
    private int speedMax;
    private static Logger log = Logger.getLogger(AbstractAuto.class.getName());

    public AbstractAuto(String brand, int year, String colour, int speedMax) {
        this.brand = brand;
        this.year = year;
        this.colour = colour;
        this.speedMax = speedMax;
        log.info("Driver конструктор");
    }

    public String getBrand() {
        return brand;
    }


    public int getYear() {
        return year;
    }


    public String getColour() {
        return "Black";
    }


    public int getSpeedMax() {
        return 1;
    }

}
