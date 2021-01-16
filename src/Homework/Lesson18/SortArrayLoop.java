package Homework.Lesson18;

public class SortArrayLoop {
    public static int [] sortirovka(int [] array){
            int min = array[0];
            int minId = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            // замена
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        return array;
    }
}

class SortArrayLoopTest{
    public static void main(String[] args) {
        int list [] = {-5, 24, 3, 8, 8, 2, 10, 9};
        int list2 [] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        int listSort [] = SortArray.sortirovka(list2);
        for(int i = 0; i < listSort.length; i++){
            System.out.print(listSort[i] + " ");}
    }
}