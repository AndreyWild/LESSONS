package Lesson5;

public class Human {

    String name;
    Car5 car;
    BankAccount bA;

    void info(){
        System.out.println("Имя: " + name + " Цвет машины: " + car.color + " Баланс банковского счета: "+
                bA.balance);
    }
}

class HumanTest {
    public static void main(String[] args) {
        Human human = new Human();
        human.name = "Андрей";
        human.car = new Car5("Желтая", "V8");
        human.bA = new BankAccount(824, 5000);
        human.info();

    }
}


class Car5{
    Car5(String c, String e){
        color = c;
        engine = e;
    }
    String color;
    String engine;
}

class BankAccount{
    BankAccount(int id2, double balance2){
        id = id2;
        balance = balance2;
    }

    int id;
    double balance;
}