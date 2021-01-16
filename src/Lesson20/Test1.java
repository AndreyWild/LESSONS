package Lesson20;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Privet");
        Car c = new Car();
        list.add(c);
        Student s = new Student();
        list.add(s);
        list.add(new StringBuffer("ok"));


        ArrayList <String> list2 = new ArrayList <> ();
        list2.add("privet");
        list2.add("poka");

        ArrayList <StringBuilder> list3 = new ArrayList <> ();

        ArrayList <String> list5 = new ArrayList <> (list2);

        List <StringBuilder> list4 = new ArrayList <> ();
        list4.add(new StringBuilder("ok"));




        System.out.println(list);
        System.out.println(list2);

    }
}
class Car {}
class Student{}

// ArrayList по-default на 10 позиций
// В ArrayList нельзя добавлять примитивы , но можно их wrapper int -> Integer
//    byte	Byte
//    short	    Short
//    int	    Integer
//    long	    Long
//    float	    Float
//    double	Double
//    boolean	Boolean
//    char	    Character