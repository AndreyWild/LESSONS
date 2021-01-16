package Lesson5;

public class Test20 {

    int summa(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    int sredneeArifm(int a1, int b1, int c1){
        int rsult2 = summa(a1, b1, c1) / 3;
        return rsult2;

    }


}
class Test21 {

    public static void main(String[] args) {
        Test20 t = new Test20();
        int semmaTrexChisel = t.summa(1,2,3);
        System.out.println(semmaTrexChisel);
        //Еще один способ.
        System.out.println(t.summa(5,6,7));

        System.out.println(t.sredneeArifm(2, 5, 9));
    }
}


