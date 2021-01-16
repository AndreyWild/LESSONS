package Lesson16;

public class Test11 {
    public static void main(String[] args) {
        String s1 = new String("ok");
        String s2 = new String("ok");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true, т.к. у них одинаковое содержимое ok и ok

        String s3 = "privet";
        String s4 = "privet";
        System.out.println(s3 == s4); // true, т.к. оба ссылаются на один объект String pool'а
        System.out.println(s3.equals(s4)); // true, т.к. у них одинаковая длинна и последовательность char'ов

        System.out.println(s1!=s4); // true

        String s10 = "Kak Dela?";
        String s11 = "Kak dela?";
        System.out.println(s10.equalsIgnoreCase(s11)); // true сравнивает игнорирую регистр
    }
}
