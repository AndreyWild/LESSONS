package Lesson20;

import java.util.ArrayList;



public class Test4 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("poka"); // добавление элемента в конец списка
        list.add("privet");
        list.add("ok");
        list.add(1,"hello");
        ArrayList <String> list1 = new ArrayList<>();
        list1.add("Petrov");
        list1.add("Sidorov");
        list.addAll(list1); // добавляет в конец другой Arraylist
        list.addAll(1, list1); // добавляет Arraylist начиная с указанного индекса

        for(String s : list){
            System.out.print(s + " ");
        }

        for(String s : list1){
            System.out.print(s + " ");
        }
         list.clear(); // очистка указанного списка
    }
}
