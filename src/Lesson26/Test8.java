package Lesson26;

public class Test8 {
    public static void main(String[] args) {
//        Animal a = new Animal();
        Lion l = new Lion();

    }
}

class Animal{
    // Порядок 5
    public Animal() {System.out.println("Constructor of Animal");}
    // Порядок 1
    static {System.out.println("Static init in Animal");}
    // Порядок 4
    {System.out.println("Non-Static init in Animal");}
}

class Mammal extends Animal{
    // Порядок 7
    public Mammal() {System.out.println("Constructor of Mammal");}
    // Порядок 2
    static {System.out.println("Static init in Mammal");}
    // Порядок 6
    {System.out.println("Non-Static init in Mammal");}
}

class Lion extends Mammal{
    // Порядок 9
    public Lion() {System.out.println("Constructor of Lion");}
    // Порядок 3
    static {System.out.println("Static init in Lion");}
    // Порядок 8
    {System.out.println("Non-Static init in Lion");}
}

