package Lesson5;

import Lesson4.Car;

public class Car3 {
    Car3(String cvet, String motor){
        color = cvet;
        engine = motor;

        System.out.println("Цвет машины: " + color);
        System.out.println("Мотор машины: " + engine);


    }

    String color;
    String engine;
}

class CarTest{
    public static void main(String[] args) {
        Car3 car1 = new Car3("Оранж", "V8");
//       System.out.println(car1.color);
//       System.out.println(car1.engine);
        Car3 car2 = new Car3("Зеленый", "V12");
    }
}