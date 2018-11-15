package com.natalya;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Lada", 1990, "White", 180);

        Car car2 = new Car("Lada", 1990, "White", 180);
         //Создала 2 обьекта с одинаковыми полями

        System.out.println(car1 == car2); // Сравнила эти 2 объекта и получила значение false
        /*
         Оператор new для каждой из переменных создает свой экземпляр класса.
         Если сравнивать эти две переменные через == или equals, каждый раз будет возвращаться false, потому что
         обе переменные указывают на разные обьекты, которые находятся в разных участках памяти. Чтобы решить эту проблему
         мы должны переопределить метод equals в классе Car
        */
        System.out.println(car1.equals(car2)); // После переопределения получаем true

        System.out.println(" ");

        Car mercedes = new Car("Mercedes", 1995, "Gray", 200);

        Car bmw = new Car("BMW", 2005, "Black", 220);

        System.out.print(mercedes.getBrand()+" ");
        System.out.print(mercedes.getYear()+" ");
        System.out.print(mercedes.getColour()+" ");
        System.out.println( mercedes.getSpeedMax()+" ");

        mercedes.movement();
        mercedes.movement2();
        mercedes.turn();
        mercedes.turn2();
        mercedes.signal();

        System.out.println(" ");

        System.out.print(bmw.getBrand()+" ");
        System.out.print(bmw.getYear()+" ");
        System.out.print(bmw.getColour()+" ");
        System.out.println(bmw.getSpeedMax()+" ");

        bmw.movement();
        bmw.movement2();
        bmw.turn();
        bmw.turn2();
        bmw.signal();

    }
}
