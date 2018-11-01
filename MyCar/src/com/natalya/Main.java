package com.natalya;

public class Main {

    public static void main(String[] args) {
        Car mersedes = new Car();
        mersedes.setBrand("Mersedes");
        mersedes.setYear(1995);
        mersedes.setColour("Gray");
        mersedes.setSpeedMax(200);

        Car bmw = new Car();
        bmw.setBrand("BMW");
        bmw.setYear(2005);
        bmw.setColour("Black");
        bmw.setSpeedMax(220);

        System.out.println("The first car is " + mersedes.getBrand());
        System.out.println("Year of car manufacture " + mersedes.getYear());
        System.out.println("Color if " + mersedes.getColour());
        System.out.println("Maximum speed " + mersedes.getSpeedMax());

        System.out.println("");

        mersedes.movement();
        mersedes.movement2();
        mersedes.turn();
        mersedes.turn2();
        mersedes.signal();

        System.out.println("");
        System.out.println("");

        System.out.println("The second car is " + bmw.getBrand());
        System.out.println("Year of car manufacture " + bmw.getYear());
        System.out.println("Color if " + bmw.getColour());
        System.out.println("Maximum speed " + bmw.getSpeedMax());

        System.out.println("");

        bmw.movement();
        bmw.movement2();
        bmw.turn();
        bmw.turn2();
        bmw.signal();

    }
}
