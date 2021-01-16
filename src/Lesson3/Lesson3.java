package Lesson3;

public class Lesson3 {
    public static void main(String [] args){
        int a = 3;
        int b = 10;
        System.out.println(a+b);
        System.out.println(b-a);
        System.out.println(a*b);
        System.out.println(b/a);

        int c = a+b;
        System.out.println(c);
        int c1 = b-a;
        System.out.println(c1);
        int c2 = a*b;
        System.out.println(c2);
        int c3 = b/a; // т.к. int это целое число, ответ будет 3, а не 3.33333...
        System.out.println(c3);


        double a1=11;
        double b1=3;
        System.out.println(a1/b1);
        double c4 = a1/b1;
        System.out.println(c4);

        int a2=11;
        int b2=3;
        int celayaChast =a2/b2;
        int ostatok = a2%b2;
        System.out.println(celayaChast);
        System.out.println(ostatok);

        double a3 = 5.5;
        double b3 = 3.5;
        double c5 = a3 % b3;
        System.out.println(a3 % b3);
        System.out.println(c5);

        int x = 5;
        int y = 3;
        int z = x-y;
        int z2 = x - y++; // От х отнимается y, затем y = y +1. z=2
        int z1 = x - ++y; // От х отнимается y+1 z = 5 - (3+1). z=1

        int q = 5;
        q = 5 + 3;
        q += 3; // прибавь к q 3 затем присвой к q.
        q = 5 - 3;
        q -=3; // отними от q 3 затем присвой к q.





    }
}
