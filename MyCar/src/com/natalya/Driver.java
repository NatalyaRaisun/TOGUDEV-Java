package com.natalya;

public class Driver extends Car{
    private String name;
    private int age;

    public Driver(String brand, int year, String colour, int speedMax, String name, int age) {
        super(brand, year, colour, speedMax);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public void movement() {
        if (age >= 18) {
            System.out.println("Drive forward "+"Go by car");
        } else {
            System.out.println("STOP!!! DPS is on the way");
        }
        super.movement();
    }

    @Override
    public void movement2() {
        if (age >= 18) {
            System.out.println("Drive backward "+"Go by car");
        } else {
            System.out.println("STOP!!! DPS is on the way");
        }
        super.movement2();
    }

    public int getAge() {
        return age;


    }
}
