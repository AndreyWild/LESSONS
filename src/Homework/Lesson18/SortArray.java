package Homework.Lesson18;

import java.util.Arrays;

public class SortArray {

    public static int [] sortirovka(int [] array){
        Arrays.sort(array);
//        for(int i = 0; i < array.length; i++){
//            System.out.print(array[i] + " ");
//        }
        return array;
    }
}

class TestSortArray{
    public static void main(String[] args) {
        int list [] = {-5, 24, 3, 8, 8, 2, 10, 9};
        int list2 [] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        int listSort [] = SortArray.sortirovka(list2);
        for(int i = 0; i < listSort.length; i++){
            System.out.print(listSort[i] + " ");}
    }
}