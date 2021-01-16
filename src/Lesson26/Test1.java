package Lesson26;

public class Test1 {
    public static void main(String[] args) {
        Car c1 = new Car("Red", "V4");
        Car c2 = new Car("Red", "V4");
        Car c3 = new Car("Black", "V8 ");
        System.out.println(c1.equals(c2)); // после перезаписи объекта выдает True
        System.out.println(c1); // используем перезаписанный метод toString
    }
}

class Car {
    String color;
    String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    // перезаписываем метод equals
    public boolean equals(Object obj) {
        if (obj instanceof Car) { // если (объект является объектом класса Car)
            Car c2 = (Car) obj; // кастим объект obj на Car
            return (color.equals(c2.color) && engine.equals(c2.engine)); // сравниваем парамерты
        } else {
            return false;
        }
    }

    @Override
    public String toString() { // перезапись метода toString
        return "Mashina cveta " + color + " i s motorom " + engine;
    }
}