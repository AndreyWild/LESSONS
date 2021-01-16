package Lesson22;

public class Test4 {
}

class Human3 {

    Human3(String n){ // обращение 3, т.к. у прошлого конструктора super("Petja") - String обращение 3
        this(n,null);
    }

    Human3(String n, String s){ // обращение 4, т.к. у прошлого конструктора ссылка на n -
        // затем робращение к OBJEKT и все в обратном порядке
        name = n;
        surname = s;
    }

    String name;
    String surname;
}

class Student2 extends Human3 {
    Student2(){ // обращение 1, т.к. у объекта нету агрументов
        this(5);
        System.out.println("Hello");
    }

    Student2(int i){ // обращение 2, т.к. у конструктора выше вторая строка int
        super("Petja");
    }

    public static void main(String[] args) {
        Student2 s2 = new Student2();

    }
}
