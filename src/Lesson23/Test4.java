package Lesson23;

public class Test4 {
    void abc(Animal a){ System.out.println("A");}
    void abc(Mouse m){ System.out.println("M");}

    public static void main(String[] args) {
        Test4 test4 = new Test4(); // A
        Animal animal = new Mouse(); // Mouse

        test4.abc(animal);
        animal.getName();
    }
}

class Animal{
    void getName(){
        System.out.println("Animal");
    }
}
class Mouse extends Animal{
    void getName(){
        System.out.println("Mouse");
    }
}