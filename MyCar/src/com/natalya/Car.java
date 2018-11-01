package com.natalya;

public class Car {
    private String brand;
    private int year;
    private String colour;
    private int speedMax;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getSpeedMax() {
        return speedMax;
    }

    public void setSpeedMax(int speedMax) {
        this.speedMax = speedMax;
    }

    public void movement(){
        System.out.println("Drive forward");
    }

    public void movement2(){
        System.out.println("Drive backward");
    }

    public void turn() {
        System.out.println("Left turn");
    }

    public void turn2() {
        System.out.println("Right turn");
    }

    public void signal() {
        System.out.println("Bip-Bip");

    }
}

