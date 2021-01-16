package Lesson26;

public class Test7 {
    int a = 3; // шаг 1

    public Test7() {
        a = 4; // шаг 3
    }
    {a = 5;} // шаг 2

//    public static void main(String[] args) {
//        Test7 t = new Test7();
//        System.out.println(t.a); // 4
//    }
}

class A{
    static final int b; // static константа определяется при создании, но

    static {b = 10;} // можно ее определять и внутри static initializer'a
}

class C{
    String s = "ok"; // шаг 4
    {System.out.println(s);} // шаг 5
    static int i = 0; // шаг 1
    static {System.out.println(i);} // шаг 2
    static {i = i + 1; System.out.println(i);} // шаг 3

    C() {System.out.println("Eto konstruktor");}

    public static void main(String[] args) {
        C c = new C();
    }
}

class D{
    static {abc(2);}                                // шаг 1
    static void abc(int a){System.out.println(a+"");}  // шаг 2
    public D() {abc(5);}                            // шаг 7
    static {abc(4);}                                // шаг 3
    {abc(6);}                                       // шаг 5
    static {new D();}                                  // шаг 4
    {abc(8);}                                       // шаг 6

    public static void main(String[] args) {

    }
}