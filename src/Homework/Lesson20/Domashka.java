package Lesson20;

import java.util.ArrayList;
import java.util.Collections;

public class Domashka {

    public static ArrayList abc(String ... s){ // Создаем метод с N-количеством параметра String
        ArrayList <String> list1 = new ArrayList<>(); // Создаем пустой ArrayList
        for (String s1 : s){ // используя метод foreach перебирать String s1 из s
            if (!list1.contains(s1)){ // сравнили значения объектов методом contains(), если объекты не равны
                list1.add(s1);}} // то добавить с список
        /*
        1.) s1 = "B"; s = {"B", "B", "A", "C", "1", "3", "2"}
                если "B" не равна одному из значений списка list1 -> true
                    то добавить в список
        2.) s1 = "B"; s = {"B", "B", "A", "C", "1", "3", "2"}
                если "B" не равна одному из значений списка list1 -> false, т.к. "B" уже есть

           ...
         */

    Collections.sort(list1); // отсортировали список методом Collections.sort()
        System.out.println(list1);
    return list1;
    }

    public static void main(String[] args) {
        abc("B", "B", "A", "C", "1", "3", "2", "B");



    }

}
