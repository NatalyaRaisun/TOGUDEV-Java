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

        Car mercedes = new Driver("Mercedes", 1995, "Gray", 200, "John", 19);

        Car bmw = new Driver("BMW", 2005, "Black", 220, "Alex", 16);

        System.out.println(mercedes.getBrand());
        System.out.println(mercedes.getYear());
        System.out.println(mercedes.getColour());
        System.out.println(mercedes.getSpeedMax());
        System.out.print(((Driver) mercedes).getName()+" ");
        System.out.println(((Driver) mercedes).getAge()+" ");

        mercedes.movement();
        mercedes.movement2();
        mercedes.turn();
        mercedes.turn2();
        mercedes.signal();

        System.out.println(" ");

        System.out.println(bmw.getBrand()+" ");
        System.out.println(bmw.getYear()+" ");
        System.out.println(bmw.getColour()+" ");
        System.out.println(bmw.getSpeedMax()+" ");
        System.out.print(((Driver) bmw).getName()+" ");
        System.out.println(((Driver) bmw).getAge()+" ");

        bmw.movement();
        bmw.movement2();
        bmw.turn();
        bmw.turn2();
        bmw.signal();

    }
}
