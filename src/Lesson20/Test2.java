package Lesson20;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList <>();
        list.add("poka"); // добавление элемента в конец списка
        list.add("privet");
        list.add("ok");
        list.add(1,"hello"); // добавление элемента в указанный индекс
        for(String s : list){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(list.get(3)); // печать определенного индекс элемента

        for(int i =0; i < list.size(); i++){
            System.out.println(list.get(i)); // вывод элеметов спика через for
        }


        list.set(1, "Bye"); // меняет значение элемента с указанным индексом
        System.out.println(list);
    }
}
