package Homework.Lesson24;


public class DZ {
    public static void main(String[] args) {
        Mechenosec mechenosec = new Mechenosec("Bob");
        System.out.println(mechenosec.name);
        mechenosec.eat();
        mechenosec.swim();
        mechenosec.slep();

        Speakable pingvin = new Pingvin("Piggy");
        pingvin.speak();

        Amimal lev1 = new Lev("Leone");
        System.out.println(lev1.name);
        lev1.eat();
        lev1.slep();

        Mammal lev = new Lev("Leon");
        System.out.println(lev.name);
        lev.run();
        lev.eat();
        lev.slep();
        lev.speak();
    }
}
abstract class Amimal{

    Amimal(String name){
        this.name = name;
    }
    String name;

    abstract void eat();
    abstract void slep();
}

abstract class Fish extends Amimal{

    Fish(String name){
        super(name);
        this.name = name;
    }
    public void slep(){System.out.println("Vsegda interesno nablydat, kak spyat ribi");}
    abstract void swim();
}

abstract class Bird extends Amimal implements Speakable{

    Bird(String name){
        super(name);
        this.name = name;
    }
    abstract void fly();
    public void speak(){System.out.println(name + "sings");}
}

abstract class Mammal extends Amimal implements Speakable{

    Mammal(String name){
        super(name);
        this.name = name;
    }
    abstract void run();
}

interface Speakable{
    default void speak(){System.out.println("Somebody speaks");}
}

class Mechenosec extends Fish{
    Mechenosec(String name){
        super(name);
        this.name = name;
    }
    void swim(){System.out.println("Mechenosec krasivaja ryba, kotoraja bystro plavaet!");}
    void eat(){System.out.println("Mechenosec ne hishnaja ryba, i ona est obichnyj rybij korm!");}
}

class Pingvin extends Bird{

    Pingvin(String name){
        super(name);
        this.name = name;
    }

    void eat(){System.out.println("Pingviny lubjat est rybu!");}
    void slep(){System.out.println("Pingviny spjat prizhavshis drug k drugu!");}
    void fly(){System.out.println("Pingviny ne umejut letat'");}
    public void speak(){System.out.println("Pingviny ne umejut pet' kak solov'i!");}
}

class Lev extends Mammal{

    Lev(String name){
        super(name);
        this.name = name;
    }

    void eat(){System.out.println("Lev kak luboj hishnik lubit st' mjaso.");}
    void slep(){System.out.println("Bolshuju chast' dnja Lev spit.");}
    void run(){System.out.println("Lev - eto ne samyj bystryj hishnik.");};
}

