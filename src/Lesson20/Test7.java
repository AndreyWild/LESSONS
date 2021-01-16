package Lesson20;

import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        ArrayList <StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);
        ArrayList <StringBuilder> list2 = (ArrayList<StringBuilder>) list1.clone();
        // создали новый объект ArrayList(list2) который ссылается на те же объекты StringBuilder list1
        // но это клон объекта list1, поэтому list1 != list2!!!!!
        System.out.println(list1 == list2); // false
        ArrayList <StringBuilder> list3 = list1;
        System.out.println(list1 == list3);

        System.out.println(list1.get(0) == list2.get(0));


    }
}
