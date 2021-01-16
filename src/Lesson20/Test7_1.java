package Lesson20;

import java.util.ArrayList;

public class Test7_1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);
        ArrayList <StringBuilder> list2 = (ArrayList<StringBuilder>) list1.clone();
        // создали новый объект ArrayList(list2) который ссылается на те же объекты StringBuilder list1
        // но это клон объекта list1, поэтому list1 != list2!!!!!

//        System.out.println(list1.get(0) == list2.get(0));
        list1.get(0).append("!!!"); // добавил к нулевому оъекту list1 "!!!"
        System.out.println(list2.get(0)); // вывел значение нулевого оъекта list2, А!!!

        list1.set(0, new StringBuilder("D")); // присвоил 0 значению list1 объект "D",
        // при этом 0 значение list2 все еще ссылается на объект А!!!
        System.out.println(list1.get(0));
        System.out.println(list2.get(0));


    }
}
