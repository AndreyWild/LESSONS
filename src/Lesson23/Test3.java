package Lesson23;

public class Test3 {
    public static void main(String[] args) {
        Emploeey1 e = new Teacher1();
        e.eat();



//        Emploeey1 e = new Emploeey1();
//        e.eat();
//        Teacher1 t = new Teacher1();
//        t.eat();
    }
}

class Eda{}
class Frukty extends Eda{}

class Emploeey1{
    String name;
    double salary = 100;
    int age;
    int experience;

    Eda eat(){
        Eda e = new Eda();
        System.out.println("Kushaet rabotnik");
        return e;
    }
    void sleep(){
        System.out.println("Spat'");}
}

class Teacher1 extends Emploeey1 {
    int amountStudents;

    Frukty eat(){
        Frukty f = new Frukty();
        System.out.println("Kushaet Teacher");
        return f;
    }

    void teach(){
        System.out.println("Uchit'");}
}
// Методы Eda и Frukty является перезаписанным т.к. методы родительского и дочернего класса имеют одинаковые
// параметры, разные return type, НО Eda это Parent класс класса Frukty

class A{
    Emploeey1 objectCreation(){
        return new Emploeey1();
    }
}

class B extends A{
    H objectCreation(){
        System.out.println("ok");
        return new H();
    }
}

class H extends Teacher1{}