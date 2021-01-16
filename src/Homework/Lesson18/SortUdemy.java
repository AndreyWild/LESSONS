package Homework.Lesson18;

public class SortUdemy {
    public static int [] sortirovka(int [] array){
        int a;
        for (int i = 0; i <array.length; i++){
            int min = array[i];
            int index = i;
            for (int j = i + 1;j < array.length; j++){
                if (array[j] < min){
                min = array[j];
                index = j;
                }
            }
            if (i != index){
                a = array[i];
                array[i] = min;
                array[index] = a;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int list [] = {-5, 24, 3, 8, 8, 2, 10, 9};
        int list2 [] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        int listSort [] = SortArray.sortirovka(list);
        for(int i = 0; i < listSort.length; i++){
            System.out.print(listSort[i] + " ");}
    }
}
