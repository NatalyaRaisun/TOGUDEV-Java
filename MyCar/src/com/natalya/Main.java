package com.natalya;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Лада", 1990, "Белый", 180);

        Car car2 = new Car("Лада", 1990, "Белый", 180);
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

        Driver mercedes = new Driver("Мерседес", 1995, "Серый", 200, "Женя", 19);

        Driver bmw = new Driver("БМВ", 2005, "Черный", 220, "Петя", 16);

        System.out.println(mercedes.getBrand());
        System.out.println(mercedes.getYear());
        System.out.println(mercedes.getColour());
        System.out.println(mercedes.getSpeedMax());
        System.out.print(mercedes.getName() + " ");
        System.out.println(mercedes.getAge() + " ");

        mercedes.movement();
        mercedes.movement2();
        mercedes.turn();
        mercedes.turn2();
        mercedes.signal();

        System.out.println(" ");

        System.out.println(bmw.getBrand() + " ");
        System.out.println(bmw.getYear() + " ");
        System.out.println(bmw.getColour() + " ");
        System.out.println(bmw.getSpeedMax() + " ");
        System.out.print(bmw.getName() + " ");
        System.out.println(bmw.getAge() + " ");

        bmw.movement();
        bmw.movement2();
        bmw.turn();
        bmw.turn2();
        bmw.signal();

        System.out.println(" ");

        Bus bus = new Bus("ПАЗ", 1990, "Желтый", 180, "Вася", 40, 35);
        System.out.println(bus.getBrand());
        System.out.println(bus.getYear());
        System.out.println(bus.getColour());
        System.out.println(bus.getSpeedMax());
        System.out.print(bus.getName() + " ");
        System.out.println(bus.getAge() + " ");
        System.out.println(bus.getNumberOfPass());

        bus.passengers();
        bus.movement();
        bus.movement2();
        bus.turn();
        bus.turn2();
        bus.signal();

        System.out.println("  ");

        SportCar sportCar = new SportCar("Ламборджини", 2018, "Красный", 420, "Илья", 25);
        System.out.println(sportCar.getBrand());
        System.out.println(sportCar.getYear());
        System.out.println(sportCar.getColour());
        System.out.println(sportCar.getSpeedMax());
        System.out.print(sportCar.getName() + " ");
        System.out.println(sportCar.getAge() + " ");

        sportCar.movement();
        sportCar.movement2();
        sportCar.turn();
        sportCar.turn2();
        sportCar.signal();
        sportCar.speed();
        sportCar.people();
    }
}
