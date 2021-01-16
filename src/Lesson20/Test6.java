package Lesson20;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(new String("poka"));
        list.add(new String("privet"));
        list.add(new String("ok"));
        list.add(new String("hello"));

        for (String sb : list) {
            System.out.print(sb + " ");
        }
        System.out.println(list.indexOf("poka"));
        // найдет индекс = 0, т.к. сравнил два объекта String с одинаковым значением

    }
}