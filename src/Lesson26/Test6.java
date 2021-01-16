package Lesson26;


public class Test6 {
    { System.out.println("Eto init block 3"); }

    Test6() { System.out.println("Eto konstruktor 1 "); }

    Test6(int a) {
        this();
        System.out.println("Eto konstruktor 2 "); }

    { System.out.println("Eto init block 1"); }

    static { System.out.println("Eto STATIC init block 1"); }

    { System.out.println("Eto init block 2"); }

    static { System.out.println("Eto STATIC init block 2"); }

    public static void main(String[] args) {
        Test6 t1 = new Test6();
        System.out.println();
        Test6 t2 = new Test6(5);
    }
}
