package Lesson3;

public class Test3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        int c = ++a - b*2; // 1.)10+1 2.)3*2 3.)11-6=5

        System.out.println(c);

        char d = 'a'; // "a" = 97 в юникоде
        int i = 10;

        System.out.println(d + i);
        System.out.println(i%d);

    }
}
