package Homework.Lesson17;

public class NewClass {

    public static boolean ravenstvo(StringBuilder st1, StringBuilder st2){
        boolean result;
//        // Если длинна строк одинаковая
//        if (st1.length() == st2.length())
//            // Если значения String равны метод equals
//            if (st1.substring(0).equals(st2.substring(0))){
//                result = true;
//            } else {
//                result = false;
//            }
//        else {
//            result = false;}
//        return result;
//    }

        // Если длинна строк и значения String равны.
        if (st1.length() == st2.length() && st1.substring(0).equals(st2.substring(0))){
            result = true;}
        else {
            result = false;
        }
        return result;
    }


    public static void main(String[] args) {
        StringBuilder st1 = new StringBuilder("Hello");
        StringBuilder st2 = st1;
        StringBuilder st3 = new StringBuilder("hello");
        StringBuilder st4 = new StringBuilder("Hellq");
        StringBuilder st5 = new StringBuilder("Hello");

        System.out.println(ravenstvo(st1, st2));
        System.out.println(ravenstvo(st1, st3));
        System.out.println(ravenstvo(st1, st4));
        System.out.println(ravenstvo(st1, st5));
    }
}
