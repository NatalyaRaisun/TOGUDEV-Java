package com.natalya;

public abstract class AbstractAuto{

    private String brand;
    private int year;
    private String colour;
    private int speedMax;
    
    public AbstractAuto(String brand, int year, String colour, int speedMax) {
        this.brand = brand;
        this.year = year;
        this.colour = colour;
        this.speedMax = speedMax;


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
