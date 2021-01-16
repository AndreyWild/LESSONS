package Lesson9;

public class Car {
    String color;
    String engine;
    static int count;
    public static int a = 10;

    public Car(String color, String engine){
        count++;
        this.color = color;
        this.engine = engine;
    }
    public void showColor(){
        System.out.println("Цвет машины: " + "color");
        this.changeColor("red");
    }

    public void changeColor(String color3){
        System.out.println("Цвет машины изменился");
        int price = 500;
        color = color3;
        price += 1000;
    }

    public void changeColor1(String color){}
}
