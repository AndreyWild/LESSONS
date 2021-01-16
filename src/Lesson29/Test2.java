package Lesson29;

public class Test2 {
    public static void main(String[] args) {
        Car c = Car.createCar(); // создаем объект при помощи метода
    }
}

class Car{
    private Car() {} // т.к. конструктор private, нельзя создать объект класса
    static Car createCar(){ // но можно это сделать благодаря методу который возвращает объект класса
        return new Car();
    }
}