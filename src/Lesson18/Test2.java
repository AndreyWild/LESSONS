package Lesson18;

public class Test2 {
    public static void main(String[] args) {
        // объявление(определение) массива
        int [] array1; // список притивных типов данных
        String [] array2; // список ссылочных типов данных
        double [][] array3;
        int [][] array10;
        double [] array5;
        double [] array7;


        // размещение массива о бъявление его длины
        array1 = new int[8];
        array2 = new String[3];
        array3 = new double[4][2];
        array10 = new int [3][];
        array5 = new double[2];
        array7 = new double[2];

        System.out.println(array1.length); // length это переменная(атрибут класса) - длина массива

        // статическая инициализация
        array2[0] = "Привет";
        array2[1] = "Пока";
        array2[2] = "ok";

        array3 [0][0] = 3.14;
        array3 [2][1] = 3.14;
        array3 [1] = array5; // присвил значения из другого массива

        array5 [0] = 2.5;
        array5 [1] = 3.5;

        array7 = array5;
    }
}
