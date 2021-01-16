package Lesson27;

public class Test1 {
    public static void main(String[] args) {
        Animal an = new Tiger();
        System.out.println(an.a); // 5
        System.out.println(an.b); // 10
        an.abc(); // non-static metod iz klassa Tiger
        an.def(); // static metod iz klassa Animal

    }
}

class Animal {
    int a = 5;
    static int b = 10;
    void abc (){System.out.println("non-static metod iz klassa Animal");}
    static void def(){System.out.println("static metod iz klassa Animal");}
}

class Tiger extends Animal {
    int a = 15;
    static int b = 20;
    void abc (){System.out.println("non-static metod iz klassa Tiger");}
    static void def(){System.out.println("static metod iz klassa Tiger");}
}