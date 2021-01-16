package Lesson4;

public class Test25 {
    // Без static main не прочтет переменную.
    static int b = 20;
    static byte b2 = -5;
    static char b3 ='a';

    static String s = "privet";

    public static void main(String[] args) {
        int a = 10;
        System.out.println(b);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(s);
    }
}
