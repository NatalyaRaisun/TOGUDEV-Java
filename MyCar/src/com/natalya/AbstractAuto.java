package com.natalya;

public abstract class AbstractAuto{

    private String brand;
    private int year;
    private String colour = "Black";
    private int speedMax = 1;

    public AbstractAuto(String brand, int year, String colour, int speedMax) {
        this.brand = brand;
        this.year = year;
        this.colour = colour;
        this.speedMax = speedMax;
    }
}
