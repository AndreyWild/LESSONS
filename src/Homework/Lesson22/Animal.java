package Homework.Lesson22;

public class Animal {

    public Animal(){System.out.println("I'm animal");}

    int eyes;

    public void eat(){System.out.println("Animal eats");}

    public void drink(){System.out.println("Animal drinks");}
}

class Pet extends Animal{

    Pet(){
        System.out.println("I'm pat");
        eyes = 2;
    }

    String name;
    int tail = 1;
    int paw = 4;

    public void run(){System.out.println("Pet sun");}
    public void jump(){System.out.println("Pet jumps");}
}

class Dog extends Pet{
    Dog(String nameIs){
        this.name = nameIs;
        System.out.println("I'm dog and my name is: " + name);
    }

    public void play(){System.out.println("Dog plays");}
}

class Cat extends Pet{
    Cat(String nameIs){
        this.name = nameIs;
        System.out.println("I'm cat and my name is: " + name);
    }
    public void sleep(){System.out.println("Cat sleeps");}
}

class Test{
    public static void main(String[] args) {
        Dog dog = new Dog("Lucky");
        System.out.println("Количество лап у собаки: " + dog.paw);

        Cat cat = new Cat("Fluffy");
        cat.sleep();
    }
}