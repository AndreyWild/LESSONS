package Lesson12;

public class Car {
    int engine;
    int dorCount;

    Car(int engine, int dorCount){
        this.engine = engine;
        this.dorCount = dorCount;
    }
}
class CarTest{
    public static void main(String[] args) {
        Car car1 = new Car(3, 4);
        Car car2 = new Car(2, 5);

        if (car1.engine > car2.engine) {
            if (car1.dorCount > car2.dorCount){
                System.out.println("Мощность мотора и количество дверей у первой машины больше чем у второй");}
            else {
                System.out.println("Мощность мотора у первой машины больше, а количество дверей меньше");
        }}
        else {
            System.out.println("Мощность мотора у первой машины меньше");
        }
    }
}