package Lesson19;

public class Test10 {
    public static void main(String[] args) {
        int [] array1 = {3, 1, -2, 0};
        int [] array2 = {-9, 1, 5, 2};

        // через foreach невозможно в одном цикле работать более чем с одним массивом
        for(int i = 0; i < array1.length && i < array2.length; i++){
            array1[i] = 12;
            array2[i] = 3;
        }




    }
}
