package Lesson3;

public class Test2 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("a="+!a);
        System.out.println("b="+!b);

        int c = 10;
        int d = 5;
        boolean f = c > d;
        boolean f1 = !(c > d);

        System.out.println(f);
        System.out.println(f1);

        int a1 = 10;
        int b1 = 50;
        int c1 = 0;
        int d1 = 100;

        boolean e1 = a1<b1 && c1==d1; // a1<b1=true && c1==d1=false = false
        System.out.println(e1);

        int x = 19;
        int y = 5;
        System.out.println(x|y);

        boolean bo1 = true;
        boolean bo2 = true;
        boolean bo3 = true;
        boolean bo4 = true;
        boolean result2 = bo1^bo2^bo3^bo4;

        System.out.println("значение bo1^bo2^bo3^bo4="+result2);


    }
}
