package Lesson21;

public class Test2 {
    Test2(){System.out.println("Eto konstruktor");
    }

    void Test2(){ // т.к. есть return тип, значит это метод!!!
        System.out.println("Eto metod");
    }

//    int Test2 = 5;
    Test2 Test2; // создал переменную Test2 типа Test2
}

class A{
    public static void main(String[] args) {
        Test2 t = new Test2();
    }
}
