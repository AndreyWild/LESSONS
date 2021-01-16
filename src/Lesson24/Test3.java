package Lesson24;

public class Test3 {
    public static void main(String[] args) {
        Help_able h = new Driver(); // т.к. Help_able имплиментирован в класс Driver
        Swim_able s = new Driver();
        Employee e = new Driver();
        System.out.println(h.a);
    }
}

class Employee{
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;
    void eat(){
        System.out.println("Kushat'");}
    void sleep(){
        System.out.println("Spat'");}
}

class Driver extends Employee implements Help_able, Swim_able{
    String carBrand;
    void drive(){
        System.out.println("Vodit'");}
    public void pomosh(){
        System.out.println("Driver Pomogaet");
    }
    public void tyshitPojar(){
        System.out.println("Driver tyshit Pojar");
        System.out.println(a); // взял переменную из interface Help_able
    }
    public void swim(){
        System.out.println("Driver plavaet");
    }
}

class Teacher extends Employee implements Help_able{
    int amountStudents;
    void teach(){
        System.out.println("Uchit'");}
    public void pomosh(){
        System.out.println("Teacher Pomogaet");
    }
    public void tyshitPojar(){
        System.out.println("Teacher tyshit Pojar");
    }
}


interface Help_able{ // интерфейс может содержать только абстрактные методы!!!
    void pomosh();  // все методы в интерфейсе public
    void tyshitPojar();
    public final static int a = 10; // переменые в interface всегда (CONSTANT) public final static
}

interface Swim_able{
    void swim();
}