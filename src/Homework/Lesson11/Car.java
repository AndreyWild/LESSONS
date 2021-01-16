package Homework.Lesson11;

public class Car {

    public String color;
    String engine;
    int dorCount;

    Car(String color, String engine, int dorCount){
        this.color = color;
        this.engine = engine;
        this.dorCount = dorCount;
    }
}

class CarTes{

    void changeDorCount(Car c, int numbDors){
        c.dorCount = numbDors;
    }

    void changeColor(Car c1, Car c2){
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }

    public static void main(String[] args) {
        CarTes ct = new CarTes();
        Car car1 = new Car("White", "V6", 4);
        Car car2 = new Car("Black", "V8", 2);
        ct.changeDorCount(car1, 8);
        ct.changeColor(car1, car2);
        System.out.println("Информация о первой машине: Цвет: "+car1.color + " Мотор: "+ car1.engine + " Количество дверей: "+ car1.dorCount);
        System.out.println("Информация о первой машине: Цвет: "+car2.color + " Мотор: "+ car2.engine + " Количество дверей: "+ car2.dorCount);
    }

}