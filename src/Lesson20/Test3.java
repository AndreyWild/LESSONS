package Lesson20;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList <StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("ok");
        StringBuilder sb3 = new StringBuilder("privet");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);

        for(int i = 0; i < list.size(); i++){
            list.get(i).append("!!!"); // get - добавить значение
        }
        for(StringBuilder sb : list){
            System.out.print(sb + " ");
        }
        System.out.println();

        list.remove(2); // удалить по индексу
        list.remove("hello!!!"); // удалить по значению объекта нельзя
        /*
         но если бы list состоял из String объектов и у одного было значение "hello!!!"
         то прошло бы сравнение одного объекта String (hello) с другим объектом String (hello)
         результатом было бы true и первый объект String (hello) удаляется из списка
         */
        list.remove(sb1); // но омжно удалить сам объект

        for(StringBuilder sb : list){
            System.out.print(sb + " ");
        }






    }


}
