package Lesson21;

public class Test6 {

    public void abc (int a, double b){
        System.out.println("privet");
    }

    public void abc (double a, int b){
        System.out.println("poka");
    }

    public static void main(String[] args) {
        Test6 t = new Test6();
        t.abc(1D, 2); // без указания конкретного типа D,
        // компилятор выдавал бы ошибку, т.к. не знает какое из чилел int, а какое double
    }
}
