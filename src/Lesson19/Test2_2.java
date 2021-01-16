package Lesson19;

public class Test2_2 {
    static void summa (int ... a){ // можно было (int [] a)
        int summa = 0;
        for (int i = 0; i < a.length; i++){
            summa += a[i];
        }
        System.out.println(summa);
    }                                      //это varargs - он может быть только один и должен стоять последним
    static void summa (String s, String s1, int ... a){  // можно и так
        int summa = 0;
        for (int i = 0; i < a.length; i++){
            summa += a[i];
        }
        System.out.print(s);
        System.out.print(s1);
        System.out.println(summa);
    }
    static void summa (String s, int [] a, String s1){ // если вместо varargs список, можно вставлять в середину
        int summa = 0;
        for (int i = 0; i < a.length; i++){
            summa += a[i];
        }
    }


    public static void main(String[] args) {
        summa(1, 2, 3, 4 ,5, 6, 7, 8, 9, 10); // тогда summa(new int []{3, 4, 8})
        summa("Сумма"," чисел: ",1, 2, 3, 4 ,5, 6, 7, 8, 9, 10);
    }
}
// varargs при компиляции преобразовывается в список, поэтому нельзя делать два overloaded метода
// один только с varargs, а второй только с массивом