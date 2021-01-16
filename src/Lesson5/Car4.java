package Lesson5;



public class Car4 {
    void Car4(String cvet, String motor){
        color = cvet;
        engine = motor;

        System.out.println("Цвет машины: " + color);
        System.out.println("Мотор машины: " + engine);


    }

    String color;
    String engine;
}

class CarTest2{
    public static void main(String[] args) {
        Car4 car1 = new Car4();
//       System.out.println(car1.color);
//       System.out.println(car1.engine);
        Car4 car2 = new Car4();
    }
}

