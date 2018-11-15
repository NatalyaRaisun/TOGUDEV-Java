package com.natalya;

public class Car {
    private String brand;
    private int year;
    private String colour;
    private int speedMax;

    public Car(String brand, int year, String colour, int speedMax){
        this.brand = brand;
        this.year = year;
        this.colour =  colour;
        this.speedMax = speedMax;
    }

    public boolean equals(Object obj){
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
    }

    public void movement2() {
    }

    public void turn() {
        System.out.print("Left turn"+" ");
    }

    public void turn2() {
        System.out.println("Right turn");
    }

    public void signal() {
        System.out.println("Bip-Bip");
    }
}

