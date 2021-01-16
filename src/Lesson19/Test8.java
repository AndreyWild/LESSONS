package Lesson19;

public class Test8 {
    public static void main(String[] args) {
        int [] array = {0, 6, 4, 1};
        for (int i = 0; i < array.length; i++){
            array[i] = 3;
        }

        // foreach loop не может менять значения примитивных типов данных
//        for (int a : array){
//            a = 3;
//        }

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

    }
}
