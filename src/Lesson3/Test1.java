package Lesson3;

public class Test1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 5;

        boolean b1 = a > b;
        boolean b2 = a >= b;
        boolean b3 = b >= c;
        boolean b4 = b == c;
        boolean b5 = b != c;

        System.out.println(a > b);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);

        boolean x = true;
        boolean y = false;
        boolean z = true;
        boolean result = x && y && z;
        boolean result2 = x || y || z;

        System.out.println("result ="+result);
        System.out.println("result2 ="+result);

        boolean x1 = true;
        boolean y1 = true;
        boolean z1 = true;
        boolean result1 = x1 && y1 && z1;
        boolean result3 = x || y || z;

        System.out.println("result1 ="+result1);
        System.out.println("result3 ="+result3);
    }
}
